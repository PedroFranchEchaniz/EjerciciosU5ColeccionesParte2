package ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aerolinea =  ("Iberia");
		String aerolinea2 =  ("RayAnair");
		String aerolinea3 = ("FranciaAir");
		
		Vuelo v1 = new Vuelo (LocalDateTime.now(), LocalDateTime.of(2023, 03, 28, 2, 00));
		Vuelo v2 = new Vuelo (LocalDateTime.now(), LocalDateTime.of(2023, 03, 28, 10, 00));
		Vuelo v3 = new Vuelo (LocalDateTime.now(), LocalDateTime.of(2023, 03, 28, 10, 00));
		Vuelo v4 = new Vuelo (LocalDateTime.now(), LocalDateTime.of(2023, 03, 28, 02, 00));
		
		v1.asignarCodigo(aerolinea);
		v2.asignarCodigo(aerolinea2);
		v3.asignarCodigo(aerolinea3);
		v4.asignarCodigo(aerolinea3);
		
		
		List <Vuelo> listaVuelos = new ArrayList <Vuelo>();
		
		listaVuelos.add(v2);
		listaVuelos.add(v1);
		listaVuelos.add(v3);
		listaVuelos.add(v4);
		
		Aeropuerto ae = new Aeropuerto (listaVuelos);
		
		ae.fechaLlegada(listaVuelos);		
		
		System.out.println(ae.coinciden(ae.filtrarVuelo(v1)));
		
		
		System.out.println(ae);
	}

}
