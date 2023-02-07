package funciones;

public class EjemplosFunciones {

	public static void imprimirHola() {
		// public indica que la fúncion es pública (private, protected, "nada")
		// static significa que es un metodo de clase ("nada" es non-static)
		// void significa que el metodo o función no devuelve nada (cualquier tipo de
		// dato: int, String, char, Objeto, Coche... etc)

		System.out.println("Hola");
	}

	public static void imprimirCadena(String cadena) {
		System.out.println(cadena);
	}

	public static void imprimirDosCadenas(String cadena, String cadena2) {
		System.out.println(cadena + " " + cadena2);
	}

	public static void imprimirSuma(int numero1, int numero2) {
		System.out.println(numero1 + numero2);

	}

	public static void imprimirMenu(String... opciones) { // esto significa: 0 o muchas Strings
		int numOpcion = 1;
		for (String opcion : opciones) {
			System.out.println(numOpcion++ + ". " + opcion);
		}
		System.out.println("0. Salir");
	}
	//el String[] args es para ejecutar el programa con argumentos
	public static void main(String[] args) { // el main en C siempre está abajo asi que es buena costumbre tenerlo ahí
		String cadena = "cadena del main";
		imprimirHola(); // Hola
		imprimirCadena("lo que sea pero cadena");
		// imprimirCadena(5); //no podemos pasarle un tipo de dato diferente al que
		// espera
		imprimirCadena(cadena); // Cadena del main
		System.out.println(cadena + " impresa desde el main");
		imprimirDosCadenas("Primera cadena", "Segunda cadena");
		cadena = "otro contenido";
		imprimirCadena(cadena); // otro contenido
		imprimirSuma(1234, 4321);
		imprimirMenu("Guardar", "Descargar", "Copiar");
		imprimirMenu("Insertar", "Listar", "Actualizar", "Borrar"); // CRUD -> Create, Read, Update, Delete
	}

}
