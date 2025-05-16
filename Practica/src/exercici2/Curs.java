package exercici2;

class Curs {

	private String nomCurs;
	private String nomProfessor;
	
	public Curs(String nomCurs, String nomProfessor) {
		this.nomCurs = nomCurs;
		this.nomProfessor = nomProfessor;
	}
	
	public void setNomCurs(String nom) {
		this.nomCurs = nom;
	}
	
	public String getNomCurs() {
		return nomCurs;
	}
	
	public void setNomProfessor(String Professor) {
		this.nomProfessor = Professor;
	}
	
	public String getNomProfessor() {
		return nomProfessor;
	}
	
	public String formatcadena() {
		return getNomCurs() + " impartit per " + getNomProfessor();
	}
}
