package herencia;

import java.util.Date;

public class Repartidor extends empleats{

	private String zona;
	
	public Repartidor(char dni, String nom, String cognoms, Date data_naix, double salari, String zona) {
		super(dni, nom, cognoms, data_naix, salari);
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}
	
	public void setZona(String newZona) {
		if() {
			
		}
	}

}
