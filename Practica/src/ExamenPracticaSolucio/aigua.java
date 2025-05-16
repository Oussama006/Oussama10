package ExamenPracticaSolucio;

class aigua extends begudes{
	
	
	private String origen;
	
	public aigua(int id, double litres, double preu, String marca, String origen) {
		super(id, litres, preu, marca);
		this.origen = origen;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String newOrigen) {
		this.origen = newOrigen;
	}

	@Override
	public String toString() {
	
		return "Aigua de " + getOrigen() + " - " + getLitres() + "L - "+ getPreu() + "€";
	}


	
}
