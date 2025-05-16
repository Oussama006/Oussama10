package Tasca2;

import java.util.Scanner;

public class metodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int introducion = entre(in);
		
		System.out.print("Introdueix un caracter: ");
		char letra = in.next().charAt(0);
			
		
		taula(introducion,letra);
		tronc(introducion);
	}
	public static int entre (Scanner in) {
		int numero;
		
		do {
			System.out.print("Introdueix un numero entre 5 i 29: ");
			numero = in.nextInt();
			
			if(numero < 5 || numero > 29 || numero % 2 == 0) {
				System.out.print("ERROR.");
			}
			
		}while(numero < 5 || numero > 29 || numero % 2 == 0);
		
		return numero;
		
	}
	public static void taula(int num, char letra) {
		
		int numero = (num/2)+1;
		int menos = numero;
		int mas = numero;
		
		for(int i = 1; i<= numero; i ++) {
			for(int j = 1; j <= num; j++) {
				if(j>= menos && mas >= j) {
					System.out.print(letra);

				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			mas++;
			menos--;
		}

	}
	public static void tronc (int numero) {
		
		int medio = (numero/2) +1;
		int tronco = numero / 5;
		
		for(int i = 1; i <= tronco; i++) {
			for(int j = 1; j <= numero; j++) {
				if(j==medio) {
					System.out.print("l");
				}else {
					System.out.print(" ");
				}
			}
		System.out.println();

		}
	}
}