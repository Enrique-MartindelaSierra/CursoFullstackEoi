package com.enrique.harrypotter.utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializacionUtils {

	public static <T> boolean serializarListaDeObjetos(String rutaCompleta, List<T> Objetos) {
		File fichero = new File(rutaCompleta);
		try {
			ObjectOutputStream ficheroObjetos = new ObjectOutputStream(new FileOutputStream(fichero));
			ficheroObjetos.writeObject(Objetos);
			ficheroObjetos.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;		
	}
	
	
	
	public static <T> List<T> desSerializarListaObjetos(String rutaCompleta){
		File fichero = new File(rutaCompleta);
		try {
			ObjectInputStream ficheroObjetos = new ObjectInputStream(new FileInputStream(fichero));
			List<T> resultado = (List<T>)ficheroObjetos.readObject();
			ficheroObjetos.close();
			return resultado;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		return null;
	}
	
}
