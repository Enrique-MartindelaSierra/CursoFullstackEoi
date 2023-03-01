	package com.enrique.json;

import java.util.ArrayList;
import java.util.List;

import com.enrique.json.entidades.Film;
import com.enrique.json.entidades.People;
import com.enrique.json.entidades.Posts;
import com.enrique.json.utilidades.JsonUtils;

/**
 * 
 *
 */
public class App 
{
	static List<Posts> publicaciones = new ArrayList<Posts>();
	
    public static void main( String[] args )
    {
//        JsonUtils.leerJsonDesdeFichero("profesor.json");
//        publicaciones = JsonUtils.leerPostInternet("https://jsonplaceholder.typicode.com/posts");
//        publicaciones.stream()
//        .filter(e->e.getId()%2==0) //publicaciones pares
//        .forEach(e-> System.out.println(e));
    	
//    	  People luke = JsonUtils.leerPersonaje("https://swapi.dev/api/people/1?format=json");
//    			  System.out.println(luke);
		  
//		 List<People> personajes1a10 = JsonUtils.leerPersonajes("https://swapi.dev/api/people/", 1, 10, "?format=json");
//		 personajes1a10.forEach(e-> System.out.println(e));
    
//		 List<Film> peliculas1a5 = JsonUtils.leerObjetos("https://swapi.dev/api/films/", 1, 5, "?format=json", Film.class);
//		 peliculas1a5.forEach(e-> System.out.println(e));
		 
    	publicaciones = JsonUtils.devolverArrayGsonGenerico("https://jsonplaceholder.typicode.com/posts", Posts[].class);
    	publicaciones.stream()
    	.filter(e->e.getId()%2==0) //publicaciones pares
    	.forEach(e-> System.out.println(e));
    	
    }
}
