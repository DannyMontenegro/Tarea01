package Observer;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public aspect EventManager {
	
	pointcut cambio(): call(* setStyle(String ));

	pointcut a�adirAccion(): call(* setStyle(Button,Pane,String));
	
	after(): cambio(){
		System.out.println("Cambiando a color:"+Listener.nuevoColor);
		
	}
	
	before(): a�adirAccion(){
		System.out.println("Clase Listener. A�adiendo acci�n a boton");
		
	}
	
}
