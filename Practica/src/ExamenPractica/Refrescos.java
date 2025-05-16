package ExamenPractica;

abstract class Refrescos implements magatzem{
	private char id;
	private double litre;
	private double preu;
	private String marca;
	private double persentatgeSucre;
	
	public Refrescos(char id, String marca, double litre, double preu, double persentatgeSucre) {
		this.id = id;
		this.marca = marca;
		this.litre = litre;
		this.preu = preu;
		this.persentatgeSucre = persentatgeSucre;
	}
	
	public char getId () {
		return id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca() {
		
	}
	
	public double getLitre() {
		return litre;
	}
	
	public double getPersentatge() {
		return persentatgeSucre;
	}
	
	public double getpreu() {
		return preu;
	}
	
	public void setPreu(double descompte) {
		descompte = preu * 0.10;
	}
}
