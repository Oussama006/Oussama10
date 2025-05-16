package TascaTicket;

import java.util.ArrayList;
import java.util.Date;

public class LlistaDeLaCompra {

	private ArrayList<LlistaDeLaCompraItem> llistaCompraItems;
	private Date DataCompra;
	
	public LlistaDeLaCompra() {
		llistaCompraItems = new ArrayList<>();
		DataCompra = new Date();
	}
	
	public void afegir(LlistaDeLaCompraItem item) {
		llistaCompraItems.add(item);
	}
	
	public double getImportTotal() {
		double total = 0;
		for(int i = 0; i<llistaCompraItems.size(); i++) {
			total = total + llistaCompraItems.get(i).getImportTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder ticket = new StringBuilder();
		
		for(int i = 0; i < llistaCompraItems.size(); i++) {
			ticket.append(llistaCompraItems.get(i).toString()).append("\n");
		} 
		
		ticket.append(String.format("---------------------------------\n\t" + "TOTAL	\t" + getImportTotal()+ "€"));
		return ticket.toString();
	}

}
