package tasca8b_exe1;
import java.util.*;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
/*Fes un programa que generi una matriu de 10x10 aleatòriament amb enters entre 0 i 9. 
 * A continuació mostri la suma de cada fila i de cada columna com al següent exemple:

  2  3  9  3  1  1  7  0  2  2 | 30
  3  7  4  4  5  3  6  0  1  3 | 36
  4  1  7  5  0  5  4  7  8  0 | 41
  7  2  9  4  4  3  3  9  5  2 | 48
  5  2  0  0  7  1  0  1  2  1 | 19
  6  6  1  9  0  7  7  5  7  7 | 55
  4  8  5  3  5  0  1  6  7  6 | 45
  4  1  1  9  7  8  0  4  3  6 | 43
  2  0  4  2  4  7  6  3  9  6 | 43
  8  3  5  7  9  6  7  7  8  0 | 60
-------------------------------+
 45 33 45 46 42 41 41 42 52 33*/
		


	int [][] matriu = new int [10][10];
	
	int aleatorio = (int) (Math.random()*9);
	
	int suma = 0;
	
	int fila [] = new int [matriu.length];
	int columna [] = new int [matriu.length];

	for(int i =0; i<matriu.length; i++) {
		for(int j = 0; j<matriu.length; j++) {
			
			int randi = (int) (Math.random()*10);
			
			matriu[i][j] = randi;
			
		}
	}
	
	for (int i = 0; i<matriu.length; i++) {
		int fi = 0;
		for(int j=0; j<matriu.length; j++) {
			fi += matriu[i][j];
			fila[j] += matriu [i][j];
			fila[i] = fi;
		System.out.print(matriu[i][j] + "    " );

		}
		
		System.out.print("| "+ fila[i]);
		System.out.println("   ");
		
	}
			
	System.out.println("--------------------------------------------------+");

	for (int i =0; i<matriu.length; i++) {
		int col = 0;
		for(int j =0; j<matriu.length;j++) {
			col += matriu[j][i];
			columna[j] += matriu [i][j];
		}
		columna[i] = col;
		System.out.print(columna[i] + "   ");
	}

	}
}