package gestioBiblioteca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prestecs bibloteca = new Prestecs();
		
		bibloteca.afegirLlibre(new Llibres("1","Wa Hassan" ,"Oussama" , 3));
		bibloteca.afegirLlibre(new Llibres("2","Wa primoo" ,"Oussama2" , 5));

		bibloteca.registrarUsuari(new Usuaris("001", "Pepe"));
		bibloteca.registrarUsuari(new Usuaris("002", "hAMID"));
		
		bibloteca.mostrarCatoleg();
		bibloteca.mostrarUsuari();
		
		bibloteca.prestarllibre("001","1");
		bibloteca.prestarllibre("001","2");
		bibloteca.prestarllibre("001","1");
		
		bibloteca.retornarllibre("001","1");
		
		bibloteca.mostrarCatoleg();
	}

}
