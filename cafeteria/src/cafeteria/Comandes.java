package cafeteria;

class Comandes {

	private Clients client;
	private String nomProduct;
	
	public Comandes(Clients client, String nomProduct) {
		this.nomProduct = nomProduct;
		this.client = client;
	}

	public Clients getClient() {
		return client;
	}

	public String getNomProduct() {
		return nomProduct;
	}
	
	public String toString() {
		return "El client "+ client + " té de producte: "+ nomProduct;
	}
}