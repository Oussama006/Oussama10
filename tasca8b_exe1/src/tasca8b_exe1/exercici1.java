package tasca8b_exe1;
import java.util.Scanner;

public class exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		/*
Fes un programa que demani per pantalla la mida n de la matriu i 
generi una matriu de n x n i l’ompli de la següent manera: La posició 
(i, j) de la matriu ha de contenir i+j (la suma dels índex).  Exemple matriu[1][3] = 4 . 
Un cop construïda la matriu cal mostrar-la per pantalla. Si la mida n és 4 hauria de sortir això:

  0  1  2  3 
  1  2  3  4 
  2  3  4  5 
  3  4  5  6  */
		
		System.out.print("Introdueix un numero: ");
		int num = in.nextInt();
		
		int matriu[][]= new int [num][num];
		
		for(int i = 0; i<num; i++){
			for(int j = 0; j<num; j++){
				matriu[i][j] = i+j;

			}
		}
		for(int i = 0; i<matriu.length; i++) {
			for(int j = 0; j<matriu.length; j++) {
				System.out.print(matriu[i][j]+" ");

			}
			System.out.println();
		}

		
	}
}