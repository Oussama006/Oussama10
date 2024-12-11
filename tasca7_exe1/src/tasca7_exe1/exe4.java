package tasca7_exe1;
import java.util.*;

public class exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Joc d'enfonsar vaixells. Pinta un taulell de 4 x 4. 
		 * Genera aleatòriament un vaixell en una de les caselles, però no l'ensenyis,
		 *  i a continuació demana a l'usuari que entri una coordenada en el format B1, A4 ... 
		 *  Si encerta la casella on està el vaixell GUANYA: TOCAT i ENFONSAT i acaba el joc i mostra la posició del vaixell. 
		 *  sinó diu B1 = AIGUA i segueix jugant.

  A B C D
1 * * * *
2 * * * *
3 * * * *
4 * * * *


B1 = AIGUA 

D3 = AIGUA 

C2 = TOCAT I ENFONSAT. ENHORABONA HAS TROBAT EL VAIXELL EN 3 jugades 

  A B C D
1 * * * *
2 * * V *
3 * * * *
4 * * * * */
		Scanner in = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int mida = 4;
		int contador = 0;
		
		int vaxellfil = aleatorio.nextInt(mida)+1;
		int vaxellcol = aleatorio.nextInt(mida)+1;
		
		System.out.println("  A B C D ");
		for (int num=1; num <= mida; num++) {
			System.out.print(num +" * * * * \n");
		}
		
		while (true) {
			System.out.println(" ");
			String letra = in.nextLine().toUpperCase();
		}
		
		/*
		while (true) {
			System.out.println("");
			String letra = in.nextLine().toUpperCase();
			
			int usuarif = letra.charAt(1) - '1' +1;
			int usuaric = letra.charAt(1) - '1' +1;
			
			contador++;
			
			if (vaxellf == usuarif && vaxellc == usuaric) {
				System.out.println("TOCAT I ENFONSAT. ENHORABONA HAS TROBAT EL VAIXELL EN "+ contador + " jugades.");
				System.out.println("  A B C D ");
				
				/*for (int num=1; num <= mida; num++);
				System.out.print(num + " ");
					for(int num1=1; num1 <= mida; num1++){
						if (num == vaxellf && num1 == vaxellc)
						System.out.println("V");
						} else{
							System.out.println("* ");
				}
			}
		}*/
	}
}