package tasca8_exe1;
import java.util.*;

public class exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escriu una aplicació que declari una matriu de n elements i en demani els n-1 primers. 
		 * A continuació cal demanar un número i una posició i inserir aquest número a la posició indicada. 
		 * Finalment mostrar la matriu resultant amb els números desplaçats per poder inserir els nous.*/

		Scanner in = new Scanner (System.in);
		
		int M1 [] = {1,2,3,4,5,0};
		int M2 [] = new int [6];
		
		System.out.print("Introdueix un numero: ");
		int num = in.nextInt();
		
		System.out.print("Digues quina posicio el vols posar: ");
		int posicio = in.nextInt();
		
		for(int i = 0; i<M1.length; i++) {
			if(i < posicio) {
				M2[i] = M1[i];
			} else if (i == posicio) {
				M2[i] = num;
			} else {
				M2 [i] = M1[i-1];
			}
		}
		
		
		System.out.print("El resultat és: "+ Arrays.toString(M2));
	}
}