package tasca8b_exe1;
import java.util.*;

public class exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Millora el joc dels vaixells que vas fer en la tasca7: 
		 * Utilitza 5 files i 5 columnes  i amaga 2 vaixells. 
		 * També cal que vagis mostrant les caselles on hi ha aigua després de cada jugada. 
		 * El joc s'acaba quan s'han trobat els 2 vaixells Ex:

    A B C D E
  1 * * * * *
  2 * A * * V
  3 * * * A *
  4 * * A * *
  5 * * * * *
  */
		
		Scanner in = new Scanner (System.in);
		
		int matriu [][] = new int [5][5];
		int contador = 0;
		int trobat = 0;
		
		
		int vaxellf = (int)(Math.random()*matriu.length);
		int vaxellc = (int)(Math.random()*matriu.length);
		int vaxellf1, vaxellc1;
		
		do {
			vaxellf1 = (int)(Math.random()*matriu.length);
			vaxellc1 = (int)(Math.random()*matriu.length);
		}while (vaxellf == vaxellf1 && vaxellc == vaxellc1);
		
		while(trobat <2) {
			System.out.println("  A B C D E");

			for(int i = 0; i<matriu.length;i++) {
				System.out.print((i+1)+ " ");
				for (int j = 0; j<matriu.length; j++) {
					if (matriu[i][j] == 1) {
						System.out.print("A ");
					}else if (matriu[i][j] == 2){
						System.out.print("V ");
					}else {
						System.out.print("* ");
					}		
				}
				System.out.println(" ");
			}
		
		System.out.print("Introdueix una lletra i un numero ex:(A1, B2..) ");
		String letra = in.nextLine().toUpperCase();
		
		
		if(letra.length() != 2 || letra.charAt(0) < 'A' || letra.charAt(0) > 'E' || letra.charAt(1) < '1' || letra.charAt(1) > '5') {
			System.out.print("No valid");
		}	
		
		int columna = letra.charAt(0) - 'A';
		int fila = letra.charAt(1) - '1' ;
		
		contador++;
		
		if ((fila == vaxellf && columna == vaxellc) || (fila == vaxellf1 && columna == vaxellc1)) {
			System.out.println("Has trobar el vaxell. ");
			matriu[fila][columna] = 2;
			trobat++;
		} else {
			matriu[fila][columna] = 1;
		}
		}
		
		System.out.println("  A B C D E");

		for(int i = 0; i<matriu.length;i++) {
			System.out.print((i+1)+ " ");
			for (int j = 0; j<matriu.length; j++) {
				if ((i == vaxellf && j==vaxellc) ||(i == vaxellf1 && j == vaxellc1)) {
					System.out.print("V ");
				}else if (matriu[i][j] == 2){
					System.out.print("A ");
				}else {
					System.out.print("* ");
				}		
			}
			System.out.println(" ");
		}
	}
}