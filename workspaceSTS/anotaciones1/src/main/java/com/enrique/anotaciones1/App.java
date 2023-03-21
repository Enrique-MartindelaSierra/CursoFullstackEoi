package com.enrique.anotaciones1;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.enrique.anotaciones1.entities.Autores;
import com.enrique.anotaciones1.entities.Libros;

public class App 
{
	static SessionFactory sessionFactory;
	static Session session;
	
	public static void openSession() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		if (session != null) {
			System.out.println("Sesión abierta correctamente");
		} else {
			System.out.println("Fallo al abrir la sesión");
		}

	}
	
	public static void closeSession() {
		sessionFactory.close();
		session.close();
		System.out.println("sesión cerrada");
		
	}
	
	
	public static void mostrarLibros() {
		List<Libros> libros = session.createSelectionQuery("from Libros", Libros.class).list();
//		List<Libros> libros = session.createQuery("from Libros").list();
		libros.forEach(e -> System.out.println(
				"Nombre del libro: " + e.getTitulo() + ". " + " Nombre del autor: " + e.getAutores().getNombre()));
	}
	
	public static void mostrarAutores() {
		List<Autores> autores = session.createSelectionQuery("from Autores", Autores.class).list();
		autores.forEach(e -> System.out.println(e));
	}

	public static void anyadirAutor(String cod, String nombre, Set<Libros> libros) {
		Transaction trans= session.beginTransaction();//abro la transaccion
		Autores autor = new Autores(cod, nombre, libros);
		session.persist(autor); //antiguo save
		trans.commit();//confirmo cambios
		System.out.println("autor añadido");
		
	}
	
	
	public static void anyadirLibro(int id, Autores autor, String titulo) {
		Transaction trans= session.beginTransaction();//abro la transaccion
		session.persist(new Libros(id, autor, titulo)); //antiguo save
		trans.commit();//confirmo cambios
		System.out.println("Libro añadido");
		
	}

	public static void updateAutor(String nombreAntiguo, String nombreNuevo) {
		List<Autores> autores = session.createSelectionQuery("from Autores where nombre='"+ nombreAntiguo + "'", Autores.class).list();
		Transaction trans= session.beginTransaction();//abro la transaccion
		autores.forEach(e->{
			e.setNombre(nombreNuevo);
			session.merge(e);
			}); //actualiza los nombres de todos los resultados
		trans.commit();
		session.clear();
		System.out.println("Nombre actualizado");
		
	}
	
	public static void deleteLibro(int id) {
		List<Libros> libros = session.createSelectionQuery("from Libros where id='"+ id + "'", Libros.class).list();
		if(libros.size()>0) {
			Transaction trans= session.beginTransaction();//abro la transaccion
			session.remove(libros.get(0));
			trans.commit();
			session.clear();
			System.out.println("Libro borrado");
		}else {
			System.out.println("No existe libro a borrar");
		}
		
		
	}
	
    public static void main( String[] args )
    {
    	 openSession();
    	 
    	 
    	 closeSession();
    }
}
