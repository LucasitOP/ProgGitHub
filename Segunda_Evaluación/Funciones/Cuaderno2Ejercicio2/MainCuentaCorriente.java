package Cuaderno2Ejercicio2;

import java.util.Scanner;

public class MainCuentaCorriente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la Tarjeta\n======================");
		long numcuenta = 10062004;
		String nombre = "Lucas";
		String apellidos = "Timoc";
		String dirección = "Paseo de los navegantes";
		String dni = "X9401698B";
		double saldo = 100;
		System.out.println("Datos recogidos, bienvenido " + nombre + "!");
		CuentaCorriente CuentaLucas = new CuentaCorriente(nombre,apellidos,dirección,dni,numcuenta,saldo);

		boolean salida1menu = true;
		while (salida1menu) {
			System.out.println(
					"Introduce la Opción \n1 Sacar o Ingresar Dinero\n2 Consultar saldo o Modificar datos personales\n3 Terminar");
			int opcionmenu = sc.nextInt();
			switch (opcionmenu) {
			case 1:
				System.out.println("Introduce la operación que desea realizar\n1 Sacar Dinero\n2 Ingresar Dinero");
				int opcionSacaIngre = sc.nextInt();
				boolean bucleSacaIngre = true;
				while (bucleSacaIngre) {
					if (opcionSacaIngre == 1) {
						System.out.println("Dime el dinero que quieres sacar");
						try {
							double sacardinero = sc.nextInt();
							if (sacardinero < 0) {
								System.out.println("No puedes introducir un valor negativo");
							} else if (sacardinero > CuentaLucas.saldo) {
								System.out.println("No contienes tanto dinero, tu saldo es:" + CuentaLucas.saldo);

							} else {
								CuentaLucas.SacarDinero(sacardinero);
								 	
							}
						} catch (Exception e) {
							System.out.println("Ha ocurrido un error:" + e.getMessage());
							System.out.println("Introduce un número válido");
						}

						bucleSacaIngre = false;
					} else if (opcionSacaIngre == 2) {
						System.out.println("Dime el dinero que quieres ingresar");
						try {
							double ingresardinero = sc.nextInt();
							if (ingresardinero < 0) {
								System.out.println("No puedes introducir un valor negativo");
							}else {
							CuentaLucas.IngresarDinero(ingresardinero);
							System.out.println("Has ingresado:"+ingresardinero);
							System.out.println("El saldo de tu cuenta actual es:"+CuentaLucas.saldo);
						bucleSacaIngre = false;}
						}
							 catch (Exception e) {
							System.out.println("Ha ocurrido un error:" + e.getMessage());
							System.out.println("Introduce un número válido");						}
						
					} else {
						System.out.println("Opción errónea");
					}
				}
				break;
				
			case 2:
				System.out.println("Introduce la opción que deseas realizar\n1 Consultar saldo\n2 Modificar datos personales");
			int opcionConsuModi=sc.nextInt();
			if (opcionConsuModi==1) {
				System.out.println("El saldo de tu cuenta "+CuentaLucas.numcuenta+" es:"+CuentaLucas.saldo);
			}else if(opcionConsuModi==2) {
				CuentaLucas.ModificarDatos();

				}else {
					System.out.println("Opción errónea");
				}
				break;
			case 3:
				System.out.println("Gracias, hasta la próxima!");
				salida1menu = false;
				;
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		}
	}

}
