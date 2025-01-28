package Cuaderno_Composición_De_Clases;

import java.util.Scanner;

public class ManejadoraPokemons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Pack paquete=new Pack("Primer paquete");
	Figura figura1=new Figura(20,new Dimension(5,5,5),new Pokemon("Pikachu"));
	
	boolean salida=true;
	do {
	System.out.println("Vamos a intentar añadir los pokemons\n Introduce un pokemon");
	paquete.AnyadirFigura(figura1);
	
	sc.nextLine();
	}while (salida);
	}

}
