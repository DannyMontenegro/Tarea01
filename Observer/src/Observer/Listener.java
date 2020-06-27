package Observer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Listener {
	static String nuevoColor;
	public static void setStyle(Button boton,Pane root,String color) {
		
		boton.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {

            nuevoColor = color;
            root.setStyle("-fx-background-color:"+color);
        }
    });
		
	}
	
}