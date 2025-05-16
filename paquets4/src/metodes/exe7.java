package metodes;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix un numero: ");
		int num = in.nextInt();
		
		System.out.println("Totes les taules que vols:  ");
		
		tabla(num);
		
	}
	public static void tabla(int maxim) {
		for(int i = 1; i<=10; i++) {	
			for(int j = 1; j<=maxim; j++) {
				System.out.printf("%d x %d = %2d \t",j,i,j*i);	
				
				if(j % 4 == 0) {
					System.out.println();
				}

			}
			System.out.println();
		}
	}
	
	/*public static int multiplicacio(int n) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
		System.out.println();

		return n;
	}*/
}