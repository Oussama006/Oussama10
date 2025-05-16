package navegadorweb;

import java.util.Scanner;
import java.util.IllegalFormatException;
import java.util.MissingFormatArgumentException;


public class Menu {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavBar navegador = new NavBar();
		Scanner in = new Scanner (System.in);
		
		int option = -1;
		while (option != 0) {
			menu();
			option = in.nextInt();
			in.nextLine();
			switch (option) {
			case 1:
				try {
					navegador.navegara();
					System.out.println("Navegant...");
				} catch (MissingFormatArgumentException e/*exceptionNavBar e*/) {
					System.out.println("No és pot. Ha de començar per (https:// o htp://)");
					System.out.println(e.getMessage());
					
				}

				break;
			case 2:
				try {
					navegador.tiraEnrere();
					System.out.println("Enrere...");
				} catch (IllegalFormatException e) {
					System.out.println("No es pot tirar enrer.");
					System.out.println(e.getMessage());
					
				}
				break;
			case 3:
				try {
					navegador.tiraEndavant();
					System.out.println("En davant...");
				} catch (IllegalFormatException e) {
					System.out.println("No es pot tirar en davant.");
					System.out.println(e.getMessage());
					
				}
				break;
			case 4:
				navegador.mostrarNombVisit();
				
				break;
			case 5:
				navegador.mostrarHistorial();
				break;
			}
		}

	}
	
	

	public static void menu() {
		System.out.println("-------OPCIO----------\n"+ "1.Navegar a \n2.Tornar enrere \n3.Tornar endavant \n4.Mostrar nombre de visites de cada URL \n5.Mostrar historial de navegació \n0.Sortir. \n" + "---------------------------------------\n");
	}

	
		
}
