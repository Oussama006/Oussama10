package herencia;

public class llibreDigital extends llibre{

	private String urlDescarrega;
	private int tamanyMB;
	
	public llibreDigital(String autor, float preuCost, float preuVenta, String titol, int numPags, String urlDescarrega, int tamanyMB) {
		super(autor, preuCost, preuVenta, titol, numPags);

		this.urlDescarrega = urlDescarrega;
		this.tamanyMB = tamanyMB;
	}
	
	public String getUrlDescarrega() {
		return urlDescarrega;
	}
	
	public void setUrlDescarrega(String newUrl) {
		this.urlDescarrega = newUrl;
	}
	
	public int getTamanyMB() {
		return tamanyMB;
	}
	
	public float tamanyPag() {
		return tamanyMB/getnumPags();
	}

}
