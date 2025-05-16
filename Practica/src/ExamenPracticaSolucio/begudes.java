package ExamenPracticaSolucio;

abstract class begudes {

	private int id;
	private double litres;
	private double preu;
	private String marca;
	
	public begudes(int id,double litres, double preu, String marca) {
		this.id = id;
		this.litres = litres;
		this.preu = preu;
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getLitres() {
		return litres;
	}
	
	public double getPreu() {
		return preu;
	}
	
	public void setPreu(double newPreu) {
		this.preu = newPreu;
	}
	
	public abstract String toString();

}
