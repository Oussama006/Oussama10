package metodes;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix un numero: ");
		int num = in.nextInt();
		
		System.out.println("Totes les taules que vols:  ");
		
		tabla(num);
		System.out.println();
		
	}
	public static void tabla(int maxim) {
		for(int i = 1; i<=maxim; i++) {
			multiplicacio(i);
		}
		System.out.println(" ");

	}
	
	public static int multiplicacio(int n) {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n*(i));
		}
		System.out.println();

		return n;
	}
}