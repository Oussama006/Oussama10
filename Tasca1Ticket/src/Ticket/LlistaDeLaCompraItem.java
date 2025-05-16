package Ticket;

import java.util.*;

class LlistaDeLaCompraItem {

	private String nom;
	private int quantitat;
	private double preuUnitari;
	
	public LlistaDeLaCompraItem (String nom, int quantitat, double preuUnitari) {
		this.nom = nom;
		this.quantitat = quantitat;
		this.preuUnitari = preuUnitari;
	}
	
	public double getImportTotal() {
		return quantitat * preuUnitari ;
	}
	
	public void setQuantitat(int quantitiat) {
		this.quantitat = quantitiat;
	}
	
	public String toString() {
		return quantitat + " " + nom + " " + preuUnitari + "€/u     " + getImportTotal() + "€";
	}
}
