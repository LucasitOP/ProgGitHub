package Equipos_Deportivos;

import java.util.Scanner;

public class Equipos_DeportivosManejadora {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		boolean repetir=true;
		Equipo equipo=new Equipo();
		do {
			System.out.println("Introduce opcion\n1Crear Equipo\n2º Añadir jugador al equipo\n3Imprimir la lista jugadores\n4Buscar un jugador por numero\n5Salir");
		opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion) {
		case 1:CrearEquipo(sc, equipo);
			break;
		case 2:AñadirJugador(sc,equipo);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:repetir=false;
			break;
		default:
			break;
		}
			
			
		}while (repetir);
		
	}
	public static void CrearEquipo(Scanner sc,Equipo equipo) {
		System.out.println("Añade el nombre del equipo:");
		equipo.setNombre(sc.nextLine());
		
	}
	public static void AñadirJugador(Scanner sc,Equipo equipo) {
	    System.out.println("Vamos a añadir un jugador:");

	    System.out.print("Nombre: ");
	    String nombre = sc.nextLine();

	    System.out.print("Posición: ");
	    String posicion = sc.nextLine();

	    System.out.print("Número: ");
	    int numero = sc.nextInt();
	    sc.nextLine(); 

	    Jugador nuevoJugador = new Jugador(nombre, posicion, numero);

	    // Buscar un espacio vacío en el array
	    boolean jugadorAñadido = false;
	    for (int i = 0; i < equipo.getJugadores().length; i++) {
	        if (equipo.getJugadores()[i] == null) {
	            equipo.getJugadores()[i] = nuevoJugador; 
	            jugadorAñadido = true;
	            System.out.println("Jugador añadido correctamente.");
	            i=equipo.getJugadores().length; 
	        }
	    } if (!jugadorAñadido) {
	        System.out.println("No se puede añadir más jugadores, el equipo está lleno.");
	    }
	}
	

}
