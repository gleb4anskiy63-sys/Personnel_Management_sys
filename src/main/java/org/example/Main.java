package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Создаем простую надпись
        Label label = new Label("Система управления персоналом готова к работе!");

        // Кладем её в контейнер по центру
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 600, 400);

        // Настраиваем и показываем окно
        stage.setTitle("Personnel Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Этот метод запускает всё приложение JavaFX
    }
}