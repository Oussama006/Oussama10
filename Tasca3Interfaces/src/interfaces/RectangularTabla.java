package interfaces;

/**
 * Classe que representa una taula rectangular.
 */

class RectangularTable extends Table {
    private double width;
    private double length;

    /**
     * @param material Material of the table.
     * @param height Height of the table.
     * @param width Width of the table.
     * @param length Length of the table.
     */
    public RectangularTable(String material, double height, double width, double length) {
        super(material, height);
        this.width = width;
        this.length = length;
    }

    /**
     * @param material Material of the table.
     * @param width Width of the table.
     * @param length Length of the table.
     */
    public RectangularTable(String material, double width, double length) {
        super(material, 0);
        this.width = width;
        this.length = length;
    }

    
    public double calculateArea() {
        return width * length;
    }

    
    public int calculateGuests() {
        double perimeter = 2 * (width + length);
        return (int) (perimeter / 0.8);
    }

    
    public String toString() {
        return "RectangularTable: material=" + getMaterial() + ", height=" + getHeight() + ", width=" + width + ", length=" + length;
    }
}
