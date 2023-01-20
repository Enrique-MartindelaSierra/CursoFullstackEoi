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
		ejercicio10();
		ejercicio11();
		ejercicio12();

	}

	public static void ejercicio1() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Dime un numero");
		int num = sc.nextInt();
		if(num%2 == 0)
			System.out.println("Es par");
		else
			System.out.println("Es inpar");
		sc.close();
		
	}
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Dime un numero");
		int num = sc.nextInt();
		if(num%10 == 0)
			System.out.println("Es multiplo de 10");
		else
			System.out.println("No es multiplo de 10");
		sc.close();
		
		
	}
	public static void ejercicio3() {
		  Scanner sc = new Scanner(System.in);
		    System.out.println("Dime una letra");
			String letra = sc.nextLine();
		    //if(letra.charAt(0)>='A' && letra.charAt(0)<='Z'){
			//} esta es la solucion del profe
			// ambas son para palabras y frases en las que se comprueba solo la primera letra
			// otra es: char letra = letra.charAt(0)
			// en el programa que yo he hecho, hay mas que solo entre la A y la Z, si lo quiero entre la A y la Z, solo vale la solucion del profe
			if(letra.equals(letra.toUpperCase()))
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
		
		if(palabra.equals(palabra2))
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
			if(num2 == 0)
				System.out.println("El divisor no puede ser cero");
			else
				System.out.println("El resultado es: "+(num/num2));
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
			
			if(num>num2 && num>num3)
				System.out.println(num + " Es el mayor numero");
			else if(num2>num && num2> num3)
			System.out.println(num2 + " Es el mayor numero");
			else if(num3>num2 && num3> num)
				System.out.println(num3 + " Es el mayor numero");
			else 
				System.out.println(" no hay numero mayor");
			sc.close();
			
	}
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Dime una hora");
		int horas = sc.nextInt();
		if(horas>24)
			System.out.println("esa hora no puede ser");
		System.out.println("Dime los minutos");
		int minutos = sc.nextInt();
		if(minutos>59)
			System.out.println("esos minutos no pueden ser");
		System.out.println("Dime los segundos");
		int segundos = sc.nextInt();
		if(segundos>59)
			System.out.println("esos minutos no pueden ser");
		
		if(horas<24 && minutos<59 && segundos<59)
			System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
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
		
		System.out.println(A%2==0?A+"Es par":A+"Es inpar");
		
	}
	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Dime numero del mes");
	    int mes = sc.nextInt();
	    switch(mes) {
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
	public static void ejercicio10() {	
		//explicacion clase character
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("Escribe algo");
//	    char letra = sc.nextLine().charAt(0);
//		if (Character.isDigit(letra)) //si es un digito	
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Escribe algo");
	    String texto = sc.nextLine();
	    char letra = texto.charAt(0);
	    if ((letra>='A' && letra<='Z') || ( letra>='a' && letra<='z')) // en vez de esto puede ser if Character.isLetter(letra)
	    	{
	    	System.out.println("letra"); 
	    	}else
	    switch(letra) {
	    case'.',',',':',';': 
	    	System.out.println("singno de puntuación");
	    	break;
	    case '0','1','2','3','4','5','6','7','8','9': //en vez de esto if (Character.isDigit(letra)) 
	    	System.out.println("numero");
	    	break;
	    default:	//otro
	    	System.out.println("otro");
	        break;
	    }
	    
	    
		sc.close();
		
		
	}
	public static void ejercicio11() {
		
	}
	public static void ejercicio12() {
		
	}
	
	public static void ejercicio13() {
		
	}
	
	public static void ejercicio14() {
		
	}
	
	
	
	
	
	
	
	
	
	
}

