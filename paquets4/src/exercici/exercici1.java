package exercici;

public class exercici1 {

	public static void main (String [] args) {
		// TODO Auto-generated method stub
		testsumaRang();
	}
	public static int sumaRang (int limit1, int limit2) {
		int suma = 0;
		if(limit1 > limit2) {
			int cambio = limit1;
			limit1 = limit2;
			limit2 = cambio;	
		}
		for(int i = limit1; i <= limit2; i++) {
			suma = suma+i;
		}
		return suma;
	}
	public static void testsumaRang() {
		comprovar(4,7,22);
        comprovar(-2, 5, 12);
        comprovar(-2, -5, -14);
        comprovar(-5, -2, -14);
        comprovar(7, 7, 14);
        comprovar(5, 2, 14);
	}
	private static void comprovar(int limit1, int limit2, int resultat) {
		System.out.printf("SumaRang(%d, %d) = %d " ,limit1, limit2, resultat);
		if(resultat != sumaRang(limit1,limit2)) {
			System.out.println("No correcto.");
		}else {
			System.out.println("Correcto.");
		}
	}
}
