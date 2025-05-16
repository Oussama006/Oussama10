package ExamenPracticaSolucio;

import java.util.*;

public class magatzem {

	 private begudes[][] estanteria;
	    private static final int FILES = 5;
	    private static final int COLUMNES = 7;

	    public magatzem() {
	        estanteria = new begudes[FILES][COLUMNES];
	    }

	    public void afegir(begudes beguda) {
	        for (int i = 0; i < FILES; i++) {
	            for (int j = 0; j < COLUMNES; j++) {
	                if (estanteria[i][j] == null) {
	                    estanteria[i][j] = beguda;
	                    System.out.println("Beguda afegida correctament a la posició " + (i + 1) + (char) ('A' + j));
	                    return;
	                }
	            }
	        }
	        System.out.println("No es pot afegir, el magatzem està ple.");
	    }

	    public double calcularPreuTotal() {
	        double total = 0;
	        for (int i = 0; i < FILES; i++) {
	            for (int j = 0; j < COLUMNES; j++) {
	                if (estanteria[i][j] != null) {
	                    if (estanteria[i][j] instanceof refrescos) {
	                        total += ((refrescos) estanteria[i][j]).getPreuFinal();
	                    } else {
	                        total += estanteria[i][j].getPreu();
	                    }
	                }
	            }
	        }
	        return total;
	    }

	    public void mostrarInfo() {
	        int aigues = 0, cocacoles = 0, fantes = 0;

	        for (int i = 0; i < FILES; i++) {
	            for (int j = 0; j < COLUMNES; j++) {
	                if (estanteria[i][j] != null) {
	                    if (estanteria[i][j] instanceof aigua) {
	                        aigues++;
	                    } else if (estanteria[i][j] instanceof refrescos) {
	                        if (estanteria[i][j].getMarca().equalsIgnoreCase("Coca-Cola")) {
	                            cocacoles++;
	                        } else if (estanteria[i][j].getMarca().equalsIgnoreCase("Fanta")) {
	                            fantes++;
	                        }
	                    }
	                }
	            }
	        }

	        System.out.println("Aquest magatzem conté: ");
	        System.out.println("- " + cocacoles + " refrescos de marca Coca-Cola");
	        System.out.println("- " + fantes + " refrescos de marca Fanta");
	        System.out.println("- " + aigues + " aigües");
	    }
	
	
	
}