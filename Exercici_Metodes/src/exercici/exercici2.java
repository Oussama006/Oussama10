package exercici;

public class exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testmin();
		System.out.println();
		testmitjana();
	}
	public static double min (double x, double y, double z) {
		if(x<y && x<z) {
			return x;
		}else if (y<x && y<z) {
			return y;
		}else {
			return z;
		}
	}
	public static double mitjana (double x, double y, double z) {
		double operacion = 0;
		return operacion = (x+y+z)/3;
	}
	public static void testmin() {
		System.out.println("Test del minim: ");
	
		comprovarMin(4 ,7 ,22 ,4);
		comprovarMin(-2 , 5 ,12 ,-2);
		comprovarMin(-2 ,-5 ,-14, -5);
		comprovarMin(-5, -2, -14, -5);
		comprovarMin(7, 10, 14, 10);
		comprovarMin(5, 2, 14, 2);
	}
	public static void testmitjana() {
		System.out.println("Test de la mitjana: ");
		comprovarMitjana(4 ,7 ,22 ,11);
		comprovarMitjana(-2, 5, 12, 5);
		comprovarMitjana(-2, -5, -14, -6);
		comprovarMitjana(-5, -2, -14, -7);
		comprovarMitjana(7, 7, 10, 9);
		comprovarMitjana(5, 2, 14, 7);
	}

	private static void comprovarMin(int y, int x, int z, int resultat) {
		System.out.printf(" (%d, %d, %d) = %d " ,y, x, z,resultat);
		if(resultat != min(y,x,z)) {
			System.out.println("No correcto.");
		}else {
			System.out.println("Correcto.");
		}
	}
	private static void comprovarMitjana(int y, int x, int z, int resultat) {
		System.out.printf(" (%d, %d, %d) = %d " ,y, x, z,resultat);
		if(resultat != mitjana(y,x,z)) {
			System.out.println("No correcto.");
		}else {
			System.out.println("Correcto.");
		}
	}
}

	