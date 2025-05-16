package classesobjectes;

/**
 * Classe per provar la classe Book.
 * Aquesta classe crea instàncies de llibres i compara el nombre de pàgines.
 */
public class BookTest {

    /**
     * Mètode principal que executa el programa.
     * 
     * @param args Arguments de la línia de comandes (no utilitzats).
     */
    public static void main(String[] args) {
        
        /**
         * Creació de tres instàncies de la classe Book amb diferents atributs.
         */
        Book llibre1 = new Book("ESWESH", "SnowFall", "Oussama", 226);
        Book llibre2 = new Book("ESWAWE", "Prision Break", "Mohamed", 315);
        Book llibre3 = new Book("ESKEKO", "Bob Esponja", "Hamitos", 520);

        // Impressió de la informació dels llibres
        System.out.println(llibre1);
        System.out.println(llibre2);
        System.out.println(llibre3);
        
        /**
         * Comparació del nombre de pàgines dels llibres i determinació del llibre amb més pàgines.
         */
        if (llibre1.getpageCount() > llibre2.getpageCount()) {
            System.out.println("Aquest és el llibre amb més pàgines: " + llibre1);
        } else if (llibre2.getpageCount() > llibre3.getpageCount()) {
            System.out.println("Aquest és el llibre amb més pàgines: " + llibre2);
        } else {
            System.out.println("Aquest és el llibre amb més pàgines: " + llibre3);
        }
    }
}
