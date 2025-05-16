package Tasca2;

	import java.time.LocalDate;
	import java.time.Period;

class Comercial extends Empleat {
    private double comissio;

    public Comercial(String dni, String nom, String cognoms, LocalDate dataNaixement, double salari, double comissio) {
        super(dni, nom, cognoms, dataNaixement, salari);
        this.comissio = comissio;
    }

    public double getComissio() { 
    	return comissio; 
    }
    
    public void setComissio(double comissio) { 
    	this.comissio = comissio; 
    }
    
    public void aplicarComissio() {
        if (getEdat() > 30) {
            this.comissio += 200;
        }
    }

    public String toString() {
        return super.toString() + ", Comissió: " + comissio;
    }
}