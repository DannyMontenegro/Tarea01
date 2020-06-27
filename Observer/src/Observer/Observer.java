/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/**
 *
 * @author danny
 */
public class Observer extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	launch(args);
    }

	@Override
	public void start(Stage primaryStage) {
		Button boton1 = new Button("Color Rojo");
		Button boton2 = new Button("Color Verde");
		Button boton3 = new Button("Color Azul");
		HBox caja = new HBox(boton1,boton2,boton3);
		caja.setSpacing(15);
		StackPane root = new StackPane();
		root.getChildren().addAll(caja);
		Scene scene = new Scene(root,300,300);
		boton1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                root.setStyle("-fx-background-color:red");
            }
        });
		boton2.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                root.setStyle("-fx-background-color:green");
            }
        });
		boton3.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                root.setStyle("-fx-background-color:blue");
            }
        });
		
		primaryStage.setTitle("Tarea01");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
    
}
