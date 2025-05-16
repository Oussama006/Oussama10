package herencia;

class llibre {

	private String autor;
	private float preuCost;
	private float preuVenta;
	private String titol;
	private int numPags;
	
	public llibre(String autor, float preuCost, float preuVenta, String titol, int numPags) {
		this.autor = autor;
		this.numPags = numPags;
		this.preuCost = preuCost;
		this.preuVenta = preuVenta;
		this.titol = titol;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public float getPreuCost() {
		return preuCost;
	}
	
	public float getPreuVenta() {
		return preuVenta;
	}
	
	public String gettitol() {
		return titol;
	}
	
	public int getnumPags() {
		return numPags;
	}
	
	public void setPreuVenta(float newpreuVenta) {
		this.preuVenta = newpreuVenta;
	}
	
	public float obtenirIva() {
		return (float) (preuVenta * 0.04);
	}
	
	public float obtenirBenefici() {
		return preuVenta - preuCost - obtenirIva();
	}
	
	public void titolToString() {
		System.out.println("El titol del llibre és " + gettitol());
	}
}