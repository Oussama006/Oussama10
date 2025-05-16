package examen;

import java.util.*;

public class exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***
		 * 
		 * @author oussama
		 * 
		 * @version 
		 * 
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entra un número per ser invertit: ");
	    int numero = in.nextInt();
	    
	    /***
	     * El que fem és fer que la persona introdui el numero pero tornarli invertit
	     * Si és 254
	     * return 452
	     */
	    int forma = String.valueOf(numero).length()-1;
	    	    
	    System.out.println("El número invertit és: " + invertirn(numero, forma));
	}
	    /***
	     * 
	     * @param num
	     * @param posicio
	     * @return
	     */
	    public static int invertirn (int num, int posicio) {
	    	
	    	if (num <10) {
	    		return num;
	    	}else {
	    		return (num % 10) * (int) Math.pow(10, posicio) + (invertirn(num/10, posicio -1));
	    	}
	    	
	    }	
	
}