package ExamenPractica;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int opcio;

		do {
			
			System.out.println("MENÚ");
			System.out.println("1. Afegir begudes. ");
			System.out.println("2. Calcular preus. ");
			System.out.println("3. Mostrar informació. ");
			System.out.println("0 EXIT ");
			opcio = in.nextInt();

			
			switch (opcio) {
			case 1:
				System.out.println("Ara l'afageix..." );
				break;
			case 2:
				System.out.println("Okey els calculs ara venen.");
				break;
			case 3:
				System.out.println("La informacio és molt llarg.");

				break;
			default:
				System.out.println("ERROR. NOMES UNA D'AQUESTES TRES OPCIONS.");
				break;
			}
		}while(opcio != 0);
		}

	}

