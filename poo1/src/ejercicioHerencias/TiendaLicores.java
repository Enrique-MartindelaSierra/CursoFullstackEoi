package ejercicioHerencias;

public class TiendaLicores extends Tienda {

	public TiendaLicores() {
		
	}
	
	@Override
	public void bienvenida() {
		super.bienvenida();
		System.out.println("si eres menor de 18 años fuera de aqui :)");
	}
	
}
