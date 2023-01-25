package ejerciciosT2;

import java.util.Scanner;

public class EjerciciosEstructuras {

	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
//		ejercicio10();
//		ejercicio11();
//		ejercicio12();
//		ejercicio12desafioGrupo();
//		ejercicio13();
		ejercicio14();
		ejercicio15();
		ejercicio16();
		ejercicio17();
		ejercicio18();
		ejercicio19();
		ejercicio20();
//		ejercicio21();
//		ejercicio21porFran(); 
//        ejercicio21Primos();
	}

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("Es par");
		else
			System.out.println("Es inpar");
		sc.close();

	}

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = sc.nextInt();
		if (num % 10 == 0)
			System.out.println("Es multiplo de 10");
		else
			System.out.println("No es multiplo de 10");
		sc.close();

	}

	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una letra");
		String letra = sc.nextLine();
		// if(letra.charAt(0)>='A' && letra.charAt(0)<='Z'){
		// } esta es la solucion del profe
		// ambas son para palabras y frases en las que se comprueba solo la primera
		// letra
		// otra es: char letra = letra.charAt(0)
		// en el programa que yo he hecho, hay mas que solo entre la A y la Z, si lo
		// quiero entre la A y la Z, solo vale la solucion del profe
		if (letra.equals(letra.toUpperCase()))
			System.out.println("Es Mayuscula");
		else
			System.out.println("Es Minuscula");
		sc.close();

	}

	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos palabras iguales");
		System.out.println("Primera palabra");
		String palabra = sc.nextLine();
		System.out.println("Segunda palabra");
		String palabra2 = sc.nextLine();

		if (palabra.equals(palabra2))
			System.out.println("Bien");
		else
			System.out.println("Mal");
		sc.close();

	}

	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		double num = sc.nextInt();
		System.out.println("Por cuanto quieres dividirlo");
		double num2 = sc.nextInt();
		if (num2 == 0)
			System.out.println("El divisor no puede ser cero");
		else
			System.out.println("El resultado es: " + (num / num2));
		sc.close();

	}

	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = sc.nextInt();
		System.out.println("Dime otro");
		int num2 = sc.nextInt();
		System.out.println("Dime un ultimo");
		int num3 = sc.nextInt();

		if (num > num2 && num > num3)
			System.out.println(num + " Es el mayor numero");
		else if (num2 > num && num2 > num3)
			System.out.println(num2 + " Es el mayor numero");
		else if (num3 > num2 && num3 > num)
			System.out.println(num3 + " Es el mayor numero");
		else
			System.out.println(" no hay numero mayor");
		sc.close();

	}

	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una hora");
		int horas = sc.nextInt();
		if (horas > 24)
			System.out.println("esa hora no puede ser");
		System.out.println("Dime los minutos");
		int minutos = sc.nextInt();
		if (minutos > 59)
			System.out.println("esos minutos no pueden ser");
		System.out.println("Dime los segundos");
		int segundos = sc.nextInt();
		if (segundos > 59)
			System.out.println("esos minutos no pueden ser");

		if (horas < 24 && minutos < 59 && segundos < 59)
			System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		else
			System.out.println("ERROR");
		sc.close();

	}

	public static void ejercicio8() {
		int A = 15;
//		if(A%2 == 0)
//			System.out.println(A + "Es par");
//		else 
//			System.out.println(A + "Es inpar");

		System.out.println(A % 2 == 0 ? A + "Es par" : A + "Es inpar");

	}

	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime numero del mes");
		int mes = sc.nextInt();
		switch (mes) {
		case 1:
			System.out.println("enero 31 dias");
			break;
		case 2:
			System.out.println("febrero 28 dias");
			break;
		case 3:
			System.out.println("marzo 31 dias");
			break;
		case 4:
			System.out.println("abril 30 dias");
			break;
		case 5:
			System.out.println("mayo 31 dias");
			break;
		case 6:
			System.out.println("junio 30 dias");
			break;
		case 7:
			System.out.println("julio 31 dias");
			break;
		case 8:
			System.out.println("agossto 31 dias");
			break;
		case 9:
			System.out.println("septiembre 30 dias");
			break;
		case 10:
			System.out.println("octubre 31 dias");
			break;
		case 11:
			System.out.println("noviembre 30 dias");
			break;
		case 12:
			System.out.println("diciembre 31 dias");
			break;
		default:
			System.out.println("eso no es un mes del año");
			break;
		}

		sc.close();

	}

//	ejercicio 9 del profe, formas distintas de hacer switch
//	
//	/**
//	 * Programa que lea una variable entera llamada mes y compruebe con una estructura switch,
//	 * si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28
//	 * días. Se mostrará además de los días, el nombre del mes. Se mostrará un error cuando el mes
//	 * no sea válido.
//	 * @param args
//	 */
//	public static void ejercicio9() {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Introduzca el número del mes:");
//		int mes = sc.nextInt();
//		switch(mes) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("El mes tiene 31 días");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("El mes tiene 30 días");
//			break;
//		case 2:
//			System.out.println("El mes tiene 30 días");
//			break;
//		default:
//			System.out.println("El número de mes introducido no es correcto");
//		}
//		sc.close();
//	}
//	
//	public static void ejercicio9b() {  // Java 17
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Introduzca el número del mes:");
//		int mes = sc.nextInt();
//		switch(mes) {
//		case 1,3,5,7,8,10,12:
//			System.out.print("El mes tiene 31 días y es ");
//			if(mes==1)
//				System.out.println(" Enero");
//			else if(mes==3)
//				System.out.println(" Marzo"); //...
//			break;
//		case 4,6,9,11:
//			System.out.println("El mes tiene 30 días y es " + ((mes==4)?"Abril":(mes==6)?"Junio":(mes==9)?"Septiembre":"Noviembre"));
//			break;
//		case 2:
//			System.out.println("El mes tiene 30 días y es Febrero");
//			break;
//		default:
//			System.out.println("El número de mes introducido no es correcto");
//		}
//		sc.close();
//	}
//	
//	public static void ejercicio9c() {  // Java 17
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Introduzca el número del mes:");
//		int mes = sc.nextInt();
//		switch(mes) {
//		case 1,3,5,7,8,10,12 -> System.out.println("El mes tiene 31 días");
//		case 4,6,9,11 -> System.out.println("El mes tiene 30 días y es " + ((mes==4)?"Abril":(mes==6)?"Junio":(mes==9)?"Septiembre":"Noviembre"));
//		case 2 -> System.out.println("El mes tiene 30 días y es Febrero");
//		default -> System.out.println("El número de mes introducido no es correcto");
//		}
//		sc.close();
//	}
//	

	public static void ejercicio10() {
		// explicacion clase character
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("Escribe algo");
//	    char letra = sc.nextLine().charAt(0);
//		if (Character.isDigit(letra)) //si es un digito	

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe algo");
		String texto = sc.nextLine();
		char letra = texto.charAt(0);
		if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) // en vez de esto puede ser if
																				// Character.isLetter(letra)
		{
			System.out.println("letra");
		} else
			switch (letra) {
			case '.', ',', ':', ';':
				System.out.println("singno de puntuación");
				break;
			case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9': // en vez de esto if (Character.isDigit(letra))
				System.out.println("numero");
				break;
			default: // otro
				System.out.println("otro");
				break;
			}

		sc.close();

	}

	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		double num1 = sc.nextInt();
		System.out.println("Introduce un numero");
		double num2 = sc.nextInt();

		boolean respuesta = false;
		while (!respuesta) {
			System.out.printf("Elija una opción: \n 1)Sumar \n 2)Restar \n 3)Multiplicar \n 4)Dividir \n");
			int opcion = sc.nextInt();

			switch (opcion) {
			case 1 -> System.out.println("La suma de " + num1 + "+" + num2 + " es igual a: " + (num1 + num2));
			case 2 -> System.out.println("La resta de " + num1 + "-" + num2 + " es igual a: " + (num1 - num2));
			case 3 -> System.out.println("La multiplicación de " + "*" + num1 + num2 + " es igual a: " + (num1 + num2));
			case 4 ->
				System.out.println(num2 != 0 ? "La división de " + "/" + num1 + num2 + " es igual a: " + (num1 + num2)
						: "El divisor no puede ser 0");
			default -> System.out.println("No es valido");
			}

			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4)
				respuesta = true;
		}

	}

	public static void ejercicio12() {
		double precioEntrada = 50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica tu edad:");
		int edad = sc.nextInt();
		if (edad < 18) {
			precioEntrada = precioEntrada - precioEntrada * 0.25;
			System.out.println("La entrada vale: " + precioEntrada);
		} else if (edad >= 18 && edad < 65) {
			System.out.println("Eres socio?");
			String socio = sc.next();
			if (socio.equals("si")) {
				precioEntrada = precioEntrada - precioEntrada * 0.40;
				System.out.println("La entrada vale: " + precioEntrada);
			} else {
				System.out.println("La entrada vale: " + precioEntrada);
			}
		} else if (edad >= 65) {
			precioEntrada = precioEntrada - precioEntrada * 0.75;
			System.out.println("La entrada vale: " + precioEntrada);
		}
		sc.close();
	}

	public static void ejercicio12desafioGrupo() {

		double precioEntrada = 50;
		final double PRECIO_ENTRADA_BASE = 50;
		double precioTotal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos sois:");
		int grupo = sc.nextInt();
		while (grupo > 0) {
			precioEntrada = PRECIO_ENTRADA_BASE;
			System.out.println("Indica tu edad:");
			int edad = sc.nextInt();
			if (edad < 18) {
				precioEntrada = precioEntrada - precioEntrada * 0.25;
				System.out.println("La entrada vale: " + precioEntrada);
			} else if (edad >= 18 && edad < 65) {
				System.out.println("Eres socio?");
				String socio = sc.next();
				if (socio.equals("si")) {
					precioEntrada = precioEntrada - precioEntrada * 0.40;
					System.out.println("La entrada vale: " + precioEntrada);
				} else {
					System.out.println("La entrada vale: " + precioEntrada);
				}

			} else if (edad >= 65) {
				precioEntrada = precioEntrada - precioEntrada * 0.75;
				System.out.println("La entrada vale: " + precioEntrada);
			}
			precioTotal = precioTotal + precioEntrada;
			grupo--;

		}
		System.out.println("El precio total es: " + precioTotal);
		sc.close();
	}

	public static void ejercicio13() {
		int num = 20;
		while (num != 0) {
			System.out.println(num);
			num--;
		}
	}

	public static void ejercicio14() {
		int num = 0;
		Scanner sc = new Scanner(System.in);

	}

	public static void ejercicio15() {

	}

	public static void ejercicio16() {

	}

	public static void ejercicio17() {

	}

	public static void ejercicio18() {

	}

	public static void ejercicio19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print(1);
		for (int i = 2; i <= num; i++) {
			System.out.print("," + i);
		}

		sc.close();
	}

	public static void ejercicio20() {

	}

	public static void ejercicio21() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("los divisores de " + num + " son: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
		sc.close();
	}

	public static void ejercicio21porFran() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = Integer.parseInt(sc.nextLine()); // para coger un numero y asignarlo a una variable desde un string
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println("el numero " + i + " es divisor de " + num);
		}
		sc.close();
	}

	public static void ejercicio21Primos() {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			System.out.print("el numero es primo");
		} else {
			System.out.print("el numero no es primo");
		}

		sc.close();
	}

}
