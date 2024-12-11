package tasca8_exe1;
import java.util.*;
public class exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriu un programa que llegeixi de teclat una matriu de n enters. 
		 * A continuació ha de demanar quantes posicions es vol desplaçar la matriu cap a la dreta. 
		 * (Una posició significarà que la última posició passa a ser la primera, 
		 * dues posicions indica que el penúltim número serà el primer i l'últim el segon). 
		 * Modificarà els elements de la matriu i mostrarà la matriu resultant.*/
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digues quants vols introduir: ");
		int num = in.nextInt();
		
		int matriu[]= new int [num];
		int resultat[] = new int [num];

		for(int i=0; i<num; i++) {
			System.out.print("Introdueix un numero: ");
			matriu[i] = in.nextInt();
		}

		System.out.print("Indica el numero per desplaçar: ");
		int num1 = in.nextInt();
			
		num1 = num1 % num;
		
		for (int i= 0; i < num ; i++) {
			int posicio = (i+num1) % num;
			resultat[posicio] = matriu[i];
		}
		
		System.out.print("El resultat és: ");
		System.out.print(Arrays.toString(resultat));

	}
}
