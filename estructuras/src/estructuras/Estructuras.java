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
		ejemploWhile2();
		}

	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		
		if (nombre.equals("Enrique")) {
		System.out.println("Hola "+ nombre);
		}
		System.out.println("Pasa un buen dia");
		sc.close();
	}
	
	public static void ejemploIfElse() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca su nombre: ");
			String nombre = sc.nextLine();
			
			if (nombre.equals("Enrique")) {
				System.out.println("Hola "+ nombre);
			}else{
			System.out.println("Disculpe no le conozco "+ nombre);	
			}
			System.out.println("Pasa un buen dia");
			sc.close();
		
		
	}
	
	public static void ejemploIfElseIfELse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe el numero que ha salido: ");
		int numero = sc.nextInt();
		
		if(numero == 1) {
			System.out.println("ha salido un uno");
			
		}
		else if(numero == 2) {
			
			System.out.println("ha salido un dos");
			
		}
		else if(numero == 3) {
			
			System.out.println("ha salido un tres");
			
		}
		else if(numero == 4) {
			
			System.out.println("ha salido un cuatro");
			
		}
		else if(numero == 5) {
			
			System.out.println("ha salido un cinco");
			
		}
		else if(numero == 6) {
			
			System.out.println("ha salido un seis");
			
	    }
		else {
			System.out.println("¿Qué tipo de dado tienes que puede ser diferente de 1-6?");
		}
		
		
	}
	
	public static void ejemploIfElseIfsinElse() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el nombre de tu equipo: ");
		String equipo = sc.nextLine();
		String equipoMayusculas = equipo.toUpperCase();// pasa la cadena a mayuscula y le asigna el valor a otra variable
		
		if(equipo.toLowerCase().equals("barcelona")) {//pasa a minuscula y compara
	        System.out.println("¡Visca el Barsa!");
		}else if(equipo.toUpperCase().equals("MADRID")) {//pasa a mayuscula y compara
			System.out.println("¡Hala Madrid!");
		}else if(equipo.equalsIgnoreCase("atletico")) {//ignora minuscula y mayuscula y compara
			System.out.println("¡Aupa Atleti!");
		}
		System.out.println("Bienvenido a nuestro programa de futbol");
		
	}
	
	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe el numero que ha salido: ");
		int numero = sc.nextInt();
		
		switch(numero) {
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
		default :
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
		
		System.out.println(edad>=18?"eres mayor de edad":"eres menor de edad");
		
//		int descuento;
//		if (edad>=18) descuento = 5;
//		else descuento = 20;
		
		int descuento = edad>=18?5:20;
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
		int tresValores = edad<18?1:(edad>=18&&edad<=65)?2:3;
		System.out.println("tresValores vale: " + tresValores); 
		
		int euros = 1;
		if(euros>1) {
			System.out.println("cuesta " + euros + " euros");
		}else{	
			System.out.println("cuesta " + euros + " euro");
		}
		
		
		System.out.println("cuesta " + euros + " euro" + (euros!=1?"s":""));
		System.out.println("cuesta " + euros + (euros!=1?" euros":" euro"));
		
		}
	
	public static void ejemplosAmbitosVariables() {	
		int numero = 5 ;
		int edad = 20;
		if(edad>=18) {
			//int numero = 3; esto en java da error pero otros lenguajes lo permiten
			int valor = 4;
			System.out.println(numero);
		}
		//System.out.println(valor); da error por que la variable no existe fuera del if
		
		
	}
	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		boolean adivina = false;
		while(!adivina) { //la exclamación viene a ser: mientras no lo adivina entra al bucle, hace lo mismo que adivina == false. la exclamacion es un no, no adivina es true, por tanto, cuando sea true, no adivina sera false y no entrará
			System.out.println("Introduzca la contraseña: ");
			String respuesta = sc.nextLine();
			if(respuesta.equals(password)) {
				adivina = true;
			}
		}
		sc.close();
	}
		
	public static void ejemploWhile2() { //el programa permite 3 intentos
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		while(!adivina && intentos<3) { 
			System.out.println("Introduzca la contraseña tienes " + (3-intentos) + " intento"+ (intentos!=2?"s":""));
			String respuesta = sc.nextLine();
			if(respuesta.equals(password)) {
				adivina = true;
			}else{
				System.out.println("Fallaste");	
				}
			intentos++;// la ultima linea de un bucle debe ser siempre la que corte el bucle, aquella que se modifica 1 o varias veces hasta que el bucle se acabe
			}
		
		
		if(adivina){ //esto es igual a if(adivina==true)
			}
		System.out.println(adivina?"enhorabuena saliste del videojuego":"Gastaste todos tus intentos");
		
		sc.close();	
		}
	
		
	
	
}

