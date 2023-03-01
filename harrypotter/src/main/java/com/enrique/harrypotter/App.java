package com.enrique.harrypotter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.enrique.harrypotter.entidades.Personaje;
import com.enrique.harrypotter.utilidades.JsonUtils;
import com.enrique.harrypotter.utilidades.SerializacionUtils;

/**
 * Hello world!
 *
 */
public class App {
	static List<Personaje> personajes = new ArrayList<Personaje>();

	public static void ejemploSerializar() {
		// Probamos la serialización
        if(SerializacionUtils.serializarListaDeObjetos("personajes.dat", personajes)) {
        	System.out.println("La serialización fue satisfactoria");
        } else {
        	System.out.println("La serialización falló");
        }
	}
	
	public static void obtenerDatosApi() {
		// Obtener los datos de la API
        personajes = JsonUtils.devolverArrayGsonGenerico("https://hp-api.onrender.com/api/characters", Personaje[].class);
        personajes.stream()
        .filter(e->e.getName().equals("Harry Potter"))
        .forEach(e->System.out.println(e));
	}
	
	public static void rellenarFechaNacLD() {
		personajes.stream()
        .peek(e->{
        	if(e.getDateOfBirth()!=null) {
        		e.setDateOfBirthLD(LocalDate.parse(e.getDateOfBirth(),DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        	}
        })
        .filter(e->e.getName().equals("Harry Potter"))
        .forEach(e->System.out.println(e));
	}
	
	public static void ejemploDesSerializar() {
		
		personajes = SerializacionUtils.desSerializarListaObjetos("personajes.dat");
	}
 
	public static void mostrarPersonajes() {
		personajes.forEach(e-> System.out.println(e));
	}
	
    public static void main( String[] args )
    {
//    	obtenerDatosApi();
//    	rellenarFechaNacLD();       
//        ejemploSerializar();
    	ejemploDesSerializar();
    	mostrarPersonajes();
	}
}
