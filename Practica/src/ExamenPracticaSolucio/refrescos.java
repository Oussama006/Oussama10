package ExamenPracticaSolucio;

class refrescos extends begudes{

	private double persentatge;
	private boolean descompte = false;
	
	public refrescos(int id, double litres, double preu, String marca) {
		super(id,litres, preu, marca);
		
		this.persentatge = persentatge;
		this.descompte = descompte;
	}

	public double getPersentatge() {
		return persentatge;
	}
	
	public void setPersentatge(double persen) {
		this.persentatge = persen;
	}
	
	public double getPreuFinal() {
		if(descompte = true) {
			return getPreu() - (getPreu() * 0.10);
		}
		return getPreu();
	}

	@Override
	public String toString() {
		return "Refresc "+ getMarca() + " - " + getLitres() + "L - " + getPreu() + "€";
	}
	
}
