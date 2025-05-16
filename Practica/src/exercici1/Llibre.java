package exercici1;

class Llibre {

	private int isbn;
	private String titol;
	private String autor;
	private int numpag;
	
	public Llibre (int isbn, String titol, String autor, int numpag) {
		this.isbn = isbn;
		this.autor = autor;
		this.numpag = numpag;
		this.titol = titol;
	}
	
	public int getisbn() {
		return isbn;
	}
	
	public String gettitol () {
		return titol;
	}
	
	public String getautor() {
		return autor;
	}
	
	public int getnumpag () {
		return numpag;
	}
	
	public void setisbn(int newisbn) {
		this.isbn = newisbn;
	}
	
	public void settitol(String newtitol) {
		this.titol = newtitol;
	}
	
	public void setautor(String newautor) {
		this.autor = newautor;
	}
	
	public void setnumpag(int newnumpag) {
		this.numpag = newnumpag;
	}
	
	public String toString() {
		return "El llibre " + gettitol() + " amb ISBN " + getisbn() + " creat per l'autor " + getautor() + " té " + getnumpag()+ " pàgines.";
	}
}