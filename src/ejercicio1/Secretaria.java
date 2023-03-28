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
				.toList();
	}
	
	public void mostrarAlumno1 () {
		listaAlumnos.forEach(a -> System.out.println(a));
	}
	
	public void amostrarAlumno2() {
		listaAlumnos.stream()
		.forEach(System.out::println);
	}
	
	public List<Alumno> nombreEmpiezaPor (char letra){
		return listaAlumnos.stream()
		.filter(a->a.getNombre().charAt(0)==letra)
		.collect(Collectors.toList());
	}
	
	public List<Alumno> nombreEmpiezaPor2 (String letra){
		return listaAlumnos.stream()
		.filter(a->a.getNombre().toUpperCase().equalsIgnoreCase(letra.toUpperCase()))
		.toList();
	}
	
	public int nAlumnos() {
		return listaAlumnos.size();
	}
	
	public long nAlumnos2() {
		return listaAlumnos.stream()
				.count();
	}
	
	public List<Alumno> notaMayor9 (String curso){
		return listaAlumnos.stream()
				.filter(a->a.getNombreCurso().equalsIgnoreCase(curso))
				.filter(a->a.getNotaMedia()>9)
				.toList();
	}
	
	public void mostrarAlumnoMas9 (String curso){
		notaMayor9(curso).stream()
		.toList()
		.forEach(System.out::println);
	}
	
	public List<Alumno> tresPrimeros () {
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
