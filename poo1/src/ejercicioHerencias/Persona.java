package ejercicioHerencias;

import java.util.Objects;

public class Persona {
	String dni;
	String nombre;
	int edad;
	
	
	public Persona() {}


	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(Persona p) {
		super();
		dni = p.dni;
		nombre = p.dni;
		edad = p.edad;
	}


	public String getdni() {
		return dni;
	}


	public void setdni(String dni) {
		this.dni = dni;
	}


	public String getnombre() {
		return nombre;
	}


	public void setnombre(String nombre) {
		this.nombre = nombre;
	}


	public int getedad() {
		return edad;
	}


	public void setedad(int edad) {
		this.edad = edad;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}


	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
