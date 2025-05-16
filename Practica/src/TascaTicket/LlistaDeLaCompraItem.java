package TascaTicket;

public class LlistaDeLaCompraItem {

	private String nom;
	private int quantitat;
	private double preuUnitat;
	
	public LlistaDeLaCompraItem(String nom,int quantitat,double preuUnitat) {
		this.nom = nom;
		this.preuUnitat = preuUnitat;
		this.quantitat = quantitat;
	}
	
	public double getImportTotal() {
		return quantitat * preuUnitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}
	
	public String toString() {
		return quantitat + " bolígraf " + preuUnitat + "/€u 	" + getImportTotal() + "€";
	}
	
}
