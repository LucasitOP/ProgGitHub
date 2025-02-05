package GestionDepartamento;

public class Departamento {
String nombre;
Profesor[] profesores;

public Departamento(String nombre,int numeroprofesores) {
	this.nombre=nombre;
	this.profesores=new Profesor[numeroprofesores];
}
}
