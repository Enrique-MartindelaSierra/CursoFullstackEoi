package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {

	
	public static void ejercicio7y5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca nombre fichero:");
		String nombreFichero = sc.nextLine();
		List<String> lineas = Ejemplos.devolverLineasJava8(Paths.get(nombreFichero));
		if(lineas!=null) {
			lineas.forEach(e->System.out.println(e));
			String[] lineasArray = (String[])lineas.toArray();
		}
		sc.close();
	}
	
	
	public static void main(String[] args) {
		ejercicio7y5();
	}



}