package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejemplos {

	/**
	 * Funcion que nos lee todo el contenido de un fichero i nos imprimie sus lineas
	 * por consola utilizando Java8
	 * 
	 * @param nombreFichero
	 */
	public static void leerFicheroJava5(String nombreFichero) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(nombreFichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	/**
	 * -Funcion que nos lee todo el contenido de un fichero i nos imprimie sus lineas
	 * por consola utilizando Java8 
	 * -Files nos permite trabajar con el contenido de
	 * los ficheros 
	 * -Paths nos permite trabajar con las rutas del ordenador(ej:
	 * C:/ficheros/archivo.txt)
	 * 
	 * @param nombreFichero
	 * @throws IOException
	 */

	public static void leerFicheroJava8(String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(nombreFichero)).forEach(l -> System.out.println(l));

	}
	
	/**
	 * Método que lee un fichero y devuelve sus lineas en una lista
	 * @param ruta Path con la ruta del fichero
	 * @return Lista de cadenas, una por cada línea.
	 */
	public static List<String> devolverLineasJava8(Path ruta){
		try {
			List<String> lineas = Files.readAllLines(ruta,Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("No se puede acceder al fichero. Error en devolverLineasJava8");
			return null;
		}
	}
	

	public static void main(String[] args) throws IOException {
		leerFicheroJava5("C:\\ficheros\\archivo.txt");
		leerFicheroJava5("C:\\ficheros\\archivo.txt");
	}

}
