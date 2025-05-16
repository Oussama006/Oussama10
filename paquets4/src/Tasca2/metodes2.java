package Tasca2;

import java.util.*;

/**
 *
 * @author Oussama
 * @version 1.0
 */


public class metodes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> total = new ArrayList<>();
		ArrayList<Integer> positiu = new ArrayList<>();
		ArrayList<Integer> negatiu = new ArrayList<>();

		numeros(total,positiu,negatiu);
		
		ArrayList<Integer> orden = ordenar(negatiu,positiu);
		
		resultat(total,positiu,negatiu,orden);
		
	}
	
    /**
     * Llegeix números enters entre -10 i 10 de l'usuari i els separa
     * en llistes de números positius i negatius.
     *
     * @param total Llista on s'emmagatzemen tots els números introduïts.
     * @param positiu Llista de números positius introduïts.
     * @param negatiu Llista de números negatius introduïts.
     */
	
	public static void numeros (ArrayList<Integer> total,ArrayList<Integer> positiu,ArrayList<Integer> negatiu ) {
		
		int num;
		
		Scanner in = new Scanner (System.in);
		
		do {
			System.out.print("Introdueix un numero de -10 fins 10.");
			num = in.nextInt();
			
			if(num < -10 || num > 10) {
				System.out.println("ERROR");
			}else if(num != 0) {
				total.add(num);
			}
			
			if(num < 0) {
				negatiu.add(num);
			}else if(num > 0){
				positiu.add(num);
			}
			
		}while(num != 0);	}

    /**
     * Ordena els números negatius de gran a petit.
     *
     * @param negatiu Llista de números negatius a ordenar.
     */
	
	public static void ordenN (ArrayList<Integer>negatiu) {
		Collections.sort(negatiu);
		Collections.reverse(negatiu);
	}
	
    /**
     * Ordena els números positius de petit a gran.
     *
     * @param positiu Llista de números positius a ordenar.
     */
	
	public static void ordenP (ArrayList<Integer>positiu) {
		Collections.sort(positiu);
	}
	

    /**
     * Ordena totes dues llistes, positius i negatius, i les combina
     * en una única llista amb negatius primer i positius després.
     *
     * @param positiu Llista de números positius.
     * @param negatiu Llista de números negatius.
     * @return Una nova llista ordenada amb negatius (de gran a petit)
     *         i positius (de petit a gran).
     */
		
	public static ArrayList<Integer> ordenar (ArrayList<Integer> positiu,ArrayList<Integer> negatiu){
		ArrayList<Integer> enorden = new ArrayList<>();
		
		ordenN(negatiu);
		ordenP(positiu);
		
		enorden.addAll(negatiu);
		enorden.addAll(positiu);
		
		return enorden;
	}
	
	 /**
     * Mostra un histograma amb el nombre d'asteriscs que correspon
     * al valor absolut de cada número de la llista.
     *
     * @param numeros Llista de números a representar com a histograma.
     */
	
	public static void esquema (ArrayList<Integer>numeros) {
		for(int numero : numeros) {
			System.out.print(numero + ": ");
			asteriscs(numero);
			System.out.println();

		}
	}
	
    /**
     * Mostra tants asteriscs com el valor absolut del número passat com a paràmetre.
     *
     * @param num Número a representar amb asteriscs.
     */
	
	public static void asteriscs (int num) {
		for(int i = 0; i < Math.abs(num); i++) {
			System.out.print("*");
		}
	}
	
    /**
     * Mostra els resultats: els números introduïts, els números ordenats,
     * els positius i els negatius, i els histogrames corresponents.
     *
     * @param total Llista de tots els números introduïts.
     * @param positiu Llista de números positius.
     * @param negatiu Llista de números negatius.
     * @param enorden Llista de números ordenats.
     */
	
	public static void resultat (ArrayList<Integer> total,ArrayList<Integer> positiu,ArrayList<Integer> negatiu,ArrayList<Integer> enorden) {
		System.out.println("Has entrat els següents números: " + total);
		System.out.println("Si els ordenem quedaran així: " + enorden);
		System.out.println("Els números positius són " + positiu);
		System.out.println("Els números negatius són " + negatiu);

	}
}
