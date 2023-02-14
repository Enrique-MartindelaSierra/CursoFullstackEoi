package poo1;

import java.util.ArrayList;
import java.util.List;

public class Ejemplos {
	public static void ejemplosCoches() {
		// usa el constructor vacio
		Coche miCoche = new Coche(); // me crea un coche sin datos
//		miCoche.numeroRuedas = -4;  //esto falla por declararlos private(encapsularlo)
//		miCoche.marca = "Seat";
//		miCoche.modelo = "Altea";
		miCoche.setNumeroRuedas(-4);
		miCoche.setMarca("Seat");
		miCoche.setModelo("Altea");
		miCoche.setPrecio(-10000);
		miCoche.setMatricula("2222-EOI");
		System.out.println(miCoche); // probando to string
		System.out.println("Mi coche es un " + miCoche.getMarca() + " " + miCoche.getModelo() + " con matricula: "
				+ miCoche.getMatricula());

		// usa el constructor con parametros
		Coche z3 = new Coche(-4, "BMV", "Z3", "1111-BBB", 20000);
		System.out.println(z3); // probando to string

		Coche mercedes = new Coche(4, "mercedes", "prime", 30000);
		System.out.println(mercedes);

		// probando el constructor de copia
		Coche clonZ3 = new Coche(z3);
		clonZ3.setMatricula("2222-CCC");
		System.out.println(clonZ3);

		// ERROR tipico de programador
		Coche intentoClon = z3; // esto no crea un nuevo coche, al coche existente ahora tiene 2 nombres
		z3.setPrecio(5000);
		intentoClon.setNumeroRuedas(5);
		System.out.println(intentoClon); // mismo coche
		System.out.println(z3); // mismo coche

		// probando equals
		if (z3.equals(clonZ3)) {
			System.out.println("los coches son iguales");
		} else {
			System.out.println("los coches son distintos");
		}
	}

	public static void ejemplosJugadores() {

		Jugador enrique = new Jugador();
		enrique.setNombre("Enrique");
		enrique.setEdad(20);
		enrique.setSueldo(3000);
		Jugador fran = new Jugador("Fran", -40, -1000);
		Jugador david = new Jugador(enrique);
		david.setNombre("David");
		david.setSueldo(2000);
		System.out.println(enrique);
		System.out.println(fran);
		System.out.println(david);

	}

	public static void ejemploListaJugadores() {
		// creo una lista para almacenar jugadores
		List<Jugador> jugadores = new ArrayList<Jugador>();

		Jugador enrique = new Jugador();
		enrique.setNombre("Enrique");
		enrique.setEdad(20);
		enrique.setSueldo(3000);
		Jugador fran = new Jugador("Fran", -40, -1000);
		Jugador david = new Jugador(enrique);
		david.setNombre("David");
		david.setSueldo(2000);

		// meter jugadores en la lista
		jugadores.add(enrique);
		jugadores.add(fran);
		jugadores.add(david);

		// lo creas directamente dentro de la lista, pero no existe fuera de ella
		jugadores.add(new Jugador("Naomi", 20, 8000));

		// imprimir todos los jugadores
		jugadores.forEach(e -> System.out.println(e));
		// filtra e imprime
		System.out.println("jugadores que ganan mas de 2500");
		jugadores.stream().filter(e -> e.getSueldo() > 2500).forEach(e -> System.out.println(e));

	}

	public static void ejemplosHerencias() {
//		Animal animal = new Animal("mi animal", 1); //esto ya no funciona por que hemos declarado Animal como abstracto
		Ave pajaro = new Ave(true);
		//podemos declarar un nuevo Ave como Animal ya que es una clase que hereda del abstracto
		Animal gallina = new Ave("Animal desconocido", 1, false);
//		pajaro.comer();
		pajaro.ponerHuevos();

		System.out.println("el pajaro se llama: " + pajaro.getNombre());

		Mamifero leon = new Mamifero("Leon", 210, true);
		leon.comer();

		System.out.println(pajaro);
		System.out.println(leon);
		
		Mamifero gato = new Mamifero("Animal desconocido", 1, true);
		
		System.out.println(pajaro.equals(gallina));
		//aunque se llaman igual, pesan lo mismo y son animales, nos dice que no son iguales por que no son la misma clase
		System.out.println(pajaro.equals(gato));
	
		gallina.setNombre("Gallina");
		System.out.println(pajaro.pollitos(pajaro.getNombre()));
		
		
		List<Animal> animales= new ArrayList<Animal>();
		animales.add(pajaro);
		animales.add(gallina);
		animales.add(leon);
		animales.add(gato);
		animales.forEach(e->System.out.println(e)); //aqui hay polimorfismo
		animales.forEach(e->System.out.println(e.rugido())); //aqui hay polimorfismo
		
		System.out.println("Ejemplo instanceof");
		for(Animal animal: animales){
			if(animal instanceof Ave) {
			System.out.println("El numero de pollitos es: "+ ((Ave)animal).pollitos(animal.getNombre()));
			}else if(animal instanceof Mamifero) {
				System.out.println(animal.rugido());
			}
		}
	}

	public static void main(String[] args) {
//		ejemplosCoches();
//		ejemplosJugadores();
//		ejemploListaJugadores();
		ejemplosHerencias();
	}

}
