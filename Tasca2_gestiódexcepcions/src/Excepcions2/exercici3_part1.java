package Excepcions2;

import javax.swing.JOptionPane;

public class exercici3_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			cridaNumero();
			System.out.println("Bieen.");
		} catch (IllegalArgumentException e) {
			System.out.println(" ");
		} catch (OutOfRangeException i) {
			System.out.println("Error. " + i.getMessage());
		}
	}
	
	public static void cridaNumero() throws OutOfRangeException {
		String input = JOptionPane.showInputDialog("Introdueix un numero entre 10 i 50: ");
		
		if(input == null || input.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		int num = Integer.parseInt(input);
		
		if(num < 10 || num > 50) {
			throw new OutOfRangeException ("El numero ha de ser entre 10 i 50.");
		}
	}

}
