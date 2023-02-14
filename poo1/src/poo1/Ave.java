package poo1;

import java.util.Random;

public class Ave extends Animal implements IHablador, IAnidar {
	private boolean puedeVolar;

	public Ave(boolean puedeVolar) {
		super(); // cojo el constructor de mi padre			
		this.puedeVolar = puedeVolar;
	}
	
	public Ave(String nombre, double peso, boolean puedeVolar) {
		 super(nombre, peso); //está llamando al constructor de Animal con esos dos parametros
		 this.puedeVolar = puedeVolar;
	}

	public boolean getPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	public void ponerHuevos() {
		int numHuevos = new Random().nextInt(6) + 1;
//		System.out.printf("He puesto %d huevos\n", numHuevos);
		System.out.printf("He puesto %d huevos y peso %.2f kilos\n",
				 numHuevos, getPeso());
	}
	
	public String tipoAnimal() {
		return "Ave";
	}

	public String rugido() {
		return "Pio pio";
	}

	@Override
	public void hablar() {
		System.out.println("hola. craa");		
	}

	@Override
	public void gritar() {
		System.out.println("CACRAAAA");	
		
	}


	@Override
	public int pollitos(String nombre) {
		if(nombre.equals("Animal desconocido"))
			return 0;
		else if(nombre.equals("Gallina"))
			return 3;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "Esto es un Ave";
	}
	
	
	
}