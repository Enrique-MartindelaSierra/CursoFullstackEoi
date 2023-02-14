package poo1;

public class Mamifero extends Animal {

	private boolean carnivoro;

	public Mamifero(String nombre, double peso, boolean carnivoro) {
		super(nombre, peso);
		this.carnivoro = carnivoro;
	}

	@Override
	public void comer() {
		super.comer(); // aqui llamamos al comer de mi padre en este caso Animal
		System.out.println("He comido: " + (carnivoro ? "carne" : "hierba"));
	}

	public String tipoAnimal() {
		return "Mamifero";
	}

	public String rugido() {
		return "Grrrrr";
	}

	@Override
	public String toString() {
		return "Esto es un Mamifero";
	}
	
	
	

}
