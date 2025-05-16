package exercici;

public class exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testIguals();
		testDiferents();
		testOrdenats();
	}
	public static boolean totsIguals(double x, double y, double z) {
		if(x==y && x==z) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean totsDiferents(double x, double y, double z) {
		if(x!=y && y!=z && x!=z) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean estanOrdenats(double x, double y, double z) {
		if(x<y && y<z) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void testIguals() {
		System.out.println("Test dels numeros iguals: ");
		
		comprovarIguals(2 ,2 ,2, true);
		comprovarIguals(5 , 5 ,12 , false);
		comprovarIguals(5, 2, 14, true);
		comprovarIguals(7, 7, 7, true);
		comprovarIguals(4, 2, 4, false);
	}
	public static void testDiferents() {
		System.out.println("Test dels numeros diferents: ");

		comprovarDiferent(2 ,2 ,2, true);
		comprovarDiferent(5 , 5 ,12 , false);
		comprovarDiferent(5, 2, 14, true);
		comprovarDiferent(7, 7, 7, true);
		comprovarDiferent(4, 2, 4, false);
	}
	public static void testOrdenats() {
		System.out.println("Test dels numeros ordenats: ");

		comprovarDiferent(5 , 7 ,12 , true);
		comprovarDiferent(5, 7, 14, false);
		comprovarDiferent(1, 8, 9, true);
		comprovarDiferent(7, 5, 4, false);
	}
	
	
	public static void comprovarIguals(double x, double y, double z, boolean resultat) {
		System.out.printf("(%.1f, %.1f, %.1f) = %b:  ", x,y,z,resultat);
		if(resultat == totsIguals(x,y,z)) {
			System.out.println("Es correcte");
		}else {
			System.out.println("No es correcte");
		}
	}
	
	public static void comprovarDiferent(double x, double y, double z, boolean resultat) {
		System.out.printf("(%.1f, %.1f, %.1f) = %b:  ", x,y,z,resultat);

		if(resultat == totsDiferents(x,y,z)) {
			System.out.println("Es correcte");
		}else {
			System.out.println("No es correcte");
		}
	}

	public static void comprovarOrdenats(double x, double y, double z, boolean resultat) {
		System.out.printf("(%.1f, %.1f, %.1f) = %b:  ", x,y,z,resultat);
		
		if(resultat == estanOrdenats(x,y,z)) {
			System.out.println("Es correcte");
		}else {
			System.out.println("No es correcte");
		}
	}
}