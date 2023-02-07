package ejerciciosT3;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {

	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
		ejercicio13();

	}

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de mes: ");
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Nobiembre", "Diciembre" };
		int numeroMes = Integer.parseInt(sc.nextLine());
		System.out.println(meses[numeroMes - 1]);

	}

	public static void ejercicio2() {
		Integer[] numeros = { 23, 48, 19, 14, 5, 1000000, 90, 9, 17, 27 };
		int total = 0;
		for (int numero : numeros) {
			System.out.println(numero);
		}
		for (int numero : numeros) {
			total += numero;
		}
		System.out.println("el total es: " + total);
		System.out.println("la media es: " + (double) total / numeros.length);

		int max = numeros[0];
		int min = numeros[0];
		for (int numero : numeros) {
			if (numero > max) {
				max = numero;
			}
			if (numero < min) {
				min = numero;
			}
		}
		System.out.println("el numero mayor es: " + max + " y el menor es: " + min);

		Arrays.sort(numeros);
		System.out.println("el numero mayor es: " + numeros[numeros.length - 1] + " y el menor es: " + numeros[0]);
	}

	public static void ejercicio13() {
		Scanner sc = new Scanner(System.in);

		String[][] productos = new String[10][3]; // podemos almacenar hasta 10 productos con 3 campos

		String[][] productos2 = { { "mesa", "99,50", "3" }, { "silla", "14,95", "4" } }; // 2 productos con 3 campos

		// obtener los datos de productos
		System.out.println("¿Cúantos productos desea almacenar? (maximo 10)");
		int numProductos = Integer.parseInt(sc.nextLine());
		if (numProductos > 10 || numProductos < 0) {
			System.out.println("no se pueden almacenar mas de 10 productos o números negativos");
			
			sc.close(); //cierro el escaner por que el programa no va a llegar al final de la función
			return; // salgo de la función
			
		} else { // numero entre 0 y 10
			for (int i = 0; i < numProductos; i++) {
				System.out.println("Introduzca el nombre del producto "+ (i+1) );
				productos[i][0]=sc.nextLine();
				System.out.println("Introduzca el precio del producto "+ (i+1) );
				productos[i][1]=sc.nextLine();
				System.out.println("Introduzca el cantidad del producto "+ (i+1) );
				productos[i][2]=sc.nextLine();
			}

		}
		
		//mostrar los datos
		System.out.printf("%-17s%10s%12s%10s\n","NOMBRE","PRECIO","CANTIDAD","TOTAL");
		//System.out.println("--------------------------------------------------");
		/*for(int i = 0; i<50;i++) {
			System.out.print("-");
			}*/
		System.out.println(String.valueOf('-').repeat(50));
		for (int i = 0; i < numProductos; i++) { //si pedimos por pantalla seria numProductos, si no array.length 
			double precio = Double.parseDouble(productos[i][1].replace(',','.'));
			int cantidad = Integer.parseInt(productos[i][2]);
			double total = precio * cantidad;
			System.out.printf("%-17s%9.2f€%12d%9.2f€\n",productos[i][0],precio,cantidad,total);
			
		}
		
		
		sc.close();
	}

}
