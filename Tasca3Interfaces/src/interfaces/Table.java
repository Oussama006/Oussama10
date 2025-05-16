package interfaces;

	/**
	 * Classe abstracta que representa una taula.
	 */

abstract class Table implements TableCalculations, Comparable<Table> {
    private String material;
    private double height;

    /**
     * @param material Material of the table.
     * @param height Height of the table in meters.
     */
    public Table(String material, double height) {
        this.material = material;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    
    public int compareTo(Table other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }
}
