package tasca8_exe1;
import java.util.Scanner;

public class exercici1 {

	/*Escriu un programa que llegeixi 5 enters i els mostri en l’ordre invers al que s’han introduït.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		
		int[] numeros = new int[5];

		for (int num=0;num<5;num++){
			System.out.print("Introdueix "+ (num+1) + " enters: ");	
			numeros[num]=in.nextInt();
		}

		for (int num1=4; num1>=0;num1--) {
			System.out.println(numeros[num1]);
		}
	}
}