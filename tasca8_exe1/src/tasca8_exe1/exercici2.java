package tasca8_exe1;
import java.util.*;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriu un programa que agafi les dades de dues matrius unidimensionals de 
		 * n*3 elements i els copii a una tercera matriu de la següent manera, 
		 * 3 elements de la primera matriu, 
		 * 3 elements de la segona, 
		 * 3 elements de la primera, etc…​*/
		Scanner in = new Scanner(System.in);
		
		
		int M1 [] = {1,2,3,4,5,6};
		int M2 [] = {7,8,9,0,1,2};
		int M3 [] = new int[12];
		int contadorM3 = 0;
		
		for(int num = 0; num<M1.length-1; num+=3 ){
			for (int num1 = 0; num1<3; num1++) {
				M3[contadorM3++] = M1 [num+num1];
			}
			for(int num1 = 0; num1<3; num1++) {
				M3[contadorM3++] = M2 [num+num1];
		}

		}
		System.out.println("El resultat és: "+Arrays.toString(M3));
		
	}
}