package Observer;

public aspect EventManager {
	
	pointcut cambio(): call(* setStyle(String ));
	
	after(): cambio(){
		System.out.println("Cambiando a color:"+Listener.nuevoColor);
		
	}
}
