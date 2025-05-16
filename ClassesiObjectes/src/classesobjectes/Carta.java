package classesobjectes;

/**
 * Representa una carta de la baralla espanyola.
 */
class Carta {

    private int numero; // Número de la carta (1-12)
    private String pal; // Pal de la carta (oros, copes, bastos, espases)

    /**
     * Constructor de la carta.
     * @param numero Número de la carta.
     * @param pal Pal de la carta.
     */
    public Carta(int numero, String pal) {
        this.numero = numero;
        this.pal = pal;
    }

    /**
     * Retorna la carta en format "X de Pal".
     * @return Cadena representativa de la carta.
     */
    public String toString() {
        return numero + " de " + pal;
    }
}