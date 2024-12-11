package tasca9_exe1;
import java.util.*;

public class exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
6.-Escriu un programa que demani a l’usuari dues cadenes i busqui si la segona apareix dins de la primera. 
No pots utilitzar el mètode indexOf en aquest exercici.
*/
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Introdueix la primera cadena: ");
		String cadena = in.nextLine();		
		
		System.out.print("Introdueix la segona cadena: ");
		String cadena2 = in.nextLine();		
		
		for(int i = 0; i<=cadena.length() - cadena2.length(); i++) {
			if(cadena.substring(i,i + cadena2.length()).equals(cadena2)) {
				System.out.print("La segona cadena es troba en la primera. ");				
			}
		}
		System.out.println("La segona cadena no es troba en la primera. ");

	}
}