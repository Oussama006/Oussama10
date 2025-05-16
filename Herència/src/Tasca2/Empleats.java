package Tasca2;

	import java.time.LocalDate;
	import java.time.Period;

class Empleat {
	
    private String dni;
    private String nom;
    private String cognoms;
    private LocalDate dataNaixement;
    private double salari;

    public Empleat(String dni, String nom, String cognoms, LocalDate dataNaixement, double salari) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataNaixement = dataNaixement;
        this.salari = salari;
    }

    public String getDni() { 
    	return dni; 
    }
    
    public String getNom() { 
    	return nom; 
    }
    
    public String getCognoms() { 
    	return cognoms; 
    }
    
    public LocalDate getDataNaixement() { 
    	return dataNaixement; 
    }
    
    public double getSalari() { 
    	return salari; 
    }
    
    public void setSalari(double salari) { 
    	this.salari = salari; 
    }
    
    public int getEdat() {
        return Period.between(dataNaixement, LocalDate.now()).getYears();
    }

    public String toString() {
        return "Empleat: " + nom + " " + cognoms + ", DNI: " + dni + ", Edat: " + getEdat() + ", Salari: " + salari;
    }
}
