package com.enrique.colecciones;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.enrique.colecciones.entidades.Persona;

public class App {

	public static void ejemploListas() {
		// Lista que almacena números
		List<Integer> numeros = new ArrayList<>();
		// Podemos establecer una capacidad inicial reservada
		List<Integer> numeros2 = new ArrayList<>(12);
		// Se puede crear una lista a partir de un array
		Integer[] array = { 2, 3, 5 };
		List<Integer> numeros3 = Arrays.asList(array);
		// Se puede crear una lista a partir de otra colección
		List<Integer> numeros4 = new ArrayList<Integer>(numeros2);

		Integer[][] matriz = new Integer[4][5]; // como se hacia un array de 2 dos dimensiones
		Integer[][][] show_red = new Integer[1024][728][128]; // array de 3 dimensiones

		// crear listas de mas de una dimension
		List<List<Integer>> ListaDeListas = new ArrayList<List<Integer>>();
		List<List<List<Integer>>> Lista3Dimensiones = new ArrayList<>();

		List<String> cadenas = new ArrayList<>();
		cadenas.add("hey");
		cadenas.add("hey");// las listas SI permiten elementos duplicados
		cadenas.add("bro");
		cadenas.add("yiiiii");
		cadenas.add("bro");
		cadenas.add(3, "hola"); // esto añade un elemento a la posicion indicada, pero si no existe la posición
								// da error
		System.out.println(cadenas.size()); // imprime el numero de elementos de la lista

		List<String> otra = Arrays.asList("hola", "en", "minuscula"); // una lista de cadenas con valores
		cadenas.addAll(otra);
		System.out.println(cadenas.size());

		// cadenas.clear();

		if (cadenas.contains("hey"))
			;
		System.out.println("la lista contiene hey");

		cadenas.forEach(e -> System.out.println(e));// recorrer la lista entera

		System.out.println(cadenas.indexOf("bro"));
		System.out.println(cadenas.lastIndexOf("bro"));

		List<String> otra2 = new ArrayList<>(Arrays.asList("hola", "en", "minúscula")); // Lo correcto para crear una
																						// lista a partir de datos
																						// iniciales en un array

		// borrados lista
		cadenas.remove("hey"); // Borra el primer "Mundo"
		cadenas.removeAll(otra2); // Borra un conjunto
		cadenas.forEach(e -> System.out.println(e));
		cadenas.removeIf(e -> e.equals("bro")); // Borra TODOS los elementos de la lista que cumplan la condicion a la
												// derecha de ->
		cadenas.forEach(e -> System.out.println(e));

	}

	public static void ejemploMap() {
		// Diccionario que almacena cadenas y el índice también es una cadena
		Map<String, String> traducciones = new HashMap<>();
		traducciones.put("mesa", "table");
		traducciones.put("silla", "chair");
		traducciones.put("cabeza", "head");
		traducciones.put("botella", "bottle");
		// {mesa=table, cabeza=head, botella=bottle, silla=chair}
		System.out.println(traducciones);

		// Acceder a los valores
		String palabra = traducciones.get("cabeza");
		System.out.println(palabra); // head

		// Recorrer los valores
		for (String key : traducciones.keySet()) {
			System.out.println(key + " en inglés es: " + traducciones.get(key));
		}
		for (String value : traducciones.values()) {
			System.out.println("Palabra: " + value + " (no puedo saber la clave...)");
		}
		// Con funcional sería
		traducciones.forEach((clave, valor) -> System.out.println(clave + " en inglés es: " + valor));

		// Map<clave,valor> pueden ser cualquier variable
		Map<Integer, Persona> personas = new HashMap<>();
		personas.put(1, new Persona("Fran", 10000));
		personas.put(2, new Persona("Pepe", 20000));
		personas.put(3, new Persona("Jose", 30000));
		personas.put(4, new Persona("Yo", 40000));

		Persona persona3 = personas.get(3);
		System.out.println(persona3);

	}

	public static void ejemploSet() {
		// NO PERMITE ELEMENTOS DUPLICADOS
		Set<Persona> personas = new HashSet<>();
		personas.add(new Persona("Fran", 10000));
		personas.add(new Persona("Fran", 200));// la ignora por el hash code and equals
		personas.add(new Persona("Fran", 300));// la ignora en este caso nombre es igual
		personas.add(new Persona("fran", 20000));
		personas.add(new Persona("Pepe", 30000));
		personas.add(new Persona("Jose", 40000));
		personas.add(new Persona("Yo", 50000));
		System.out.println(personas.size());

	}

	public static void ejercicio1() {

		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		numeros.add(50);
		numeros.add(60);
		numeros.removeIf(e -> e == 20);
		numeros.add(1, 25);
		numeros.add(2, 26);
		System.out.println(numeros);
//		numeros.sort(Comparator.reverseOrder());// esto da la vuelta y ordena
//		numeros.sort(Collections.reverseOrder());// esto da la vuelta y ordena
		Collections.reverse(numeros);//esto le da la vuelta sin ordenar ni desordenar
//		numeros.sort((e1,e2)->e2-e1);// esto da la vuelta y ordena hecho a mano
		
		System.out.println(numeros);

	}

	public static void main(String[] args) {
//    	ejemploListas();	
//    	ejemploMap();
//    	ejemploSet();
		ejercicio1();
	}

}
