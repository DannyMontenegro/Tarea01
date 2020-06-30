package App;

import Observer.Manager;
import Observer.Notificacion;

public aspect EventManager {
	
	Manager observador = new Manager();
	Notificacion notificacion = new Notificacion(observador);
	
	pointcut Rojo(): execution(* pintarColorRojo(..));
	pointcut Verde(): execution(* pintarColorVerde(..));
	pointcut Azul(): execution(* pintarColorAzul(..));
	pointcut Contador(): execution(* pintar*(..));
	
	after(): Rojo(){
		observador.setStatus("rojo");
	}
	after(): Verde(){
		observador.setStatus("verde");
	}
	after(): Azul(){
		observador.setStatus("azul");
	}
	
	after(): Contador(){
		observador.aumentarContador();
		System.out.println("La pantalla ha cambiado de color "+observador.getContador()+" veces");
	}
}
