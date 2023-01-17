package holaMundo;

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
	
	public static void main(String[] args) {
		ejemplosComentarios();
		ejemploTipos();
	}

}
