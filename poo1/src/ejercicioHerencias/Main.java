package ejercicioHerencias;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void prueba() {
		
		
		Tienda tienda = new Tienda();
		TiendaLicores tiendal = new TiendaLicores();
		tienda.bienvenida();
		tiendal.bienvenida();
	}
	
	public static void prueba2() {
	
		Persona persona1 = new Persona("111","yo",11);
		Persona persona2 = new Persona("222","eric",22);
		Persona persona3 = new Persona("333","tu",33);
		Persona persona4 = new Persona("444","él",44);
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		Persona copia = new Persona(persona2);
		copia.setnombre("enrique");
		
		//esto solo serviria con datos unicos
		personas.forEach(e->System.out.println(copia.equals(e)? "SUS en "+ (personas.indexOf(e)+1)+"\n"+ e.toString(): "Tripulacion" ));
		
		
		
	}

	public static void main(String[] args) {

//		prueba();
		prueba2();

	}

}
