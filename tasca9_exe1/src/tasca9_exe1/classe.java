package tasca9_exe1;
import java.util.*;

public class classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Introdueix una lletra: ");
		String lletras1 = in.nextLine().toUpperCase();

		/*String lletras = "ABC";*/
		String frase = "Hola Coca Cola";
		String fraseencripta= "";
		int n;
		int contador = 0;
		
		for (int i = 0; i<frase.length();i++) {
			
			char lletra = frase.charAt(i);
			n = lletras1.charAt(contador) - 'A';
			
			if(++contador == lletras1.length()) {
				contador = 0;
			}
			fraseencripta += (char)(lletra + n);
		}
		System.out.print(fraseencripta);
	
	}
}