package ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Secretaria {

	private List <Alumno> listaAlumnos;
	
	
	
	public Secretaria(List<Alumno> listaAlumnos) {		
		this.listaAlumnos = listaAlumnos;
	}
	
	



	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}





	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}



	


	@Override
	public String toString() {
		return "Secretaria [listaAlumnos=" + listaAlumnos + "]";
	}
	

	public List<Alumno> alumnoNombre (String nombre) {
		return listaAlumnos.stream()
				.filter(a->a.getNombre().equalsIgnoreCase(nombre))
				.distinct()
				.collect(Collectors.toList());
	}
	
	public void alumnoNombre2 () {
		listaAlumnos.forEach(a -> System.out.println(a));
	}
	
	public List<Alumno> nombreEmpiezaPor (String letra){
		return listaAlumnos.stream()
		.filter(a->a.getNombre().startsWith(letra))
		.collect(Collectors.toList());
	}
	
	public int nAlumnos() {
		return listaAlumnos.size();
	}
	
	public List<Alumno> notaMayor9 (String curso){
		return listaAlumnos.stream()
				.filter(a->a.getNombreCurso().equalsIgnoreCase(curso))
				.filter(a->a.getNotaMedia()>9)
				.collect(Collectors.toList());
	}
	
	public List<Alumno> tresPrimeors () {
		return listaAlumnos.stream()
		.limit(3)
		.collect(Collectors.toList());
	}
	
	public void menorEdad () {
		listaAlumnos.stream()
		.min((a,b) -> a.getEdad()>b.getEdad()?1:(a.getEdad()<b.getEdad()?-1:0))
		.get();
	}
	
	public void primerAlum () {
		listaAlumnos.stream()
		.findFirst()
		.get();
	}
}
