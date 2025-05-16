package classesobjectes;

/**
 * Clase de prueba para la clase Course.
 * 
 * Esta clase crea instancias de la clase Course y muestra su representación formateada.
 * 
 * @author oussama
 */
public class CourseTest {

    /**
     * Método principal que ejecuta la prueba de la clase Course.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Creación de objetos Course con diferentes valores
        Course classA = new Course("M02 Bases de Dades", "Carles Roig");
        Course classB = new Course("M03 Llengues de Marques", "Sergi Torres");

        // Impresión de la representación formateada de cada curso
        System.out.println(classA.formatCadena());
        System.out.println(classB.formatCadena());
    }
}