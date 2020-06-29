package Observer;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Listener> listeners = new ArrayList<>();
	private String status;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String estado) {
		status = estado;
		notificacion();																										
	}
	
	public void notificacion() {
		for(Listener l: listeners) l.update();
	}
	
	public void add(Listener observador) {
		listeners.add(observador);
		
	}
	
	public void remove(Listener observador) {
		
		listeners.remove(observador);
	}
}
