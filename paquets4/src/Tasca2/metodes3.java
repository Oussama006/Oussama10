package Tasca2;

import java.util.*;

public class metodes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		partida();
		
	}
	public static void partida () {
		char[][] taula = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		boolean joc = false;
		int intents = 0;
		
		pintataula(taula);
		
		while(!joc) {
			jugador1(taula);
			pintataula(taula);
			intents++;
			
			if(guanyador(taula)) {
				System.out.print(" El guanyador és el jugador X. ");
				joc = true;
			}else if (intents == 9){
				System.out.print(" EMPAT ");
				joc = true;
			}
			
			if(!joc) {
				System.out.print("Jugador O: ");
				jugador2(taula);
				pintataula(taula);
				intents++;
				
				if(guanyador(taula)) {
					System.out.print(" El guanyador és el jugador 0. ");
					joc = true;
				}
			}
		}
	}
	
	public static void pintataula (char[][] taula) {
				
		for(int i = 0; i < 3; i++) {
			System.out.println(" -------------");
			for(int j = 0; j< 3; j++) {
				System.out.print(" | "+ taula[i][j]);
			}
			System.out.print(" | ");
			System.out.println();
		}
		System.out.println(" -------------");
	}
	
	
	public static void jugador1(char[][] taula) {
		Scanner in = new Scanner(System.in);
				
		char jugador1 = 'X';
		
		boolean moviment = false;
		
		while(!moviment) {
			
			System.out.print("Entra una fila (0, 1, or 2) pel jugador X: ");
			int fila = in.nextInt();
			
			System.out.print("Entra una columna (0, 1, or 2) pel jugador X: ");
			int columna = in.nextInt();
			
			if(fila>=0 && fila<3 && columna >=0 && columna<3) {
				if(taula[fila][columna] == ' ') {
					taula[fila][columna] = jugador1;
					moviment = true;
				}else {
					System.out.println("Error. El lloc ja esta ocupat. ");
				}
			}else {
				System.out.println("Error. Nomes el (0,1,2). ");

			}
		}
			
		}
				
		public static void jugador2(char[][] taula) {
			Scanner in = new Scanner(System.in);
					
			char jugador2 = 'O';
			
			boolean moviment = false;
			
			while(!moviment) {
				
				System.out.print("Entra una fila (0, 1, or 2) pel jugador O: ");
				int fila = in.nextInt();
				
				System.out.print("Entra una columna (0, 1, or 2) pel jugador O: ");
				int columna = in.nextInt();
				
				if(fila>=0 && fila< 3 && columna >=0 && columna < 3) {
					if(taula[fila][columna] == ' ') {
						taula[fila][columna] = jugador2;
						moviment = true;
					}else {
						System.out.println("Error. El lloc ja esta ocupat. ");
					}
				}else {
					System.out.println("Error. Nomes el (0,1,2). ");

				}
				
			}
		
		}
		public static boolean guanyador (char[][] taula) {
			for(int i = 0; i<3; i++) {
				if(taula[i][0] != ' ' && taula[i][0] == taula[i][1] && taula[i][1] == taula[i][2]) {
					return true;
				}
				if(taula[0][i] != ' ' && taula[0][i] == taula[1][i] && taula[1][i] == taula[2][i]) {
					return true;
				}
			}
			if(taula[0][0] != ' ' && taula[0][0] == taula[1][1] && taula[1][1] == taula[2][2]) {
				return true;
			}
			if(taula[0][2] != ' ' && taula[0][2] == taula[1][1] && taula[1][1] == taula[0][2]) {
				return true;
			}
			return false;
		}

}