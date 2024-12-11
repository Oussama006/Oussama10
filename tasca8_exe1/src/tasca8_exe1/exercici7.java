package tasca8_exe1;
import java.util.*;

public class exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriu un programa que donada una matriu 
		 * (d'una dimensió) indiqui si els seus elements estan ordenats de forma estrictament creixent, 
		 * de forma estrictament decreixent, estan desordenats o són tots iguals.*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix quants numeros vols introduir: ");
		int num = in.nextInt();
		
		int matriu[]= new int [num];
		int creixent = 0;
		int decreixent = 0;

	
		for(int i = 0; i<num; i++) {
			System.out.print("Introdueix els numeros: ");
			matriu[i] = in.nextInt();
		}
		
		for (int i = 1; i<num; i++) {
			if(matriu[i]>matriu[i-1]) {
				creixent++;
			} else if(matriu[i]<matriu[i-1]) {
				decreixent++;
			}
		}
		if (creixent == 0 && decreixent == 0) {
			System.out.print("Tots són iguals. ");
		} else if(creixent > 0 && decreixent == 0) {
			System.out.print("Creixent. ");
		} else if(decreixent > 0 && creixent == 0) {
			System.out.print("Decreixent. ");
		} else {
			System.out.print("Desordenats. ");
		}

	}
}