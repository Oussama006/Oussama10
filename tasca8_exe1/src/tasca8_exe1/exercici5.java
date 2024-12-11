package tasca8_exe1;
import java.util.*;

public class exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Especifica la longitud de la matriu [2 - 100]: 2
		   Matriu generada: [71, 7]
		   Contingut dels índexs senars: [7]
		   Elements senars: [71, 7]
		   Elements parells: []
		   Matriu en ordre invers: [7, 71]
		   Primer i últim element: [71, 7] */

		Scanner in = new Scanner(System.in);
		
		System.out.print("Especifica la longitud de la matriu [2 - 100] ");
		int longitud = in.nextInt();
		
		while(longitud<2 || longitud>100) {
			System.out.print("Especifica la longitud de la matriu [2 - 100] ");
			longitud = in.nextInt();
		}
		
		int aleatorio[] = new int [longitud];
		
		System.out.print("Matriu generada: ");
		for(int num1 = 0; num1<longitud; num1++) {
			aleatorio[num1] = (int)(Math.random()*100);
		}
		
		System.out.println(Arrays.toString(aleatorio));
		
		System.out.print("Contingut dels índexs senars: [");
		for(int num1 = 1; num1<aleatorio.length;num1++) {
			System.out.print(aleatorio[num1]+ "," );
			num1++;
		}
		System.out.println("]");
		
		System.out.print("Elements senars: [");
		for(int num1 = 0; num1<aleatorio.length; num1++) {
			if(aleatorio[num1]%2!=0) {
				System.out.print(aleatorio[num1]+",");
			} 
		}
		System.out.println("]");
		
		System.out.print("Elements parells: [");
		for(int num1 = 0; num1<aleatorio.length; num1++) {
			if(aleatorio[num1]%2==0) {
				System.out.print(aleatorio[num1]+",");
			} 
		}
		System.out.println("]");

		
		System.out.print("Matriu en ordre invers: [");
		for(int num1 = aleatorio.length-1; num1>=0; num1--) {
			System.out.print(aleatorio[num1]+", ");
		}
		System.out.println("]");
		
		
		System.out.print("Primer i últim element: ["+ aleatorio[0]+","+ aleatorio[aleatorio.length-1]+"]");

	}
}