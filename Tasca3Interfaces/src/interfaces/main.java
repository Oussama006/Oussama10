package interfaces;

/**
 * Classe principal per provar el funcionament de les taules.
 */

public class main {
    /**
     * Mètode principal.
     * @param args Arguments de la línia de comandes (no s'utilitzen).
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double diningRoomArea = 50;
        double maxTableArea = diningRoomArea / 2;
		
		Table[] tables = new Table[6];
		tables[0] = new RectangularTable("vidre", 0.75, 1.2, 1.5);
		tables[1] = new RectangularTable("fusta", 1.0, 1.0);
		tables[2] = new RoundTable("metall", 0.8, 1.0);
		tables[3] = new RoundTable("fusta", 1.5);
		tables[4] = new RectangularTable("metall", 0.9, 2.0, 1.0);
		tables[5] = new RoundTable("vidre", 0.6, 0.8);
		
        double totalArea = 0;
        int totalGuests = 0;
		
        for (Table t : tables) {
            totalArea += t.calculateArea();
            totalGuests += t.calculateGuests();
        }

        System.out.println("Total area of the tables: " + totalArea + " m²");
		
        if (totalArea < maxTableArea) {
			System.out.println("Les taules caben bé en el menjador.");
		} else {
			System.out.println("Les taules NO caben bé en el menjador.");
		}
		
		System.out.println("Nombre de taules: " + tables.length);
	    System.out.println("Total de comensals que caben: " + totalGuests);
		
        Table largestTable = tables[0];
        for (int i = 1; i < tables.length; i++) {
            if (tables[i].compareTo(largestTable) > 0) {
                largestTable = tables[i];
            }
        }
		System.out.println("La taula de major superfície està feta de: " + largestTable.getMaterial());
	}
}