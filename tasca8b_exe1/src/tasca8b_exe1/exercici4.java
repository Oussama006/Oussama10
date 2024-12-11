package tasca8b_exe1;
import java.util.*;

public class exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/*Escriu un programa que demani quants números volem entrar (n). 
		 * A continuació llegeixi n números enters entre 0 i 100 i 
		 * conti les vegades que apareix cada número.

Digues quants números vols entre 0 i 100: 8
Entra el 1r número:2
Entra el 2n número:5
Entra el 3r número:6
Entra el 4t número:5
Entra el 5è número:4
Entra el 6è número:3
Entra el 7è numero:43
Entra el 8è número:2 

---- RESULTAT ----
2 apareix 2 vegades
5 apareix 2 vegada
6 apareix 1 vegada
4 apareix 1 vegada
3 apareix 1 vegada
43 apareix 1 vegada*/
		
		int num;

		do {
			System.out.print("Digues quants números vols entre 0 i 100: ");
			num = in.nextInt();
	
			if (num<0 || num>100) {
				System.out.println("ERROR. ");
				
			} 
		} while(num<0 || num>100);
		
					
		int matriu [][] = new int [101][2];
		int numero = 0;
		for (int i = 1; i<=num;i++) {
			System.out.print("Entra el ");
			switch(i) {
			case 1: 
				System.out.print("1r números:");
				break;
			case 2:
				System.out.print("2n números:");
				break;
			case 3:
				System.out.print("3r números:");
				break;
			case 4: 
				System.out.print("4t números:");
				break;
			default: 
				System.out.print(i+"è números:");
				break;
				
			}
			numero = in.nextInt();
			if(num>=0 && num<=100) {
				matriu[numero][1]++;
			}else {
				i--;
			}
		}
		
		System.out.println(" ");
		System.out.println("---- RESULTAT ----");
		
		for (int i= 0; i<num; i++) {
		if(matriu[i][1]>0) {
			System.out.println(i+ " apareix "+ matriu[i][1]+" vegades");

		}
		}
	
	}
}