package metodes;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Introdueix una frase: ");
		String frase = in.nextLine();
		
		String frasebarregat = barrejarFrase(frase);
		
		System.out.println("La frase es aquesta: ");
		System.out.println(frasebarregat);
	}
	public static String barrejarParaula(String paraula) {
	
		if(paraula.length()<=3) {
			return paraula;
		}
		
		char [] lletres = paraula.toCharArray();
		int primer, segon;
		
		do {
			primer = (int) (Math.random()* (paraula.length()-2)+1);
			segon = (int) (Math.random()* (paraula.length()-2)+1);
		}while(primer == segon);
		
		char canvi = lletres[primer];
		lletres[primer] = lletres[segon];
		lletres[segon] = canvi;
		
		return String.valueOf(lletres);
	}
	public static String barrejarFrase(String frase) {
		
		String [] paraula = frase.split(" ");
				
		for(int i = 0; i<paraula.length;i++) {
		
			int aleatori = (int)(Math.random()* (paraula.length));

			String posicio = paraula[i];
			paraula[i] = paraula[aleatori];
			paraula[aleatori] = posicio;
		}
		for(int i = 0; i<paraula.length;i++) {
			paraula[i] = barrejarParaula(paraula[i]);
		}
		
		String frasetotal = "";
		
		for(int i = 0; i<paraula.length; i++) {
			frasetotal = frasetotal + paraula[i];
			if(i < paraula.length-1) {
				frasetotal += " ";
			}
		}
		return frasetotal;
	}
}