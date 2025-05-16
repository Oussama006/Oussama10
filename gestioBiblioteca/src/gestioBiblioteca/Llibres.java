package gestioBiblioteca;

class Llibres {

	private String ISBN;
	private String titol;
	private String autor;
	private int quantitat;
		
	public Llibres(String ISBN,String titol,String autor, int quantitat) {
		this.ISBN = ISBN;
		this.titol = titol;
		this.autor = autor;
		this.quantitat = quantitat; 
	}

	public String getISBN() {
		return ISBN;
	}

	public String getAutor() {
		return autor;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void prestar() {
		if(quantitat > 0) {
			quantitat--;
		}
	}
	
	public void retorna() {
		quantitat++;
	}
	
	public String toString() {
		return "El titol del llibre és "+ titol + " amb el ISBN " + ISBN + " del autor "+ autor+ " que te dispoblies : "+ quantitat;
	}
}
