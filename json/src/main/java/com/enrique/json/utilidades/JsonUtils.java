package com.enrique.json.utilidades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.enrique.json.entidades.Film;
import com.enrique.json.entidades.People;
import com.enrique.json.entidades.Posts;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

	public static void leerJsonDesdeFichero(String ruta) {

		Object obj;

		try {
			// parseado del fichero que le pasemos
			// (comprobar que la estructura del Json es correcta)
			obj = new JSONParser().parse(new FileReader(ruta));
			// casteando obj al objeto JSONObject
			JSONObject jo = (JSONObject) obj;
//					JSONObject jo2= (JSONObject)new JSONParser().parse(new FileReader(ruta)); // equivale a las 2 lineas anteriores

			String nombre = (String) jo.get("nombre");
			String apellido = (String) jo.get("apellido");
			System.out.println(nombre);
			System.out.println(apellido);
			long edad = (long) jo.get("edad");
			System.out.println(edad);
			
			//forma 1 de acceder a una variable compuesta
			//cojo la direccion del json
			Map domicilio = (Map) jo.get("domicilio");
			//recorro domicilio dentro del map
			Iterator<Map.Entry> itr1 = domicilio.entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pareja = itr1.next();
				System.out.println(pareja.getKey() + ":" + pareja.getValue());
			}

			//forma 2 de acceder a una variable compuesta
			//tratarlo como un json dentro de un json
			JSONObject domicilio2= (JSONObject)jo.get("domicilio");
			System.out.println("Dirección: "+(String)domicilio2.get("direccion"));
			
			//leyendo arrays. forma 1 tratandolo como una lista
			System.out.println("Leyendo el array como una lista");
			JSONArray ja =(JSONArray)jo.get("numerosTelefonos");
			for(Object elemento : ja) {
				System.out.println(((JSONObject)elemento).get("tipo"));
				System.out.println(((JSONObject)elemento).get("numero"));				
			}
			
			//forma 2 tratandolo como un array
			System.out.println("Leyendo el array como un array");
			 ja =(JSONArray)jo.get("numerosTelefonos");
			 Iterator array = ja.iterator();
			 while(array.hasNext()) {
				 Iterator<Map.Entry> elementos = ((Map)array.next()).entrySet().iterator();
				 while(elementos.hasNext()) {
					 
				 Map.Entry pareja = elementos.next();
				 System.out.println(pareja.getKey() + ":" + pareja.getValue());
				 }
			 }
			 
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

	
	public static List<Posts> leerPostInternet(String url) {
		Object obj;
		List<Posts> resultado = new ArrayList<Posts>();
		
			try {
				obj = new JSONParser().parse(InternetUtils.readUrl(url));
		
			JSONArray ja = (JSONArray) obj;
			Iterator<?> elementos = ja.iterator();
			elementos.forEachRemaining(e-> {
				JSONObject elemento=(JSONObject)e;
				resultado.add(new Posts(
						(long)elemento.get("userId"),
						(long)elemento.get("id"),
						(String)elemento.get("title"),
						(String)elemento.get("body")
						));
			});
			
			return resultado;
			
	} catch (ParseException e1) {
	
		e1.printStackTrace();
		return null;
	}
	}

	public static void escribirJsonSimple() {
		// creando JSONObject
		JSONObject jo = new JSONObject();

		// poniendo los primeros datos en JSONObject
		jo.put("nombre", "Fran");
		jo.put("apellido", "Garcia");
		jo.put("edad", 25);

		// para la dirección primero hay que crear un LinkedHashMap
		Map m = new LinkedHashMap(4);
		m.put("direccion", "Lillo Juan, 128");
		m.put("ciudad", "San Vicente del Raspeig");
		m.put("comunidad", "Valenciana");
		m.put("codigoPostal", "03690");

		// domicilio a JSONObject
		jo.put("domicilio", m);

		// para los números de teléfono primero crear el JSONArray
		JSONArray ja = new JSONArray();

		m = new LinkedHashMap(2);
		m.put("tipo", "casa");
		m.put("numero", "666 666 666");
		// añadiendo a la lista
		ja.add(m);
		m = new LinkedHashMap(2);
		m.put("tipo", "movil");
		m.put("numero", "777 777 777");
		// añadiendo a la lista
		ja.add(m);

		// añadiendo los números de teléfono al JSONObject
		jo.put("numerosTelefonos", ja);

		// Escribiendo el:"profesor.json" in cwd
		PrintWriter pw;
		try {
			pw = new PrintWriter("profesor.json");
			pw.write(jo.toJSONString());
			pw.flush();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static People leerPersonaje(String url) {
			return new Gson().fromJson(InternetUtils.readUrl(url), People.class);	
	}
	
	public static Film leerFilm(String url) {
		return new Gson().fromJson(InternetUtils.readUrl(url), Film.class);	
	}
	
	//este metodo sustituye a los 2 anteriores
	public static <T> T leerObjeto(String url, Class<T> clase) {
		return new Gson().fromJson(InternetUtils.readUrl(url), clase);	
	}

	
	public static List<People> leerPersonajes(String comienzoCadena, int numInicio, int numFin , String finCadena){
		List<People> resultado = new ArrayList<People>();
		for(int i = numInicio; i<=numFin; i++) {
			resultado.add(leerPersonaje(comienzoCadena+i+finCadena));
		}
		return resultado;
		
	}
	

	public static <T> List<T> leerObjetos(String comienzoCadena, int numInicio, int numFin , String finCadena , Class<T> clase){
		List<T> resultado = new ArrayList<T>();
		for(int i = numInicio; i<=numFin; i++) {
			resultado.add(leerObjeto(comienzoCadena+i+finCadena, clase));
		}
		return resultado;
		
	}
	
	public static <T> List<T> devolverArrayGsonGenerico(String url, Class<T[]> clase){
		return Arrays.asList(new Gson().fromJson(InternetUtils.readUrl(url), clase)); 	
	}
	
	
	
	public static <T> String crearJsonPretty(T object) {
		
		return new GsonBuilder().setPrettyPrinting().create().toJson(object);
		
	}
	
}
