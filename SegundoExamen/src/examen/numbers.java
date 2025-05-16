package examen;

import java.util.*;

public class numbers {

	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***
		 * La persona ha de ingrsar dos numeros i despres se li suma.
		 */

		Scanner in = new Scanner(System.in);

		System.out.println("Introdueix un numero: ");
		int numero = in.nextInt();

		System.out.println("Introdueix un altre numero: ");
		int numero2 = in.nextInt();

		System.out.println("El resultat és: " + numero + " + " + numero2 + " = " + suma(numero, numero2));

		
		
	}
/***
 * 
 * @param opcio1
 * @param opcio2
 * @return
 */
	public static int suma(int opcio1, int opcio2) {

		int total = opcio1 + opcio2;
		return total;

	}


}
