package Estudiantes;

public class Estudiantes {
	private String nombre;
	private int edad;
	private int[] calificaciones;
	public Estudiantes(String nombre,int edad,int[]calificaciones) {
		this.nombre=nombre;
		this.edad=edad;
		this.calificaciones=calificaciones;
	}
	public Estudiantes() {

	}

	public Estudiantes(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int[] getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(int[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	public static double media(int[]calificaciones) {
		int divisor=0;
		int sumador=0;
		//Realizamos media
		for (int i=0;i<calificaciones.length;i++) {
			sumador+=calificaciones[i];
			divisor++;
		}
		double media =(double)sumador/divisor;
		return media;
	
	}
	@Override
	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", edad=" + edad + ", media="
				+ media(calificaciones)+ "]";
	}

}
