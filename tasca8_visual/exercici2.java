import java.util.*;

public class exercici2 {
    public static void main(String[] args) {
        /*Escriu un programa que agafi les dades de dues matrius unidimensionals de 
        n*3 elements i els copii a una tercera matriu de la següent manera, 
        3 elements de la primera matriu, 3 elements de la segona, 3 elements de la primera, etc…​ */

        Scanner in = new Scanner(System.in);

        System.err.println("Introdueix la dimensio de la matrius: ");
        int num = in.nextInt();

        int M1[] = new int[num*3];

        for(int order = 0; order < M1.length; order++){
            System.err.println("Escriu els numeros en matriu.");
            M1[order] = in.nextInt();
        }

    }
}
