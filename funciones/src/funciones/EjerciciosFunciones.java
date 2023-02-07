package funciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjerciciosFunciones {

	public static double ejercicio6(double... numeros) {
		double media = 0;
		for (double numero : numeros) {
			media += numero; // es lo mismo que media= media + numero;
		}
		// esto se puede hacer en el return directamente media= media/numeros.length;
		return media / numeros.length;
	}

	public static int ejercicio8(int... numeros) {
		int max = Integer.MIN_VALUE;
		if (numeros.length == 0) {
			return 0;
		}
		for (int numero : numeros) {
			if (numero > max) {
				max = numero;
			}
		}
		return max;

	}

	public static int ejercicio8funcional(int... numeros) {
		return Arrays.stream(numeros).max().orElse(0);
	}

	public static int ejercicio9(String cadena, String subcadena) {
		int veces = 0;
		int posicion = 0;
		while (cadena.indexOf(subcadena, posicion) != -1) {
			posicion = cadena.indexOf(subcadena, posicion) + 1;
			veces++;
		}
		return veces;
	}

	public static void ejercicio10(String cadena, char separador, int n) {

	}

	public static void ejercicio12(String... cadenas) { // como el cambio se mantiene en el array, no hace falta
														// devolver el dato
		Arrays.sort(cadenas, Comparator.reverseOrder());
	}

	public static LocalDate ejercicio15(String fechaCadena) {
		// "27-07-1997"
		String dia = fechaCadena.substring(0, 2); // "27"
		String mes = fechaCadena.substring(3, 5); // "07"
		String anyo = fechaCadena.substring(6, 10); // "1997"
		LocalDate fecha = LocalDate.of(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(anyo));
		return fecha; 
	}

	public static void main(String[] args) {
//		System.out.println(ejercicio6(2.2,3.2,5,0,6,7,9));
//		System.out.println(ejercicio8(-2,-3));
//		int veces = ejercicio9("cocinando cocos con chocolate", "co");
//		System.out.println(veces);
//		String[] meses = { "En", "Fe", "Mar", "Ab", "May", "Jun", "Jul", "Ag", "Se", "Oc", "No", "Di" };
//		ejercicio12(meses);
//		for (String mes : meses) {
//			System.out.println(mes);
//		}
//		System.out.println(ejercicio15("27-07-1996"));
	}

}
