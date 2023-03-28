package ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder aerolinea = new StringBuilder ("Iberia");
		StringBuilder aerolinea2 = new StringBuilder ("RayAnair");
		StringBuilder aerolinea3 = new StringBuilder ("FranciaAir");
		
		Vuelo v1 = new Vuelo (LocalDateTime.now(), LocalDateTime.of(28-03-2023, 02,00,00));
		
		v1.asignarCodigo(aerolinea);
		
		System.out.println(v1);
	}

}
