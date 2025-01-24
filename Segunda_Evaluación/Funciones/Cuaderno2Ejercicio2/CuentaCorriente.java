package Cuaderno2Ejercicio2;

import java.util.Scanner;

public class CuentaCorriente {
	String nombre, apellidos, dni, dirección;
	long numcuenta;
	double saldo;



	public CuentaCorriente(String nombre, String apellidos, String dni, String dirección, long numcuenta,
			double saldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.dirección = dirección;
		this.numcuenta = numcuenta;
		this.saldo = saldo;
	}

	double IngresarDinero(double a) {
		saldo = saldo + a;
		return saldo;
	}

	double SacarDinero(double a) {
		// Scanner sc=new Scanner(System.in);
		/*
		 * if(a>saldo) { System.out.
		 * println("No tienes tanto dinero, introduzca un importe acorde a tu salario");
		 * a=sc.nextDouble(); SacarDinero(a); }
		 */
		saldo = saldo - a;
		System.out.println("El dinero que has sacado es:" + a);
		System.out.println("Ahora dispones de " + saldo + " euros en tu cuenta");
		return saldo;
	}

	void MostrarSaldo() {
		System.out.println("Tu saldo es:" + saldo);
	}

	void ModificarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Datos actuales:\n1 Nombre:" + nombre + "\n2 Apellidos:" + apellidos + "\n3 DNI:" + dni
				+ "\n4 Dirección:" + dirección + "\nSeleccione si desea cambiar algún dato o 5 para salir");
		int opcionModiDatos = sc.nextInt();
		boolean salidaModiDatos = true;

		while (salidaModiDatos) {
			switch (opcionModiDatos) {
			case 1:
				System.out.println("Has seleccionado cambiar el nombre\nEscribe el nuevo nombre:");
				String Nuevonombre = sc.next();
				nombre = Nuevonombre;
				System.out.println("Cambiado! El nuevo nombre de la cuenta es:" + nombre);
				salidaModiDatos = false;
				break;
			case 2:
				System.out.println("Has seleccionado cambiar el apellido\nEscribe el nuevo apellido/apellidos:");
				String Nuevoapellidos = sc.next();
				apellidos = Nuevoapellidos;
				System.out.println("Cambiado! El nuevo apellido de la cuenta es:" + apellidos);
				salidaModiDatos = false;
				break;
			case 3:
				System.out.println("Has seleccionado cambiar el DNI\nEscribe el nuevo DNI:");
				String Nuevodni = sc.next();
				dni = Nuevodni;
				System.out.println("Cambiado! El nuevo DNI de la cuenta es:" + dni);
				salidaModiDatos = false;
				break;
			case 4:
				System.out.println("Has seleccionado cambiar la dirección\nEscribe la nueva dirección:");
				String Nuevadirección = sc.next();
				dirección = Nuevadirección;
				System.out.println("Cambiado! La nueva dirección de la cuenta es:" + dirección);
				salidaModiDatos = false;
				break;
			case 5:
				System.out.println("Salida al menú principal");
				salidaModiDatos = false;
				break;
			default:
				System.out.println("Opción Errónea");
				break;
			}
		}
	}

}
