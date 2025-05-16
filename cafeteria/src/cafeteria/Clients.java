package cafeteria;

class Clients {

	private String DNI;
	private String nom;
	private boolean esVip;
	
	public Clients(String DNI, String nom, boolean esVip) {
		this.DNI = DNI;
		this.nom = nom;
		this.esVip = esVip;
	}

	public String getDNI() {
		return DNI;
	}

	public String getNom() {
		return nom;
	}
	
	public boolean esVip() {
		if(esVip) {
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		return nom + " amb DNI: " + DNI + " " + esVip;
	}
}
