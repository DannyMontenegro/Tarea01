package Observer;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public aspect EventManager {
	
	pointcut cambio(): call(* setStyle(String ));

	pointcut añadirAccion(): call(* setStyle(Button,Pane,String));
	
	after(): cambio(){
		System.out.println("Cambiando a color:"+Listener.nuevoColor);
		
	}
	
	before(): añadirAccion(){
		System.out.println("Clase Listener. Añadiendo acción a boton");
		
	}
	
}
