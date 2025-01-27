package Cuaderno_Objeto_Array;

import java.util.Scanner;

public class Manejadora_Incidencias {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Incidencias []incidencia=new Incidencias[30];
		//A Marta le gusta crear funcion de mostrar menu
		 
		System.out.println("Introduce opción");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:listado(incidencia);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
		
	}
	public static void listado(Incidencias []incidencia) {
		int cont=0;
		for (int i=0;i<incidencia.length;i++) {
			if(incidencia!=null) {
				System.out.println(incidencia[i].toString());
				cont++;
			}
		}
		if(cont==0) {
			System.out.println("No existe ninguna incidencia registrada");
		}
	}
	public void alta(Scanner sc, Incidencias []incidencia) {
		System.out.println("Introduce el puesto");
		int puesto=sc.nextInt();
		
		if(incidencia[puesto]!=null) {
			
		}else
		{
			String descripcion=SolicitarDatosIncidencia(sc);
			incidencia[puesto]=new Incidencias(puesto,descripcion); 
		}
	}
	public String SolicitarDatosIncidencia(Scanner sc) {
		System.out.println("Introduce la descripción");
		return sc.nextLine();
	}
	public void baja() {
		
	}
	
	
}
