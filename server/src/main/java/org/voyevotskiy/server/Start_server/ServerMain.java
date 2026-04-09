package org.voyevotskiy.server.Start_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("=== БАНКОВСКИЙ СЕРВЕР ЗАПУЩЕН (Порт 8080) ===");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Подключился новый клиент: " + clientSocket.getInetAddress());
                clientSocket.close();
            }
        } catch (IOException e) {
            System.err.println("Ошибка сервера: " + e.getMessage());
        }
    }
}