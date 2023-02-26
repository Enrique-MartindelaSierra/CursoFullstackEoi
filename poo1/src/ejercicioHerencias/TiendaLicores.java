package ejercicioHerencias;

//si pones el modificador final a una clase, no se podrá heredar de ella
public final class TiendaLicores extends Tienda {

	public TiendaLicores() {
		
	}
	
	@Override
	public void bienvenida() {
		super.bienvenida();
		System.out.println("si eres menor de 18 años fuera de aqui :)");
	}
	
}
