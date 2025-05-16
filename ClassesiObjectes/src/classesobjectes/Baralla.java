package classesobjectes;

import java.util.*;

/**
 * Representa una baralla de cartes espanyoles amb 48 cartes.
 */
class Baralla {
    
    private int posCartaSeguent; // Posició de la següent carta a repartir
    private Carta[] cartes; // Array que conté les cartes de la baralla
    private String[] PALS = {"Oros", "Copes", "Bastos", "Espases"}; // Pals de la baralla
    private int LIMIT_CARTA_PAL = 12; // Nombre màxim de cartes per pal

    /**
     * Constructor que inicialitza la baralla, crea les cartes i les barreja.
     */
    public Baralla() {
        this.posCartaSeguent = 0;
        this.cartes = new Carta[PALS.length * LIMIT_CARTA_PAL];
        crearBaralla();
        barallar();
    }

    /**
     * Crea totes les cartes de la baralla i les guarda a l'array.
     */
    private void crearBaralla() {
        int index = 0;
        for (int i = 0; i < PALS.length; i++) {
            for (int num = 1; num <= LIMIT_CARTA_PAL; num++) {
                cartes[index++] = new Carta(num, PALS[i]);
            }
        }
    }

    /**
     * Barreja les cartes de la baralla de manera aleatòria.
     */
    public void barallar() {
        Random aleatorio = new Random();
        int n = cartes.length;
        for (int i = 0; i < n; i++) {
            int j = aleatorio.nextInt(n);
            Carta canvi = cartes[i];
            cartes[i] = cartes[j];
            cartes[j] = canvi;
        }
        posCartaSeguent = 0;
    }

    /**
     * Retorna la següent carta de la baralla.
     * @return La següent carta o null si no queden cartes.
     */
    public Carta cartaSeguent() {
        if (posCartaSeguent >= cartes.length) {
            System.out.println("I don't have cartes.");
            return null;
        }
        return cartes[posCartaSeguent++];
    }

    /**
     * Indica quantes cartes queden per repartir.
     * @return El nombre de cartes disponibles.
     */
    public int cartesDisponibles() {
        return cartes.length - posCartaSeguent;
    }

    /**
     * Reparteix un nombre determinat de cartes.
     * @param numero Nombre de cartes a repartir.
     * @return Un array amb les cartes repartides o null si no n'hi ha prou.
     */
    public Carta[] donarCartes(int numero) {
        if (numero > cartesDisponibles()) {
            System.out.println("No cards available.");
            return null;
        }
        Carta[] repartir = new Carta[numero];
        for (int i = 0; i < numero; i++) {
            repartir[i] = cartaSeguent();
        }
        return repartir;
    }

    /**
     * Mostra per pantalla les cartes que queden a la baralla.
     */
    public void mostrarBaralla() {
        if (cartesDisponibles() == 0) {
            System.out.println("No cards.");
        } else {
            System.out.println("Cards disponibles: ");
            for (int i = posCartaSeguent; i < cartes.length; i++) {
                System.out.println(cartes[i]);
            }
        }
    }
}