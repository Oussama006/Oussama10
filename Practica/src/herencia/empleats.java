package herencia;

import java.util.Date;

abstract class empleats {
	private char dni;
	private String nom;
	private String cognoms;
	private Date data_naix;
	private double salari;
	
	public empleats(char dni, String nom, String cognoms, Date data_naix, double salari) {
		this.dni = dni;
		this.cognoms = cognoms;
		this.nom = nom;
		this.data_naix = data_naix;
		this.salari = salari;
	}
	
	public char getDni() {
		return dni;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getCognom() {
		return cognoms;
	}
	
	public Date getData_naix() {
		return data_naix;
	}
	
	public double getsalari() {
		return salari;
	}	
	
	public void setSalati(double newsalari) {
		this.salari = newsalari;
	}
	
	public String toString() {
		return "Nom i cognom: " + getNom() + " " + getCognom() + " amb DNI " + getDni() + " que va neixer el "+ getData_naix() + " cobrant " + getsalari();
	}
}
