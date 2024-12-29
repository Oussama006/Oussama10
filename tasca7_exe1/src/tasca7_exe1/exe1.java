package tasca7_exe1;
import java.util.*;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PEDRA-PAPER-TISORA (millorat) Escriu un programa que jugui a pedra-paper-tisora. 
		 * El programa genera un número 0, 1 o 2 representant pedra, paper o tisora. 
		 * El programa demana un número a l’usuari 0, 1 o 2 i mostra un missatge indicant si l’usuari o l’ordinador guanyen, perden o empaten. 
		 * Revisa el programa per permetre a l’usuari jugar contínuament fins que o bé l’ordinador o bé l’usuari guanyi tres partides.

		pedra (0), paper (1), tisores (2): 2
		Ordinador ha tret tisores. Jugador ha tret tisores. És un empat. */

		Scanner in = new Scanner(System.in);
		
		int contador1 = 0;
		int contador2 = 0;
		
		
		//Bucle sobre quien gana, pierde o empate.
		
		while (contador1 < 3 && contador2 < 3) {
			System.out.println("pedra (0), paper (1), tisores (2): ");
			int persona = in.nextInt();
			
			if (persona < 0 && persona > 2) {
				System.out.println("Nomes pots introduir del 0 al 2. ");
			}
			
			int ordinador = (int)(Math.random()*3);
			
			if (persona == ordinador) {
				System.out.println("És un empat.");
			} else if ((persona == 0 && ordinador == 2) || (persona == 1 && ordinador == 0) || (persona == 2 && ordinador == 1)) 
			{ 
				System.out.println("El jugador a guanyat.");
				contador1++;
			} else {
				System.out.println("El ordinador a guanyat.");
				contador2++;
			}
			
			//El jugador gana
			
		System.out.println("El jugador ha guanyat "+ contador1);
		
			//El ordinador gana
		System.out.println("El ordinador ha guanyat  "+ contador2);
		}
		
	}
}


