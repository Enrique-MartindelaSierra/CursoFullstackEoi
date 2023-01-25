package ejerciciosT3;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {

	public static void main(String[] args) {
//		ejercicio1();
		ejercicio2();

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
		System.out.println("el numero mayor es: " + numeros[numeros.length-1] + " y el menor es: " + numeros[0]);
	}
}
