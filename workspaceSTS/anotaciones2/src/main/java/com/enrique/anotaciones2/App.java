package com.enrique.anotaciones2;

import java.util.HashSet;

import com.enrique.anotaciones2.entities.Autores;
import com.enrique.anotaciones2.entities.Libros;
import com.enrique.anotaciones2.utils.HibernateUtils;

public class App {

	public static void mostrarLibros() {
		HibernateUtils.openSession();
		HibernateUtils.devolverListaObjetos("Libros").forEach(e->System.out.println(e));
		HibernateUtils.closeSession();
	}
	
	public static void mostrarAutores() {
		HibernateUtils.openSession();
		HibernateUtils.devolverListaObjetos(Autores.class).forEach(e->System.out.println(e));
		HibernateUtils.closeSession();
	}
	
	public static void anyadirAutor() {
		HibernateUtils.openSession();
		HibernateUtils.save(new Autores("AAAAA", "nombre de prueba", new HashSet<Libros>(0)));
		HibernateUtils.closeSession();
	}

	public static void modificarAutor() {
		HibernateUtils.update(Autores.class, "nombre='Nombre de prueba'", new Autores(null,"Update Genérico",null));
	}
	
	public static void modificarLibro() {
		HibernateUtils.update(Libros.class, "id=2", new Libros(2,"Manual EOI",null));
	}
	
	public static void borrarAutor() {
		int registrosBorrados = HibernateUtils.delete(Autores.class, "cod='AAAAB'");
		System.out.println("Se han borrado " + registrosBorrados + " registros");
	}
	
    public static void main( String[] args )
    {
    	java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.SEVERE);
    	//mostrarLibros();
    	HibernateUtils.openSession();
    	//mostrarAutores();
    	//anyadirAutor();
    	//mostrarAutores();
    	//modificarAutor();
    	//mostrarAutores();
    	//modificarLibro();
    	//mostrarLibros();
    	//borrarAutor();
    	mostrarAutores();
    	HibernateUtils.closeSession();
    }
}
