package Ticket;

import java.util.*;

public class RunCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LlistaDeLaCompra shoop = new LlistaDeLaCompra();
		
		shoop.afegir(new LlistaDeLaCompraItem("Regla", 2, 1.0));
		shoop.afegir(new LlistaDeLaCompraItem("Compas", 4, 0.8));
		shoop.afegir(new LlistaDeLaCompraItem("Calculadora", 1, 0.5));

		System.out.println(shoop);
		
	}
}