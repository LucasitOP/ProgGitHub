package GestionDepartamento;

import java.util.Arrays;

public class Profesor {
String nombre,apellido;
String[]AsignaturasImparte;

public Profesor(String nombre,String apellido,String[]AsignaturasImparte) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.AsignaturasImparte=AsignaturasImparte;
}

@Override
public String toString() {
	return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", AsignaturasImparte="
			+ Arrays.toString(AsignaturasImparte) + "]";
}

}
