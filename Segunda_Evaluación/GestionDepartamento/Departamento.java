package GestionDepartamento;

public class Departamento {
private String nombre;
private Profesor[] profesores;

public Departamento(String nombre,int numeroprofesores) {
	this.nombre=nombre;
	this.profesores=new Profesor[numeroprofesores];
}
public static void anyadirProfesor(Profesor[]profesores) {
	for (int i=0;i<profesores.length;i++) {
		if(profesores[i]==null) {
			
			
		}
	}
}
}
