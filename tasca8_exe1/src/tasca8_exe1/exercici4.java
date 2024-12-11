package tasca8_exe1;
import java.util.*;

public class exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fes un programa que llegeixi n números enters i els guardi en un vector (matriu d'una dimensió). 
		 * A continuació generi dos vectors amb la mida exacta  per emmagatzemar els elements senars i els parells del vector original. 
		 * (la mida exacta de números parells i senars en cada cas) Finalment mostri els dos vectors generats.*/
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix quants numeros: ");
		int num = in.nextInt();
		
		int numeros[]= new int [num];
		int conparells=0;
		int consenars=0;
		int inparells=0;
		int insenars=0;
		

		for(int i = 0; i<num; i++) {
			System.out.print("Intrdueix un numero: ");
			numeros[i]= in.nextInt();
			if (numeros[i]%2==0) {
				conparells++;
			} else {
				consenars++;
			}
		}
		
		int parells[]= new int [conparells];
		int senars[]= new int [consenars];
		
		for(int numero : numeros) {
			if (numero%2==0) {
				parells[inparells++]=numero;
			} else {
				senars[insenars++]=numero;
			}
		}
		System.out.println("Els numeros parells són: "+Arrays.toString(parells));
		
		System.out.println("Els numeros senars són: "+Arrays.toString(senars));


		
	}
}