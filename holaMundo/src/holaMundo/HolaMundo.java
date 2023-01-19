package holaMundo;

import java.util.Scanner;

/**
 * primera clase del curso
 * @author Enrique
 * @since 1
 */
 
public class HolaMundo {
    
	public static void ejemplosComentarios () {
		
		
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		/* 
    System.out.println("Hola Mundo a");
	System.out.println("Hola Mundo a");
	System.out.println("Hola Mundo");
	System.out.println("Hola Mundo");
	System.out.println("Hola Mundo a");
	System.out.println("Hola Mundo a");*/
		System.out.println("Hola Mundo");
		
		
	}
	
	private static void ejemploTipos() {
		// numeros enteros
		int numero = 5;
		int numero2 = 7;
		int suma = numero + numero2;
		int resta = numero2 - numero;
//		transformamos un numero a double para que el resultado sea decimal
		double division = (double)numero2 / numero;
		System.out.println("la suma es: " + suma);
		System.out.println("la resta es: " + resta);
		System.out.println("la division es: " + division);
		System.out.println("la division sobre la marcha es: " + ((double)numero2/numero));
//		numeros decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;
		System.out.println("la multiplicacion es: " + decimales1*decimales2);
		System.out.println("la suma es: " + (decimales1 + decimales2));
		//enteros largos
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		System.out.println("la suma es: " + (maxInt + minInt));
		long largo = 2000000000;
		long largo2 = 1000000000;
		System.out.println("la suma de dos largos correctamente es: " + (largo + largo2));
//		letras
		char letraA = 'a';
		char letraB = 'b';
		System.out.println("la suma de la letra a y b es: "+letraA + letraB);
//		usando los valores del sistema ASCII
		System.out.println("la suma de la letra a y b con parentesis es: "+(letraA + letraB));
		System.out.println("la suma de la letra a y el numero 3 con parentesis es: "+(letraA + 3));
		System.out.println("la suma de la letra a y el numero 3 con parentesis en char es: "+(char)(letraA + 3));
		System.out.println("el numero 100 con parentesis en char es: "+(char)(100));
	}
	
	
	public static void ejemplosString(){
		
		String cadena1; //String cadena1 = "Enrique";
		cadena1 = "Enrique";
		String cadena2 = "hola" , cadena3 = "adiós";
		String cadena4 = cadena2 + cadena3; //"holaEnrique"
		String cadena5 = cadena2 + " " + cadena3; //"hola Enrique"
		String prefijo = "34";
		String telefono= "666666666";
		int numero = 40;
		System.out.print(prefijo + "-"+ telefono);
		System.out.println("otra cosa");
		System.out.printf("%s tiene %d años\n",cadena1,numero);
		System.out.println("otra cosa");
		
	}
	public static void ejemplosBoolean() {
		//valores que solo almacenan true o false
		boolean verdad = true;
		boolean falso = false;
		boolean comparacion1 = 10<20; //true;
		System.out.println(10<20);//true;
		System.out.println(comparacion1);//true;
		//condiciones de comparacion <,>,<=,>=,==,!=,<>
		
		int num1 = 10;
		int num2 = 20;
		boolean c1 = 10<20; //true
		boolean c2 = 10>20; //false
		boolean c3 = 10<=20; //true
		boolean c4 = 10>=20; //false
		boolean c5 = 10==20; //false
		boolean c6 = 10!=20; //true
		String cadena1 = "hola";
		String cadena2 ="adios";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		System.out.println(cadena1==cadena2);//esto seria incorrecto 
		System.out.println(cadena1.equals(cadena2));//esto seria correcto
		System.out.println(cadena1.equals(cadena3));//true
		System.out.println(cadena1.equals(cadena4));//false
		boolean cadenasIguales = cadena1.equals(cadena2); //false
		num1 = 5;
		double num3 = 5.0;
		double num4 = 5.1;
		System.out.println(num1==num3); //true
		System.out.println(num1==num4); //false
		System.out.println(11/2==num1); // true por que int trunca el resultado a entero
		System.out.println(23/4==num1); // true
		System.out.println(11.0/2==num1); // false aqui es double 
		System.out.println(11%2==1); // true esta operacion es el resto de una division entera
		System.out.println(11%2==0); // false 
		System.out.println(23%4); // 3  el resto de la division es 3

     
		
	}
	
	public static void tablasVerdad () {
   	 int edad = 25;
   	 int anyosCarnet = 6;
   	 String sexo = "M";
   	 String nombre = "Pepe";
   	 boolean esPepeMayor = edad>18 && nombre.equals("Pepe"); //true
   	 System.out.println(esPepeMayor);//true
   	 //el siguiente caso es true y false o false y true
   	 boolean tieneDescuento = (sexo.equals("M") && anyosCarnet >10 )|| (sexo.equals("F")&& anyosCarnet > 5);
   	 System.out.println(tieneDescuento); //false
   	 
   	 boolean estoQueDa = sexo.equals("M") || anyosCarnet>5 && nombre.equals("fran");//true
   	 System.out.println(estoQueDa);
    } 
	
	public static void ejemploIncrementos() {
		
		int num = 10;
		//pre-incrementos
		++num; //11
		System.out.println(num);//11
		//post-incrementos
		num++; //12
		System.out.println(num);//12
	
		//pre-decrementos
		--num; //11
		System.out.println(num);//11
		//post-decrementos
		num--; //10
		System.out.println(num);//10
		//lo importante es el momento en el que incrementa o decrementa
		
		///////////////////////////////
		
		System.out.println(++num); //11
		System.out.println(num++); //11
		System.out.println(num); //12	
		System.out.println(++num+num++); //26
//		System.out.println(num+++ ++num); //26 a+b = b+a
		System.out.println(num); //14
		int num2 = ++num; //num2 =15 num=15
		System.out.println(num2 +"y"+ num);
		int num3 = num++; //num3 =15 num=16
		System.out.println(num3 +"y"+ num);
		
		
		
		
	}
	
	public static void ejemplosConstantes() {
		//final y mayusculas para constantes
		final double IVA = 0.21;	
		final double PI = 3.1416;
		double precioVaquero = 50;
		System.out.println("el precio final es:"+ (precioVaquero * (1+IVA)));
		//PI=3.14159; daria un error
		
	}
	public static void conversionesNumerosCadenas() {
		
		int num = 10;
		String cadena = "11";
		System.out.println(cadena+num); //1110
		System.out.println(Integer.parseInt(cadena)+num); //21 convertir cadena a numero
		int prefijo = 34;
		int telefono = 666666666;
		System.out.println(prefijo+telefono); //666666670
		System.out.println(""+prefijo+telefono); //34666666666
		System.out.println(String.valueOf(prefijo)+telefono); //34666666666 convertir numero en cadena
		System.out.println("00"+prefijo+"-"+telefono); //0034-666666666
		
//		System.out.printf("%d %d \n" ,prefijo,telefono); //34666666666 convertir numero en cadena
//		System.out.println(String.valueOf(prefijo)+telefono); //34666666666 convertir numero en cadena
		
	}
	
	public static void ejemplosSaltos() {
		
		System.out.println("hola\n\tfran\nbien"); //  \t es un salto de 8 espacios y \n de linea
		System.out.println("Elige una opción\n\t1) añadir producto\n\t2) borrar producto");
		
	}
	
	
	public static void ejemplosFormateos() {
		
		String fran = "Fran";
		String consuelo = "consuelo";
		double salario1 = 95567.89;
		double salario2 = 2589.3674;
		
//		System.out.println("    NOMBRE     SALARIO");
//		System.out.println("----------------------");
//		System.out.println("    " + fran + "    " + salario1);
//		System.out.println("    " + consuelo + "    " + salario2);
//		
		System.out.printf("%-12s%14s\n","NOMBRE","SALARIO"); // el numero en positivo alinea a la derecha, en negativo a la izquierdo
		System.out.println("----------------------------");
		System.out.printf("%-12s%14.2f€\n",fran,salario1);  //.2 indica el numero de decimales y redondea
		System.out.printf("%-12s%14.2f€\n",consuelo,salario2);
	}
	
	public static void ejemplosScanner() {  //leer de la consola
		
		Scanner sc = new Scanner(System.in); //abro el scanner
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine(); // el nombre tendre lo que haya puesto el usuario por pantalla
		
		System.out.println("Introduzca su localidad:");
		String localidad = sc.nextLine(); // la localidad tendre lo que haya puesto el usuario por pantalla
		
		System.out.println("Introduzca su salario:");
		double salario = sc.nextDouble();
		sc.nextLine(); //limpiar el buffer
	    System.out.println("Introduzca cuanto desearia ganar:");
	    double salarioDeseado = sc.nextDouble();
	    sc.nextLine(); //limpiar el buffer
		System.out.println("Hola "+ nombre + " me encanta "+ localidad + " y que usted gane "
	    + salario + " y que le gustaria ganar " + salarioDeseado);
		
		
		sc.close(); //cierro el scanner
		
	}
	
	public static void ejemplosScanner2() {
		
		Scanner sc = new Scanner(System.in); //abro el scanner
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine(); // el nombre tendre lo que haya puesto el usuario por pantalla
		
		System.out.println("Introduzca su localidad:");
		String localidad = sc.nextLine(); // la localidad tendre lo que haya puesto el usuario por pantalla
		
//		System.out.println("Introduzca su salario:");
//		double salario = Double.parseDouble(sc.nextLine().replace(",","."));
//		sc.nextLine();
//	    System.out.println("Introduzca cuanto desearia ganar:");
//	    double salarioDeseado = Double.parseDouble(sc.nextLine().replace(",","."));
//	    sc.nextLine(); // no sirve por que el anterior sc.nextLine() intenta coger toda la linea y transformarla en double
//		System.out.println("Hola "+ nombre + " me encanta "+ localidad + " y que usted gane "
//	    + salario + " y que le gustaria ganar " + salarioDeseado);
//		
		System.out.println("Introduzca su salario:");
		double salario = Double.parseDouble(sc.next().replace(",","."));
		sc.nextLine();
	    System.out.println("Introduzca cuanto desearia ganar:");
	    double salarioDeseado = Double.parseDouble(sc.next().replace(",","."));
	    sc.nextLine(); 
		System.out.println("Hola "+ nombre + " me encanta "+ localidad + " y que usted gane "
	    + salario + " y que le gustaria ganar " + salarioDeseado);
		
		sc.close(); //cierro el scanner
		
		//sc.next() es la primera String nada más
		
		
	} 
	
	public static void main(String[] args) {
//		ejemplosComentarios();
//		ejemploTipos();
//		ejemplosString();
//		ejemplosBoolean();
//		tablasVerdad ();
//		ejemploIncrementos();
//		ejemplosConstantes();
//		conversionesNumerosCadenas();
//		ejemplosSaltos(); 
//		ejemplosFormateos();
//		ejemplosScanner();
		ejemplosScanner2();
	}

	
	
}	 	


