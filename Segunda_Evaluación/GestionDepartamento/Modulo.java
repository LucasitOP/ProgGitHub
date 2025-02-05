package GestionDepartamento;

public enum Modulo {
	PROGRAMACION("Prog",Ciclo.DAW,1),
	ENTORNOS("Entornos",Ciclo.DAW,1),
	SISTEMAS("Sistemas",Ciclo.DAW,1);
	private Ciclo ciclo;
	private String descripcion;
	private int curso;
	private String id;
	
	Modulo( String descripcion,Ciclo ciclo, int curso) {
		this.ciclo=ciclo;
		this.descripcion=descripcion;
		this.curso=curso;
		this.id=curso+"_"+getCiclo()+"_"+descripcion.substring(0,2).toUpperCase();
		//se podria utilizar ciclo.name() para recoger el nombre del ciclo
	}
	public Ciclo getCiclo() {
		return ciclo;
	}
	@Override
	public String toString() {
		return "Id: " + id + ", Descripción: " + descripcion + ", Ciclo: " + ciclo + ", Curso: " + curso;
	}
}
