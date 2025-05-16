package Excepcions2;

import java.util.*;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("Introdueix un núm: ");
			String imput = in.nextLine();
			
			int num = Integer.parseInt(imput);
			int result = 3 / num;
			
			System.out.println("El resultat és: " + result);
		} catch (NumberFormatException e) {
			System.out.println("ERROR. El num no es valid.");
			
		} catch (ArithmeticException e) {
			System.out.println("ERROR. No es pot.");
		} finally {
			System.out.println("S'ha ha acabat.");
		}
		
	}
}