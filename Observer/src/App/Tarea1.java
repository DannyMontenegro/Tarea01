/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
/**
 *
 * @author danny
 */
public class Tarea1 extends Application{
	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	launch(args);
    }
    
    public static void pintarColorRojo(Pane pane) {
    	pane.setStyle("-fx-background-color:red;");
    	
    }
    
    public static void pintarColorVerde(Pane pane) {
    	pane.setStyle("-fx-background-color:green;");
    	
    }

    public static void pintarColorAzul(Pane pane) {
    	pane.setStyle("-fx-background-color:blue;");
    	
    }


	@Override
	public void start(Stage primaryStage) {
		Button boton1 = new Button("Color Rojo");
		Button boton2 = new Button("Color Verde");
		Button boton3 = new Button("Color Azul");
		HBox caja = new HBox(boton1,boton2,boton3);
		
		caja.setSpacing(15);
		caja.setAlignment(Pos.CENTER);
		StackPane root = new StackPane();
		root.getChildren().addAll(caja);
		Scene scene = new Scene(root,300,300);
		boton1.setOnAction(e->{
			pintarColorRojo(root);
		});
		
		boton2.setOnAction(e->{
			pintarColorVerde(root);
		});
		boton3.setOnAction(e->{
			pintarColorAzul(root);
		});
		primaryStage.setTitle("Tarea01");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
		
    
}
