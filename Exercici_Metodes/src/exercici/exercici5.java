package exercici;

public class exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCentral();
	}
	public static String caractersCentrals(String str) {
		int longitud = str.length();
		int posicio = longitud/2;
		
		if(longitud % 2 == 0) {
			return str.substring(posicio - 1, posicio + 1);
		}else {
			return str.substring(posicio, posicio + 1);
		}
	}
	public static void testCentral() {
		System.out.println("Paraula: ");

		
		comprovar("oussama", "sa");
		comprovar("abcde", "c");
		comprovar("abcde", "cd");
	}
	public static void comprovar(String str, String resultat) {
		System.out.printf("(%s): %s -> ", str, resultat);
		
		if(resultat.equals(caractersCentrals(str))) {
			System.out.println("Correcte.");
		}else {
			System.out.println("No correcte.");

		}
	}
}
