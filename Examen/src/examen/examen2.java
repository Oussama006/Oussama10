package examen;
import java.util.*;

public class examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		System.out.print("Introdueix una frase: ");
		String frase = in.nextLine().toUpperCase();
		
		int contador = 0; 
		String frasencripta = "";
		int n;
		String tabla = "ABCDEFGHIJ";
		
		for(int i = 0; i<frase.length();i++) {
			char lletra = frase.charAt(i);
			n = frase.charAt(contador) - 'A'+ 'A';

			if(++contador == frase.length()) {
				contador = 0;
			}
			
			frasencripta = frasencripta + (char)(lletra + n);
			
				System.out.print(n + " ");
		}
		System.out.print(frasencripta.toString());
	}
}




















