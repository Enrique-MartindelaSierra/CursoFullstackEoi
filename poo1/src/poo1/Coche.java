package poo1;

import java.util.Objects;

public class Coche {

	// 1. Propiedades o atributos
	private int numeroRuedas;
	private String marca;
	private String modelo;
	private String matricula;
	private double precio;

	// 2. Declaramos los constructores

	// 2. 1 Constructor vacio. Permite crear un objeto sin datos

	public Coche() {

	}

	// 2.2 Constructor con todos los parametros

	public Coche(int numeroRuedas, String marca, String modelo, String matricula, double precio) {
		super();
		this.setNumeroRuedas(numeroRuedas);
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.setPrecio(precio);
	}
	
	// 2.3 Crear tantos constructores como se deseen
	public Coche(int numeroRuedas, String marca, String modelo, double precio) {
		super();
		this.numeroRuedas = numeroRuedas;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.matricula = "0000-AAA";
	}
	
	
	// 2B. Constructor de copia(Optativo*)

	

	public Coche(Coche c) {
		super();
		this.setNumeroRuedas(c.numeroRuedas);
		this.marca = c.marca;
		this.modelo = c.modelo;
		this.matricula = c.matricula;
		this.setPrecio(c.precio);
	}
	

	

	// 3. generar getters and setters

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = Math.abs(numeroRuedas); // si me ponen un numero negativo lo pasa a positivo
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		if(matricula == null) {
			return "sin matricula";
		}
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio < 0) {
			this.precio = 0;
		} else {
			this.precio = precio;
		}
	}

	//4. toString te permite decidir como quieres imprimir el objeto
	@Override
	public String toString() {
		return "Coche [numeroRuedas=" + numeroRuedas + ", marca=" + marca + ", modelo=" + modelo + ", matricula="
			+ getMatricula() + ", precio=" + precio + "]";
	}

	
	//5. esto nos da un equals para comparar
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matricula, other.matricula);
	}

	//6. metodos propios de clase
	
	
	
	
}
