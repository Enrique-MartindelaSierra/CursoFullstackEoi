package ejerciciosT3;

import java.util.Scanner;

public class EjerciciosArrays {

	public static void main(String[] args) {
		ejercicio1();

	}

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de mes: ");
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Nobiembre", "Diciembre" };
		int numeroMes = Integer.parseInt(sc.nextLine());
		System.out.println(meses[numeroMes - 1]);

	}

}
