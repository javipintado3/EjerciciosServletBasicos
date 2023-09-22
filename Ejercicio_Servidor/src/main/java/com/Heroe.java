package com;

public class Heroe {

	
	private String nombreHeroe;
	private String nombreReal;
	private String compania;
	public Heroe(String nombreHeroe, String nombreReal, String compania) {
		super();
		this.nombreHeroe = nombreHeroe;
		this.nombreReal = nombreReal;
		this.compania = compania;
	}
	public String getNombreHeroe() {
		return nombreHeroe;
	}
	public void setNombreHeroe(String nombreHeroe) {
		this.nombreHeroe = nombreHeroe;
	}
	public String getNombreReal() {
		return nombreReal;
	}
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	@Override
	public String toString() {
		return "Heroe [nombreHeroe=" + nombreHeroe + ", nombreReal=" + nombreReal + ", compania=" + compania + "]";
	}
	
	
	
	
	
}
