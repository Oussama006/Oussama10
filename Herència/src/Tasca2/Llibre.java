package Tasca2;

class Llibre {
	
	private String autor;
	private float preuCost;
	private float preuVenta;
	private String titol;
	private int numPags;
	
	public Llibre (String autor, float preuCost, float preuVenta, String titol, int numPags){
		this.autor = autor;
		this.preuCost = preuCost;
		this.preuVenta = preuVenta;
		this.titol = titol;
		this.numPags = numPags;
	}
	
	public String getAutor (){
		return autor;
	}
	public float getPreuCost (){
		return preuCost;
	}
	public float getPreuVenta (){
		return preuVenta;
	}
	public int getNumPags (){
		return numPags;
	}
	public String getTitol (){
		return titol;
	}
	
	public void setPreuVenta (float preuVenta) {
		this.preuVenta = preuVenta;
	}
	
	public float obtenirIVA (){
		return (preuVenta * 4)/100;
	}
	
	public float obtenirBenefici (){
		return preuCost - preuCost - obtenirIVA();
	}
	
	public void titolToString (){
		System.out.println("El titol del llibre és "+ titol);
	}
}