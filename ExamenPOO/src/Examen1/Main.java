package Examen1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		CarShowCase cars = new CarShowCase(null);
		
		
		/**
		 * estic validan l'entrada.
		 */
		
		while (!in.hasNextInt()) {
			System.out.println("Error. Introdueix un numero valid");
			in.next();
		}
		
		
	}
}