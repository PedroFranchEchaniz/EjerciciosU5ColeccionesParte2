package ejercicio1;

public class Alumno {

	private String nombre;
	private String apellido;
	private String nombreCurso;
	private double notaMedia;
	private int edad;
	
	public Alumno(String nombre, String apellido, String nombreCurso, double notaMedia, int edad) {		
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreCurso = nombreCurso;
		this.notaMedia = notaMedia;
		this.edad = edad;
	}

	public Alumno() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nombreCurso=" + nombreCurso + ", notaMedia="
				+ notaMedia + ", edad=" + edad + "]";
	}
	
	
	
	
}
