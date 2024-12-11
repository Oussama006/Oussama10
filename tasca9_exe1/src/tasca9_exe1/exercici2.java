package tasca9_exe1;
import java.util.*;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2.- 
		Escriu un programa que demani a l’usuari una lletra i indiqui si és una consonant o una vocal.
		Entra una lletra: b
		b és una consonant
		Entra una lletra: A
		A és una vocal
		Entra una lletra: #
		# no és un caràcter vàlid
		*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix una lletra: ");
		String lletra = in.nextLine().toUpperCase();	
		
		String vocal = "AEIOU";

		char camvio = lletra.charAt(0);
		
		if(vocal.indexOf(camvio) != -1) {
			System.out.print(lletra + " és una vocal. ");
		} else if(Character.isLetter(camvio)) {
			System.out.print(lletra + " és una consonant. ");
		}else {
			System.out.print(lletra+" no és un caràcter vàlid ");

		}

	}
}