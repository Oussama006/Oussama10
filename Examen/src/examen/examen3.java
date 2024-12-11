package examen;
import java.util.*;

public class examen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);

		System.out.print("Introdueix una frase nomes amb (A, C, G, T): ");
		String lletra = in.nextLine().toUpperCase();
		
		String tipusO = "ACCTGGATCAAA"; 
		String tipusA = "ACCTGGATCAAT";
		String tipusB = "ACCTGGATCATT";
		String tipusAB = "ACCTGGATCACT";
		
		String blaus = "ACTGTGGA";
		String marrons = "ACTGTGGC";
		String verds = "ACTGTGGT";
		
		String ròs = "TGGCACCT";
		String castany = "TGGCACCG";
		String negre = "TGGCACAA";
		
		int n;
		char letra = lletra.charAt(0);
		
		while(letra != 'A' || letra != 'C' || letra != 'G' || letra != 'T') {
			if(lletra == tipusO) {
				System.out.print("Sang tipus O");
			} if (lletra == tipusA) {
				System.out.print("Sang tipus A");

			}if (lletra == tipusB) {
				System.out.print("Sang tipus B");

			}if (lletra == tipusAB) {
				System.out.print("Sang tipus AB");

			}else {
				System.out.print("No correspon.");
			}
			
			if(lletra == blaus) {
				System.out.print("Els ulls són blaus");
			} if (lletra == marrons) {
				System.out.print("Els ulls són marrons");

			}if (lletra == verds) {
				System.out.print("Els ulls són verds");

			}else {
				System.out.print("No correspon.");
			}
			
			if(lletra == ròs) {
				System.out.print("El cabell és ròs");
			} if (lletra == castany) {
				System.out.print("El cabell és castany");

			}if (lletra == negre) {
				System.out.print("El cabell és negre");

			}else {
				System.out.print("No correspon.");
			}
		}
		

		
		
	
	
		
		
		
		
		//System.out.print("Segons aquesta seqüencia d'ADN la persona té: sang tipus " + sang);
		
		
		
	}
}


























