package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno ("Ana", "Garcia", "DAM", 10, 20);
		Alumno a2 = new Alumno ("Luis", "Garcia", "DAM", 8.25, 19);
		Alumno a3 = new Alumno ("Luis", "Fernzandez", "DAM", 0, 29);
		Alumno a4 = new Alumno ("Angel", "Lopez", "DAW", 9.5, 30);
		
		List <Alumno> listado = new ArrayList <Alumno>();
		
		listado.add(a4);
		listado.add(a3);
		listado.add(a2);
		listado.add(a1);
		
		Secretaria sec = new Secretaria (listado);
		
		
		System.out.println(sec.alumnoNombre("Luis"));
		sec.alumnoNombre2();
		
		System.out.println(sec.nombreEmpiezaPor("A"));
		
		System.out.println(sec.nAlumnos());
		
		System.out.println(sec.notaMayor9("DAM"));
		
		System.out.println(sec.tresPrimeors());
		
		sec.menorEdad();
	}
	
	
}
