package poo1.ejercicio4h;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	
	public static void prueba() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado1 = new Empleado("Fran", 5000);
		Empleado empleado2 = new Empleado("Enrique", 4000);
		Empleado empleado3 = new Empleado("David", 3000);
		Empleado empleado4 = new Empleado("Isidro", 2000);
//		Empleado empleado5 = new Empleado("Atenea", 1000);
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		Direccion direccion = new Direccion("calle Fran", 25);
		
		Empresa empresa = new Empresa("Amazon", direccion, empleados, 5);
		
		//podemos hacer esto directamente sobre la marcha en menos lineas y menos variables desde el constructor vacio
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Aliexpress");
		empresa2.getEmpleados().add(new Empleado("asi", 51));
		empresa2.getDireccion().setNombreCalle("esa");
		empresa2.getDireccion().setNumeroCalle(2);
		
		Empresa copia = new Empresa(empresa);
		copia.getEmpleados().get(0).setNombre("Francisco");
		copia.getDireccion().setNumeroCalle(33);
		copia.getEmpleados().add(empleado4);
		
		System.out.println(empresa);
		System.out.println(copia);
		System.out.println(" ");
		System.out.println(empresa2);
	}
	
	
	
	
	public static void main(String[] args) {
		prueba();

	}

}
