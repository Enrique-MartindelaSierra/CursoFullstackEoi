package com.enrique.ejercicioDeClases.entidades;

import java.util.Objects;

import com.enrique.ejercicioDeClases.enumerados.NivelDeCatalan;

public final class CuentaSabadell extends Cuenta{
	
	private NivelDeCatalan nivelDeCatalan;
	

	public CuentaSabadell(String dni, String nombre, String fecha, String pais, double saldo,
			NivelDeCatalan nivelDeCatalan) {
		super(dni,  nombre,  fecha,  pais, saldo);
		this.nivelDeCatalan = nivelDeCatalan;
	}
	
	public CuentaSabadell(CuentaSabadell c) {
		super(c);
		this.nivelDeCatalan = c.nivelDeCatalan;
	}

	public NivelDeCatalan getNivelDeCatalan() {
		return nivelDeCatalan;
	}

	public void setNivelDeCatalan(NivelDeCatalan nivelDeCatalan) {
		this.nivelDeCatalan = nivelDeCatalan;
	}

	@Override
	public String toString() {
		return "CuentaSabadell {nivelDeCatalan=" + nivelDeCatalan + ", getDni()=" + getDni() + ", getNombre()="
				+ getNombre() + ", getFecha()=" + getFecha() + ", getPais()=" + getPais() + ", getSaldo()=" + getSaldo()
				+ "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nivelDeCatalan);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaSabadell other = (CuentaSabadell) obj;
		return nivelDeCatalan == other.nivelDeCatalan;
	}


	
	
	
}

	
	

