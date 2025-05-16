package interfaces;

	/**
	 * Classe que representa una taula rodona.
	 */

class RoundTable extends Table {

	private double diameter;
	
    /**
     * @param material Material de la taula.
     * @param altura Alçada de la taula.
     * @param diametre Diàmetre de la taula.
     */
	
	public RoundTable(String material, double height, double diameter) {
	    super(material, height);
	    this.diameter = diameter;
	}
	   
    /**
     * @param material Material de la taula.
     * @param diametre Diàmetre de la taula.
     */
	
    public RoundTable(String material, double diameter) {
        super(material, 0);
        this.diameter = diameter;
    }
	
    public double calculateArea() {
        return Math.PI * Math.pow(diameter / 2, 2);
    }
	
    public int calculateGuests() {
        double circumference = Math.PI * diameter;
        return (int) (circumference / 1.0);
    }	
	
    public String toString() {
        return "RoundTable: material=" + getMaterial() + ", height=" + getHeight() + ", diameter=" + diameter;
    }

}
