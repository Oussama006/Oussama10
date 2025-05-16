package metodes;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double d = llegirFinsDouble(in, "Introdueix un número: ");
		System.out.println("El resultat és: " + d);

	}
	public static double llegirFinsDouble(Scanner in, String prompt){
		
		boolean validar = false;
		double num = 0;
		
		while(!validar) {
			System.out.println(prompt);
			if(in.hasNextDouble()) {
				num = in.nextDouble();
				validar = true;
			}else {
				System.out.println("Esta mal.");
				in.next();
			}
		}
		return num;
	}
}