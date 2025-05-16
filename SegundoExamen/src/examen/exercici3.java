package examen;

import java.util.*;

public class exercici3 {
	
	/***
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> llista = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		boolean fora = false;

		/***
		 * bucle del menu
		 */
		
		while (!fora) {

			menu();

			System.out.print("Introdueix una d'aquestes opcions: ");
			int opcio = in.nextInt();

			switch (opcio) {
			case 1:

				llistat(llista);
	
			case 2:

				ultim(llista);

			case 3:

				recompteAlumne(llista);
		
			case 4:

				recompte(llista);
	
			case 5:

				solicitar(llista);

			case 6:
				System.out.println("Sortint...");
				exit(fora=true);
				break;
			default:
				System.out.println("Error");

			}
		}

	}

	/***
	 * menu
	 */
	public static void menu() {

		System.out.println("Menú");
		System.out.println("1. Consulta llista");
		System.out.println("2. Consultar últim alumne");
		System.out.println("3. Recompte ús del lavabo per alumne");
		System.out.println("4. Recompte ús del lavabo");
		System.out.println("5. Solicitar anar al lavabo.");
		System.out.println("6. Exit.");

	}
	
	/***
	 * 
	 * @param llista
	 */
	public static void llistat (ArrayList<String> llista) {
		System.out.print(llista);

	}
	
	/***
	 * 
	 * @param llista
	 */
	
	public static void ultim(ArrayList<String> llista) {

		String paraula = llista.getLast();
		
		System.out.println(paraula);

	}
	/***
	 * 
	 * @param llista
	 */
	public static void recompteAlumne (ArrayList<String> llista) {
		Scanner in = new Scanner (System.in);
		
		int contador = 0;
		
		System.out.print("Diguem el teu nom: ");
		String nom = in.nextLine();
		
		for(int i = 0; i<llista.size();i++) {
			if(llista.get(i).contains(llista.get(i))) {
				contador++;
			}
		}
		System.out.println("L'alumne ha anat: " + contador);
		
	}

	/***
	 * 
	 * @param llista
	 */
	public static void recompte (ArrayList<String> llista) {
		int contador = 0;
		
		for(int i = 0; i<llista.size();i++) {
			if(llista.get(i).contains(llista.get(i))) {
				contador++;
			}
		}
	}
/***
 * 
 * @param llista
 */
	public static void solicitar(ArrayList<String> llista) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digem el teu nom: ");
		String nom = in.nextLine();

		llista.add(nom);

	}

	/***
	 * 
	 * @param salida
	 * @return
	 */
	public static boolean exit (boolean salida) {
		return salida = true;
	}
}