package ExamenPracticaSolucio;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		magatzem wish = new magatzem();
				
		
		int opcio;
		do {

			Menu();
			
			while(!in.hasNextInt()) {
				System.out.println("Error. Introdueix un numero valid");
				in.next();
			}
			opcio = in.nextInt();
				
			switch (opcio) {
			case 1:

				System.out.println("Afegint una nova beguda...");
				wish.afegir(new aigua(2, 2.5, 5.0, "Agua","España"));
				wish.afegir(new refrescos(1,0.33,1.5,"Coca-cola"));
				wish.afegir(new refrescos(2, 0.5, 2.0, "Fanta"));

				break;
			case 2: 
				System.out.println("El preu total és " + wish.calcularPreuTotal()+"€");
				break;
			case 3:
				wish.mostrarInfo();
				break;
			case 0: 
				System.out.println("Sortint del programa...");
				break;
			default:
				System.out.println("Opcio no valida. ");
			}
		}while(opcio != 0);
		
	}
	
	public static void Menu() {
		System.out.println("MENÚ");
		System.out.println("1. Afegir begudes.");
		System.out.println("2. Preu total.");
		System.out.println("3. Mostrar Informació.");
		System.out.println("0. Sortida");
		System.out.println("Introdueix una opcio: ");
	}
}