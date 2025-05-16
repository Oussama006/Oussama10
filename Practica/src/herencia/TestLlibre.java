package herencia;

public class TestLlibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		llibreDigital book1 = new llibreDigital("Oussama", 19, 5, "Snowfall", 234, "descargar.com", 24);
		
		System.out.println("Benefici: " + book1.obtenirBenefici());
		System.out.println("IVA: "+ book1.obtenirIva());
		
		book1.titolToString();
		
	}
}