package examen;

import java.util.*;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		boolean fora = false;
/***
 * bucle sobre el menu
 */
		while(!fora) {
		
		menu();

		System.out.print("Introdueix una d'aquestes opcions: ");
		int opcio = in.nextInt();
		
		switch (opcio) {
		case 1: 		
			salutation();
			break;
		case 2:
			System.out.println("Introdueix un numero: ");
			int numero = in.nextInt();

			System.out.println("Introdueix un altre numero: ");
			int numero2 = in.nextInt();

			System.out.println(numero + " + " + numero2 + " = " + ejercicio2(numero, numero2));
			break;

		case 3:
			
		case 4:
			
		case 5:
		    System.out.println("Introdueix una frase: ");
			String paraula = in.nextLine();
			
		    System.out.println(ejercicio5(paraula,paraula.length()-1));
			break;

			
		case 6:
			System.out.println("Sortint...");
			exit(fora=true);			
			break;
		default:
			System.out.println("Error");
			
		}
	}
		
	}

	public static void menu() {
		
		/***
		 * menu de tota la informacio
		 */

		System.out.println("Menú");
		System.out.println("1. Print 'Hello World'");
		System.out.println("2. Sum two numbers.");
		System.out.println("3. Sum numbers until n.");
		System.out.println("4. Count words.");
		System.out.println("5. Reverse sentence.");
		System.out.println("6. Exit.");

	}	
	
	/***
	 * 
	 * @param hi
	 * @return
	 */
	public static void salutation() {
		System.out.println("Hello World");

	}
	
	/***
	 * 
	 * @param opcio
	 * @param opcio2
	 * @return
	 */
	public static int ejercicio2 (int opcio, int opcio2) {
				
		int numero = numbers.suma(opcio, opcio2);
		return numero;
		
	}
	/***
	 * 
	 * @param paraula
	 * @param forma
	 * @return
	 */
	public static String ejercicio5 (String paraula,int forma) {
		forma = paraula.length()-1;
		return paraula = sentences.invertirparaula(paraula,paraula.length()-1);		
	}
	
	/***
	 * 
	 * @param salida
	 * @return
	 */
	public static boolean exit (boolean salida) {
		return salida = true;
	}

}