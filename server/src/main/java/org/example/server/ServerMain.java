package org.example.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("---------------------------------------");
            System.out.println("BANK SERVER: ЗАПУЩЕН И ОЖИДАЕТ...");
            System.out.println("---------------------------------------");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Клиент подключился: " + socket.getInetAddress());

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}