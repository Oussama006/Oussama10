package exercici;

import java.util.Random;

public class exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriu = generarMatriuBinaria(3);
		mostrarMatriu(matriu);
	}
	public static int[][] generarMatriuBinaria(int dimensio){
		Random aleatorio = new Random();
		int [][] matriu = new int [dimensio][dimensio];
		
		for(int i = 0; i<dimensio; i++) {
			for(int j = 1; j<dimensio;j++) {
				matriu [i][j] = aleatorio.nextInt(2);
			}
		}
		return matriu;
	}
	public static void mostrarMatriu(int m[][]) {
		for(int i = 0; i<m.length;i++ ) {
			for(int j= 0; j<m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();

		}
	}
}
