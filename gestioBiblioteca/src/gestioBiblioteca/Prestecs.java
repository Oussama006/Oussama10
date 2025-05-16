package gestioBiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Prestecs {

	private List<Llibres> catoleg;
	private Map<String, Usuaris> usuari;
	
	public Prestecs() {
		catoleg = new ArrayList<>();
		usuari = new HashMap<>();
	}
	
	public void afegirLlibre(Llibres llibre) {
		catoleg.add(llibre);
	}
	
	public void registrarUsuari(Usuaris usuariNou) {
		usuari.putIfAbsent(String.valueOf(usuariNou.getId()), usuariNou);
	}

	public Llibres buscarllibre(String isbn) {
		for(Llibres llibre : catoleg) {
			if(llibre.getISBN().equals(isbn)) {
				return llibre;
			}
		}
		return null;
	}
	
	public boolean prestarllibre(String idUsuari, String isbn) {
		
		Usuaris usuarii = usuari.get(idUsuari);
		if(usuarii == null) {
			System.out.println("Usuari no trobat.");
			return false;
		}
		
		Llibres llibre = buscarllibre(isbn);
		if(llibre == null) {
			System.out.println("Llibre no trobat.");
			return false;
		}
		
		if(llibre.getQuantitat() == 0) {
			System.out.println("No hi han copies");
			return false;
		}
		
		if(!usuarii.afegirllibre(isbn)) {
			System.out.println("Aquest usuari ja te un llibre en prestec.");
			return false;
		}
		
		llibre.prestar();
		System.out.println("El prestec s'ha realitzat amb exit.");
		return true;
	}
	
	public boolean retornarllibre(String idUsuari, String isbn) {
		Usuaris usuarii = usuari.get(idUsuari);
		if(usuarii == null) {
			System.out.println("Usuari no trobat.");
			return false;
		}
		
		if(!usuarii.retornarllibre(isbn)) {
			System.out.println("Aquest usuari no tenia llibre.");
			return false;
		}
		
		Llibres llibre = buscarllibre(isbn);
		if(llibre != null) {
			llibre.retorna();
		}
		
		System.out.println("Llibre retornat.");
		return true;
	}
	
	public void mostrarCatoleg() {
		System.out.println("Catoleg llibre: ");
		for(Llibres llibre : catoleg) {
			System.out.println("- "+ llibre);
		}
	}
	
	public void mostrarUsuari() {
		System.out.println("Usuari reguistrats: ");
		for(Usuaris usuarii : usuari.values()) {
			System.out.println("- "+ usuarii);
		}
	}
}
