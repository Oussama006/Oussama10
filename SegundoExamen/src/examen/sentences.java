package examen;

import java.util.*;

public class sentences {

	/***
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***
		 * Introdueix la persona una frase.
		 */
		
		Scanner in = new Scanner (System.in);
	    System.out.println("Introdueix una frase: ");
		String paraula = in.nextLine();
		
	    System.out.println("Número invertido: " + invertirparaula(paraula, paraula.length()-1));

	}
    
    /***
     * Inverteix la paraula
     * @param paraula
     * @param longi
     * @return
     */
    public static String invertirparaula (String paraula, int longi) {
    	
    	if(longi == 0) {
    		return paraula.charAt(longi)+"";
    	}else {
    		return paraula.charAt(longi) + (invertirparaula(paraula,longi-1));
    	}
    	
    	
    }
}
