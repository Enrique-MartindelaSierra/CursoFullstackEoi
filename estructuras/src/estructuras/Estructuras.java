package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static void main(String[] args) {
//		ejemploIf();
//		ejemploIfElse();
//		ejemploIfElseIfELse();	
//		ejemploIfElseIfsinElse();
//		ejemploSwitch();
//		ejemploTernarias();
//		ejemplosAmbitosVariables();
//		ejemploWhile1();
//		ejemploWhile2();
//		ejemploDoWhile();
//		ejemploDoWhile2();
//		ejemploFor1();
//		ejemploForAWhile();
//		ejemploFor2();
//		ejemploFor3();
//		ejemploFor4();
		ejemploForComplejo();
//		ejemploContinue();
//		ejemploForAnidadosTablasMultiplicar();
//		ejemploForAnidadosTablasMultiplicarB(); 
//		ejemploForAnidadosTablasMultiplicarC();
	}

	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		if (nombre.equals("Enrique")) {
			System.out.println("Hola " + nombre);
		}
		System.out.println("Pasa un buen dia");
		sc.close();
	}

	public static void ejemploIfElse() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();

		if (nombre.equals("Enrique")) {
			System.out.println("Hola " + nombre);
		} else {
			System.out.println("Disculpe no le conozco " + nombre);
		}
		System.out.println("Pasa un buen dia");
		sc.close();

	}

	public static void ejemploIfElseIfELse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe el numero que ha salido: ");
		int numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("ha salido un uno");

		} else if (numero == 2) {

			System.out.println("ha salido un dos");

		} else if (numero == 3) {

			System.out.println("ha salido un tres");

		} else if (numero == 4) {

			System.out.println("ha salido un cuatro");

		} else if (numero == 5) {

			System.out.println("ha salido un cinco");

		} else if (numero == 6) {

			System.out.println("ha salido un seis");

		} else {
			System.out.println("¿Qué tipo de dado tienes que puede ser diferente de 1-6?");
		}

	}

	public static void ejemploIfElseIfsinElse() {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el nombre de tu equipo: ");
		String equipo = sc.nextLine();
		String equipoMayusculas = equipo.toUpperCase();// pasa la cadena a mayuscula y le asigna el valor a otra
														// variable

		if (equipo.toLowerCase().equals("barcelona")) {// pasa a minuscula y compara
			System.out.println("¡Visca el Barsa!");
		} else if (equipo.toUpperCase().equals("MADRID")) {// pasa a mayuscula y compara
			System.out.println("¡Hala Madrid!");
		} else if (equipo.equalsIgnoreCase("atletico")) {// ignora minuscula y mayuscula y compara
			System.out.println("¡Aupa Atleti!");
		}
		System.out.println("Bienvenido a nuestro programa de futbol");

	}

	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe el numero que ha salido: ");
		int numero = sc.nextInt();

		switch (numero) {
		case 1:
			System.out.println("ha salido un uno");
			break;
		case 2:
			System.out.println("ha salido un dos");
			break;
		case 3:
			System.out.println("ha salido un tres");
			break;
		case 4:
			System.out.println("ha salido un cuatro");
			break;
		case 5:
			System.out.println("ha salido un cinco");
			break;
		case 6:
			System.out.println("ha salido un seis");
			break;
		default:
			System.out.println("¿Qué tipo de dado tienes que puede ser diferente de 1-6?");
			break;

		}
	}

	public static void ejemploTernarias() {
		int edad = 20;
//		if(edad>=18) 
//		System.out.println("eres mayor de edad");
//		else
//		System.out.println("eres mayor de edad");

		System.out.println(edad >= 18 ? "eres mayor de edad" : "eres menor de edad");

//		int descuento;
//		if (edad>=18) descuento = 5;
//		else descuento = 20;

		int descuento = edad >= 18 ? 5 : 20;
		System.out.println(descuento);

//		int tresValores;
//		if(edad<18) {
//			tresValores = 1;
//			}
//		else if(edad>=18 && edad<=65) {
//			tresValores = 2;
//			}
//		else {
//			tresValores = 3;
//			}
		int tresValores = edad < 18 ? 1 : (edad >= 18 && edad <= 65) ? 2 : 3;
		System.out.println("tresValores vale: " + tresValores);

		int euros = 1;
		if (euros > 1) {
			System.out.println("cuesta " + euros + " euros");
		} else {
			System.out.println("cuesta " + euros + " euro");
		}

		System.out.println("cuesta " + euros + " euro" + (euros != 1 ? "s" : ""));
		System.out.println("cuesta " + euros + (euros != 1 ? " euros" : " euro"));

	}

	public static void ejemplosAmbitosVariables() {
		int numero = 5;
		int edad = 20;
		if (edad >= 18) {
			// int numero = 3; esto en java da error pero otros lenguajes lo permiten
			int valor = 4;
			System.out.println(numero);
		}
		// System.out.println(valor); da error por que la variable no existe fuera del
		// if

	}

	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		boolean adivina = false;
		while (!adivina) { // la exclamación viene a ser: mientras no lo adivina entra al bucle, hace lo
							// mismo que adivina == false. la exclamacion es un no, no adivina es true, por
							// tanto, cuando sea true, no adivina sera false y no entrará
			System.out.println("Introduzca la contraseña: ");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			}
		}
		sc.close();
	}

	public static void ejemploWhile2() { // el programa permite 3 intentos
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		while (!adivina && intentos < 3) {
			System.out.println(
					"Introduzca la contraseña tienes " + (3 - intentos) + " intento" + (intentos != 2 ? "s" : ""));
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
			intentos++;// la ultima linea de un bucle debe ser siempre la que corte el bucle, aquella
						// que se modifica 1 o varias veces hasta que el bucle se acabe
		}

		if (adivina) { // esto es igual a if(adivina==true)
		}
		System.out.println(adivina ? "enhorabuena saliste del videojuego" : "Gastaste todos tus intentos");

		sc.close();
	}

	public static void ejemploDoWhile() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		do {
			System.out.println(
					"Introduzca la contraseña tienes " + (3 - intentos) + " intento" + (intentos != 2 ? "s" : ""));
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
			intentos++;// la ultima linea de un bucle debe ser siempre la que corte el bucle, aquella
						// que se modifica 1 o varias veces hasta que el bucle se acabe
		} while (!adivina && intentos < 3);

		if (adivina) { // esto es igual a if(adivina==true)
		}
		System.out.println(adivina ? "enhorabuena saliste del videojuego" : "Gastaste todos tus intentos");

		sc.close();

	}

	public static void ejemploDoWhile2() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1; // le damos un valor que no aparezca en el menú
		do { // impresión del menú
			System.out.println("1 primera opción");
			System.out.println("2 segunda opción");
			System.out.println("3 tercera opción");
			System.out.println("4 cuarta opción");
			System.out.println("0 salir");
			// obtención de la opción
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) { // tratamiento de la opción
			case 1 -> System.out.println("has elegido la primera opción");
			case 2 -> System.out.println("has elegido la segunda opción");
			case 3 -> System.out.println("has elegido la tercera opción");
			case 4 -> System.out.println("has elegido la cuarta opción");
			case 0 -> System.out.println("Gracias por elegir nuestro programa");
			default -> System.out.println("la opción seleccionada no es correcta");
			}
		} while (opcion != 0);

		sc.close();

	}

	public static void ejemploFor1() { // bucle decreciente
		// la idea es repetir una iteracion x numero de veces
		for (int i = 0; i < 10; i++) { // 3 formas de hacer i++

			System.out.println("Repetición número " + (1 + i));
		}

		for (int i = 0; i < 10; i += 1) { // 3 formas de hacer i++

			System.out.println("Repetición número " + (1 + i));
		}

		for (int i = 0; i < 10; i = i + 1) { // 3 formas de hacer i++

			System.out.println("Repetición número " + (1 + i));
		}

	}

	public static void ejemploForAWhile() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Repetición número " + (1 + i));
		}

		int i = 0; // la unica diferencia entre este for y este while es que i se encuentra fuera
					// del while y en el for dentro
		while (i < 10) {
			System.out.println("Repetición número " + (1 + i));
			i++;
		}
		int i2 = 0; // en este caso si serian absolutamente identicos
		for (; i2 < 10; i2++) {

			System.out.println("Repetición número " + (1 + i2));
		}
	}

	public static void ejemploFor2() { // bucle infinito

		for (;;) {

			System.out.println("Repetición");
		}

	}

	public static void ejemploFor3() { // bucle decreciente

		for (int i = 10; i > 0; i--) {

			System.out.println("Repetición número " + (i));
		}

	}

	public static void ejemploFor4() { // saltos de pares

		for (int i = 0; i < 1000; i = i + 2) {

			System.out.println("valor de i " + (i));
		}

	}

	public static void ejemploForComplejo() { // 2 variables
		for (int i = 0, j = 10; i <= 10 && j >= 5; i++, j--) { // 0+10, 1+9, 2+8...5+5

			System.out.println(i + " + " + j + " = " + (i + j));

		}
	}

	public static void ejemploContinue() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce la contraseña: ");
			String password = sc.nextLine();
			if (password.contains("kk")) {
				continue;
			}
			System.out.println("Gracias por introducir contraseña");
		}

		sc.close();
	}

	public static void ejemploForAnidadosTablasMultiplicar() {
		for (int tabla = 1; tabla <= 5; tabla++) {
			for (int num = 1; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + (tabla * num));
			}
		}

	}

	public static void ejemploForAnidadosTablasMultiplicarB() {
		for (int tabla = 1; tabla <= 5; tabla++) {
			System.out.println("Tabla del: " + tabla);
			for (int num = 1; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + (tabla * num));
			}
		}

	}

	public static void ejemploForAnidadosTablasMultiplicarC() {
		for (int tabla = 1; tabla <= 5; tabla++) {
			System.out.println("Tabla del: " + tabla);
			for (int num = 1; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + (tabla * num));
			}
			System.out.println("Fin de la tabla del: " + tabla);
		}

	}

}
