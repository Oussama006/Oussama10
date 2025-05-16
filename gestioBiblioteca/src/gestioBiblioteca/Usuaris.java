package gestioBiblioteca;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

class Usuaris {
	
	private String id;
	private String nom;
	private Set<String> llistaprestec;

	public Usuaris(String id, String nom) {
		this.id = id;
		this.nom = nom;
		this.llistaprestec = new HashSet<>();
	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public boolean afegirllibre(String ISBN) {
		return llistaprestec.add(ISBN);
	}

	public boolean retornarllibre(String ISBN) {
		return llistaprestec.remove(ISBN);
	}
	
	public String toString() {
		return "Nom: "+nom+ ". ID: "+id;
	}
}
