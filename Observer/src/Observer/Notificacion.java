package Observer;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Notificacion extends Listener{
	
	public Notificacion(Manager m) {
		this.observador = m;
		this.observador.add(this);
		
	}

	@Override
	public void update() {
		System.out.println("La pantalla cambió a color: "+observador.getStatus());
		mostrarNotificacionPantalla();
	}

	public void mostrarNotificacionPantalla() {
		Alert notificacion = new Alert(AlertType.INFORMATION);
		notificacion.setTitle("Cambio");
		notificacion.setContentText("La ventana cambio a color:"+observador.getStatus());
		notificacion.showAndWait();
		
	}
}
