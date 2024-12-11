package tasca7_exe1;
import java.util.*;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Repàs de xarxes2: Fes un programa que et demani una adreça IP en format decimal (Ex: 192.164.0.4)  
		 * El programa cal que et retorni si l’adreça és de classe A, B, C, D o E. 
		 * Cal comprovar que la IP té el format correcte (4 números de 0 a 255 separats per punts) 
		 * i anar demanant fins que sigui correcte*/
		Scanner in = new Scanner(System.in);
		System.out.println("Introdueix una adreça IP (Ex: 192): ");
		int num = in.nextInt();
		
		String num1= Integer.toString(num);
		String num2= num1.substring(0,3);
		
		int num3= Integer.parseInt(num2);
		
		
		while (num3<1 || num3>255) {
			System.out.println("Introdueix una adreça IP (Ex: 192): ");
			num3 = in.nextInt();
		
		}
		
		if (num3 > 1 && num3 <= 127) {
			System.out.println("classe A");
		}else if (num3 >= 128 && num3 <= 191) {
			System.out.println("classe B");
		}else if (num3 >= 192 && num3 <= 223) {
			System.out.println("classe C");
		}else if (num3 >= 224 && num3 <= 239) {
			System.out.println("classe D");
		}else if (num3 >= 240 && num3 <= 255) {
			System.out.println("classe E");
		}
	}
}
