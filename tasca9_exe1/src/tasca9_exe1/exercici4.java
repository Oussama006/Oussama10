package tasca9_exe1;
import java.util.*;

public class exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
4.- Escriu un programa que donades dues cadenes retorni una versió de 
la primera cadena on totes les instàncies de la segona (no case sensitive) han estat eliminades.
Introdueix cadena: En quin tinter té tinta Anton
Elimina: in
Resultat: En qu tter té tta Anton*/
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Introduiex una frase: ");
		String frase = in.nextLine();
		
		String [] eliminar = frase.split("in");
		
		for (int i = 0; i<eliminar.length; i++) {
			System.out.print(eliminar[i]);
		}
		
		
		
	}
}