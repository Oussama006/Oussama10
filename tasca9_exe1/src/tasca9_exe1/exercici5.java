package tasca9_exe1;
import java.util.*;

public class exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
5.- Escriu un programa que donada una cadena retorni la suma de tots els dígits 0-9 que hi apareguin.
Introdueix cadena: edf7ert6ergt9m2kso
La suma dels números apareguts és: 24*/
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Introdueix cadena: ");
		String cadena = in.nextLine();
		
		int suma = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			char numero = cadena.charAt(i);
			if(Character.isDigit(numero)) {
				suma = suma+numero - '0';
			}
		}
		
		System.out.print(suma);

	}
}