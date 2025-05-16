package Tasca2;

	import java.time.LocalDate;
	import java.time.Period;

class Repartidor extends Empleat {
    private String zona;

    public Repartidor(String dni, String nom, String cognoms, LocalDate dataNaixement, double salari, String zona) {
        super(dni, nom, cognoms, dataNaixement, salari);
        this.zona = zona;
    }

    public String getZona() { 
    	return zona; 
    }
    
    public void setZona(String zona) { 
    	this.zona = zona; 
    }
    
    public void aplicarComissio() {
        if (getEdat() < 25 && zona.equals("zona 5")) {
            setSalari(getSalari() + 100);
        }
    }

    public String toString() {
        return super.toString() + ", Zona: " + zona;
    }
}