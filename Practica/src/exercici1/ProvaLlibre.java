package exercici1;

public class ProvaLlibre {

	public static void main(String[] args) {

		Llibre llibre1 = new Llibre(123456, "Snowfall", "Franklin", 150);
		Llibre llibre2 = new Llibre(654321, "Prision Break", "Michel Scoffil", 150);
		Llibre llibre3 = new Llibre(456123, "Breaking bad", "Walter Wahit", 150);
		
		System.out.println(llibre1.toString());
		System.out.println(llibre2.toString());
		System.out.println(llibre3.toString());
		
		Llibre mesgran = llibre1;
		
		if(llibre2.getnumpag() > mesgran.getnumpag()) {
			mesgran = llibre2;
		}
		if(llibre3.getnumpag() > mesgran.getnumpag()) {
			mesgran = llibre3;
		}
		
		System.out.println("El llibre més gran és el: " + mesgran.gettitol());
		
	}
}