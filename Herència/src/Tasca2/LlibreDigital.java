package Tasca2;

class LlibreDigital extends Llibre{

	private String urlDescarrega;
	private int tamanyMB;
	
	public LlibreDigital(String autor, float preuCost, float preuVenta, String titol, int numPags, String urlDescarrega, int tamanyMB) {
		super(autor, preuCost, preuVenta, titol, numPags);

		this.urlDescarrega = urlDescarrega;
		this.tamanyMB = tamanyMB;
		
	}
	
	public String getUrlDescarrega (){
		return urlDescarrega;
	}
	
	public void setUrldDescarrega (String urlDescarrega){
		this.urlDescarrega = urlDescarrega;
	}
	
	public int getTamantMB (){
		return tamanyMB;
	}
	
	public float tamanyPag(){
		return (float) tamanyMB / getNumPags();
	}
	
}