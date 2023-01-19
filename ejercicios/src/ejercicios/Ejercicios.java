package ejercicios;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
//		ejercicio1();	
//		ejercicio2();
//	    ejercicio3();
//	    ejercicio5();
//	    ejercicio6();
//		ejercicio7(); 
//		ejercicio8(); 
//		ejercicio9(); 
		ejercicio15(); 
	}
		private static void ejercicio1 () {
			System.out.println(36 + 27);
			
		}

		
		private static void ejercicio2 () {
			int num1 = 15;
			int num2 = 4;
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			
		}
		
		
		private static void ejercicio3 () {
			int valor1 = 10, valor2= 10;
			System.out.println(valor1<valor2);
			System.out.println(valor1==valor2);
			System.out.println(valor1>=valor2);
			System.out.println(valor1 + " es menor que "+valor2+ ": "+(valor1<valor2));
			System.out.printf("%d y %d son iguales: %b \n", valor1, valor2 ,(valor1==valor2));
			
		}
		
		private static void ejercicio5() {
			//solucion incorrecta
			int n = 3;
			int	incremento = n + 77;
			int decremento = incremento -3;
			int doble = decremento*2;
			System.out.println("valor inicial de n = "+ n);
			System.out.println("n+77= "+ incremento);
			System.out.println("n-3= "+ decremento);
			System.out.println("n*2= "+ doble);
			
			/*n = n+77 =80
		     *n += 77 =80
		     *
		     *n = n-3 =77
		     *n -= 3 =77
		     *
		     *n = n*2 =154
		     *n *= 2 =154
		     *
		     */
			int n1 = 3;
			System.out.println("valor inicial de n = "+ n1);
			n1 = n1 + 77;
			System.out.println("n+77= "+ n1);
			n1 = n1 -3;
			System.out.println("n-3= "+ n1);
			n1 = n1*2;
			System.out.println("n*2= "+ n1);
			
		}
		public static void ejercicio6() {
			int A=1;
			int B=2;
			int C=3;
			int D=4;
			int auxB = B;
			System.out.println("valores iniciales: A="+A +" B="+ B + " C=" + C +" D=" + D);
			
			B=C;
			System.out.println("B toma el valor de C -> B = "+ B);
			C=A	;	
			System.out.println("C toma el valor de A -> C = "+ C);
			A=D	;	
			System.out.println("A toma el valor de D -> A = "+ A);
			D=auxB;
			System.out.println("D toma el valor de B -> D = "+ D);
			
			
		}
		
		public static void ejercicio7() {
			
			
		}
		
		public static void ejercicio8() {
			
			
		}
		
		public static void ejercicio9() {
			
			
		} 
		
		public static void ejercicio15() {//añadir la solucion del github de Fran
			 
		Scanner sc = new Scanner(System.in);	
		System.out.println("NOMBRE");
		String nombre = sc.next();
		System.out.println("PRECIO");
		double precio = Double.parseDouble(sc.next().replace(",","."));
		System.out.println();
		final double IVA = 0.21;
		
		System.out.println("NOMBRE");
		String nombre2 = sc.next();
		System.out.println("PRECIO");
		double precio2 = Double.parseDouble(sc.next().replace(",","."));
		System.out.println();
		
		System.out.println("NOMBRE");
		String nombre3 = sc.next();
		System.out.println("PRECIO");
		double precio3 = Double.parseDouble(sc.next().replace(",","."));
		System.out.println();
		
		System.out.printf("%-15s%12s%12s\n","NOMBRE","PRECIO","CON IVA");
		System.out.printf("%-15s%12.2f€%12.2f€\n",nombre , precio , (precio*(1+IVA)));
		System.out.printf("%-15s%12.2f€%12.2f€\n",nombre2 , precio2 , (precio2*(1+IVA)));
		System.out.printf("%-15s%12.2f€%12.2f€\n",nombre3 , precio3 , (precio3*(1+IVA)));
		
		sc.close();	
		}
		
		
		
	}
