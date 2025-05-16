package ExamenPractica;

abstract class Aigua implements magatzem {

	private char id;
	private double litre;
	private double preu;
	private String marca;
	private String origen;
	
	public Aigua(char id, String marca, double litre, double preu, String origen) {
		this.id = id;
		this.marca = marca;
		this.litre = litre;
		this.preu = preu;
		this.origen = origen;
	}
	
	public char getId () {
		return id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getLitre() {
		return litre;
	}
	
	public double getPreu() {
		return preu;
	}
	
	public String getOrigen() {
		return origen;
	}
}
