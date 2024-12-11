package tasca9_exe1;
import java.util.*;

public class exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		/*
8.-Escriu un programa que converteixi un número binari a decimal. 
No pots utilitzar el mètode Integer.parseInt(num-binari, 2).
*/
		System.out.print("Introdueix un numero: ");
		String binari = in.nextLine();
		
		int decimal = 0;
		int potencia = 1;
		
		for(int i = binari.length()-1; i>=0; i--) {
			char bit = binari.charAt(i);
			
			if(bit != '0' && bit != '1') {
				System.out.print("No valid. ");
			}
			decimal = decimal + (bit - '0') * potencia;
			potencia = potencia * 2;
			
		}
		
		System.out.print(decimal);

	}
}