package tasca8_exe1;
import java.util.Scanner;

public class exe1 {

	/*Escriu un programa que demani 5 enters , 
	 * els guardi en un array i els mostri en el mateix ordre en que s’han introduït. */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[5];
		
		for (int num=0;num<5;num++){
			System.out.print("Introdueix 5 enters: ");
			numeros[num]= in.nextInt();	
		}

		for (int element : numeros) {
			System.out.println(element+ " ");
		}
	}
}