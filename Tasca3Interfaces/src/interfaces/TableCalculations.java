package interfaces;

	/***
	 * Interficie per a càlculs de taules.
	 */

interface TableCalculations{
    /**
     * Calcula l'àrea de la taula.
     * @return Àrea de la taula en m².
     */
	double calculateArea();
    /**
     * Calcula el nombre de comensals que caben a la taula.
     * @return Nombre de comensals.
     */
	int calculateGuests();
}