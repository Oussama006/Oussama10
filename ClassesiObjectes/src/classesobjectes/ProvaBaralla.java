package classesobjectes;

/**
 * Classe principal per provar el funcionament de la baralla de cartes.
 */
public class ProvaBaralla {

    /**
     * Mètode principal que executa el programa i prova els diferents mètodes de la classe Baralla.
     * @param args Arguments de la línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        // Creació de la baralla
        Baralla baralla = new Baralla();
        
        System.out.println("Welcom in the game");

        // Mostrar la baralla inicial
        baralla.mostrarBaralla();
        
        System.out.println();

        // Repartir la següent carta
        System.out.println("Repartireixon in the cards: ");
        System.out.println(baralla.cartaSeguent());

        System.out.println();

        // Mostrar el nombre de cartes disponibles
        System.out.println("Cards disponibilesion: ");
        System.out.println(baralla.cartesDisponibles());

        System.out.println();

        // Repartir 5 cartes
        System.out.println("5 cards: ");
        Carta[] cartesRepartides = baralla.donarCartes(5);
        
        if (cartesRepartides != null) {
            for (int i = 0; i < cartesRepartides.length; i++) {
                System.out.println(cartesRepartides[i]);
            }
            System.out.println();
        }
        
        // Barrejar la baralla de nou i mostrar-la
        System.out.println("Other barrajeixion... ");
        baralla.barallar();
        baralla.mostrarBaralla();
    }
}