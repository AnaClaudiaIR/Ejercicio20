package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//import java.awt.*;
//import java.awt.TextField; --> No se necesitan estos imports
import javafx.scene.control.*;

import java.util.Optional;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
       primaryStage.setTitle("Ventana Principal");

       Button botonVentanaSecundaria = new Button("Abrir ventana secundaria");
       botonVentanaSecundaria.setOnAction(e -> {mostrarDialogoConfirmacion();}); //Llamar al método

       VBox vBox = new VBox(botonVentanaSecundaria);
       Scene scene = new Scene(vBox, 300, 200);
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    //Método para mostrar mensaje de confirmación
    private void mostrarDialogoConfirmacion(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("¿Estás seguro?");
        alert.setContentText("Confirmar acción");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                System.out.println("Acción confirmada");
            } else  {
                System.out.println("Acción cancelada");
            }
        });
    }
}
