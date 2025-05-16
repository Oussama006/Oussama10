package Tasca2;

public class TestLlibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Llibre llibre1 = new Llibre("Franklin", 5.0f , 19.90f , "Snowfall", 300);
		Llibre llibre2 = new Llibre("Michel", 7.0f , 25.50f , "Prision Break", 400);
		Llibre llibre3 = new Llibre("Walter", 10.0f , 30.00f , "Breaking bad", 500);
		Llibre llibre4 = new Llibre("Pablo", 8.5f , 22.75f , "Narco", 350);

		LlibreDigital digital1 = new LlibreDigital ("Professor", 6.0f, 15.99f, "La casa de papel", 200, "http://descarga1.com", 50);
		LlibreDigital digital2 = new LlibreDigital ("Vin disel", 9.5f, 28.99f, "Fast and Furious 5", 450, "http://descarga2.com", 129);
		LlibreDigital digital3 = new LlibreDigital ("Salim", 12.0f, 35.50f, "Snabba Cash", 600, "http://descarga3.com", 200);

		System.out.println("Benefici llibre1: " + llibre1.obtenirBenefici());
		System.out.println("IVA llibre2: "+ llibre2.obtenirIVA());
		llibre3.titolToString();
		System.out.println("Tamany per pàgina Digital1: " + digital1.tamanyPag());
		
		
	}
}