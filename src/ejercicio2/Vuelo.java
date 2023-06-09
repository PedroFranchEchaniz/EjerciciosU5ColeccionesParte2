package ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class Vuelo {

	private String id;
	private LocalDateTime horaSalida;
	private LocalDateTime duracion;
	private LocalDateTime horaLlegada;	


	public Vuelo(LocalDateTime horaSalida, LocalDateTime duracion) {
		super();
		this.horaSalida = horaSalida;
		this.duracion = duracion;
	}	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public LocalDateTime getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(LocalDateTime horaSalida) {
		this.horaSalida = horaSalida;
	}


	public LocalDateTime getDuracion() {
		return duracion;
	}


	public void setDuracion(LocalDateTime duracion) {
		this.duracion = duracion;
	}


	public LocalDateTime getHoraLlegada() {
		return horaLlegada;
	}


	public void setHoraLlegada(LocalDateTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}


	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", horaSalida=" + horaSalida + ", duracion=" + duracion + ", horaLlegada="
				+ horaLlegada + "]";
	}




	public String acortarNombre(String nombreCompania) {
		
		return nombreCompania.subSequence(0, 3).toString();
		
	}
	
	public int generarNumero () {
		Random num = new Random (System.nanoTime());
		return num.nextInt(9999-1000+1)-1000;
	}
	
	public void asignarCodigo (String nombreCompania) {
		StringBuilder newId = new StringBuilder(acortarNombre(nombreCompania));
		newId.append(generarNumero());
		id = newId.toString();
	}
	
	
	
	
}
