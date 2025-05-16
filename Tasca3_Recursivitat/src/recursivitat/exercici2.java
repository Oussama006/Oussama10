package recursivitat;

import java.util.Scanner;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix un numero: ");
		int numero = in.nextInt();
		
		mostrarInvertit(numero);
		
	}
	
	public static void mostrarInvertit(int valor) {

		if(valor < 10) {
			System.out.print(valor);
		}else {
			System.out.print(valor%10);
			mostrarInvertit(valor/10);

		}
	}
}
