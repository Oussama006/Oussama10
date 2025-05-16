package Introducció_gestió_excepcions;

import java.util.*;

public class entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);	
				
		try {
			System.out.println("Ronaldo is the best (YES OR NO)");
			String yesno = in.nextLine().toUpperCase();
			
			boolean resultat;
			
			if (yesno.equalsIgnoreCase("YES")) {
				resultat = true;
			} else if(yesno.equalsIgnoreCase("NO")) {
				resultat = false;
			}else {
				throw new Exception("Ha de ser YES or NO");
			}
			
			System.out.println("El resultado és: "+ resultat);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}