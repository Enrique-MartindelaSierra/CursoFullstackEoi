package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiArrays {

	public static void main(String[] args) {
//		ejemplo1();
//		ejemploRecorrido();
//		ejemploBusquedas1();
//		ejemploBusquedasFuncional();
//		ejemploRedimension();
//		ejemploAumentarUnoArray();
//		ejemploStringJoin();
//		ejemploDisminuirUnoArray();
//		ordenarArray();
		ordenarInversoArray();
	}

	public static void ejemplo1() {
		// Java es un lenguaje base 0 , siempre la primera posicion es 0 y la ultima es
		// el numero -1
		int[] numeros; // declarar la variable
		numeros = new int[5]; // asignar memoria para poder trabajar con ella
		numeros[0] = 12; // inicializar valores
		numeros[1] = 23;
		numeros[2] = 53;
		numeros[3] = 5;
		numeros[4] = 92;

		int[] nums = new int[5]; // declaracion y asignacion en la misma linea. lo mas habitual
		// si a num no le das valores, todas los posiciones son = 0

		int[] numeros2 = { 12, 23, 53, 5, 92 }; // aque se declara y se inicializan los valores, lo que le asigna
												// memoria directamente

	}

	public static void ejemploRecorrido() {
		int[] numeros = { 12, 23, 53, 5, 92 };
		// con un bucle for
		for (int i = 0; i < numeros.length; i++) { // recorrer el array de uno en uno
			System.out.println("El array numeros en su posicion " + i + " tiene el valor " + numeros[i]);
		}
		// bucle for de atras a alante
		for (int i = numeros.length - 1; i >= 0; i--) { // recorrer el array de uno en uno
			System.out.println("El array numeros en su posicion " + i + " tiene el valor " + numeros[i]);
		}

		// con un bucle for-each
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// con un bucle for-each con posicion
		int i = 0;
		for (int numero : numeros) {
			System.out.println("el numero con posicion " + (i++) + " tiene el valor " + numero);
		}

	}

	public static void ejemploBusquedas1() {

		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		boolean encontrado = false; // Nos indicará si hemos encontrado el valor
		String buscar = "Pedro"; // Valor a buscar en el array
		// La condición también incluye que no hayamos encontrado lo que buscamos
		for (int i = 0; i < nombres.length && !encontrado; i++) {
			if (nombres[i].equals(buscar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}

	}

	public static void ejemploBusquedasFuncional() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String buscar = "Pedro";

		if (Arrays.stream(nombres).anyMatch(n -> n.equals(buscar))) { // con lambdas. lambda = ->
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}

	}

	public static void ejemploRedimension() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco", "" };
		nombres = Arrays.copyOf(nombres, 10);
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] != null) // si no quitamos los nulls aqui, daria error, por que no puedes sacar la
									// longitud de un null
				System.out.println(nombres[i] + " tiene " + nombres[i].length() + " letras");
		}
		// for-each
		System.out.println("comienzo del for-each");
		for (String nombre : nombres) {
			if (nombre != null) // mismo caso que antes
				System.out.println(nombre + " tiene " + nombre.length() + " letras");

		}
	}

	public static void ejemploAumentarUnoArray() {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		System.out.println("Introduzca nuevo alumno: ");
		String nombreAlumno = sc.nextLine();
		alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);// le da un tamaño de una unidad mas al array
		alumnos[alumnos.length - 1] = nombreAlumno;// mete el nuevo dato en la ultima posicion
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		Arrays.stream(alumnos).forEach(e -> System.out.println(e));// programacion funcional
		sc.close();

	}

	public static void ejemploStringJoin() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String cadenaAlumnos = String.join(",", alumnos);
		System.out.println(cadenaAlumnos);

	}

	public static void ejemploDisminuirUnoArray() {

		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		alumnos = Arrays.copyOf(alumnos, alumnos.length - 1);
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}

	}

	public static void ordenarArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		Arrays.sort(alumnos);
		System.out.println("imprimir con for-each");
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println("imprimir con toString");
		System.out.println(Arrays.toString(alumnos));

		int[] numeros = { 11, 2, 4, 5, 3, 21, 80 };
		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

	public static void ordenarInversoArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		Arrays.sort(alumnos); // orden menor a mayor
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		Collections.reverse(Arrays.asList(alumnos));// orden iverso
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}

		// Integer es un int con superpoderes. es una clase objeto y por tanto tiene sus
		// funciones. para trabajar con colecciones mejor usar siempre Integer
		Integer[] numeros = { 11, 2, 4, 5, 3, 21, 80 };
		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.println(numero);
		}
		Collections.reverse(Arrays.asList(numeros));
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}
}