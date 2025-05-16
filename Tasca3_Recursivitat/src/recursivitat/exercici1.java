package recursivitat;

public class exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Escriu un mètode recursiu que calculi la sèrie següent:
	Función de m (i) = 1/1 + 1/2+ 1/3 + ... + 1/i
	*/
		
		
	double resultat = m(5);
	System.out.print(resultat);
		
	}
	public static double m(int n) {
		if(n == 1) {
			return 1;
		}
		return m(n-1) + 1.0/n;
	}
}