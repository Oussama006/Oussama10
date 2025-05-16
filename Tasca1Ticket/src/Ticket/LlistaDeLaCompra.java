package Ticket;

import java.util.*;

class LlistaDeLaCompra {

	private ArrayList<LlistaDeLaCompraItem> llistaCompres;
	
	public LlistaDeLaCompra() {
		llistaCompres = new ArrayList<>();
	}
	
	public void afegir(LlistaDeLaCompraItem item) {
		llistaCompres.add(item);
	}
	
	public double getImportTotal() {
		double total = 0;
		for(LlistaDeLaCompraItem item : llistaCompres) {
			total = total + item.getImportTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder ticket = new StringBuilder();
		for(LlistaDeLaCompraItem item : llistaCompres) {
			ticket.append(item.toString()).append("\n");
		}
		ticket.append("---------------------------------\n");
		ticket.append("TOTAL\t\t").append(getImportTotal()).append(" €");
		return ticket.toString();
	}
}