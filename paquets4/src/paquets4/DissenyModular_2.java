package paquets4;

import java.util.*;

/**
 * Clase que genera preguntas aleatorias sobre el diseño modular en Java y proporciona sus respuestas.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
class DissenyModular_2 {

    /**
     * Método que selecciona aleatoriamente tres preguntas y sus respectivas respuestas 
     * de una lista predefinida y las devuelve en un solo String.
     * 
     * @return Un String con tres preguntas y sus respuestas concatenadas.
     */
    static String faq() {
        
        Random aleatori = new Random();

        // Lista de preguntas
        ArrayList<String> preguntas = new ArrayList<>();

        preguntas.add("Si creo una classe i no la poso en cap paquet en quin paquet estarà ? ");
        preguntas.add("Si tinc una classe en el default package la podrem veure des de un altre paquet ? Perquè? ");
        preguntas.add("Si tinc una classe sense cap qualificador public des d'on serà accessible (apunts Josep Queralt apartat 34.21)? ");
        preguntas.add("Si tinc una classe amb el qualificador private en comptes de public des d'on serà accessible? ");
        preguntas.add("Si tinc una classe amb el qualificador package en comptes de public des d'on serà accessible? ");
        preguntas.add("Quin missatge d'error mostra l'eclipse quan intentes accedir a una classe sense qualificador d'un altre paquet? ");

        // Lista de respuestas
        ArrayList<String> respostes = new ArrayList<>();

        respostes.add("Si no poses una classe en cap paquet, estarà en el default package.");
        respostes.add("No, una classe en el default package no es pot veure des d'un altre paquet perquè no es permet l'accés entre paquets diferents si no estan explícitament especificats.");
        respostes.add("Serà accessible només dins del mateix paquet.");
        respostes.add("No es pot declarar una classe com private en Java. Només els membres (atributs i mètodes) poden ser private.");
        respostes.add("Amb el qualificador package (per defecte, sense especificar public), només serà accessible des del mateix paquet.");
        respostes.add("Eclipse mostra un error del tipus: \"The type [ClassName] is not visible\".");

        String relacio = "";

        // Seleccionar tres preguntas aleatorias y sus respuestas
        for (int i = 0; i < 3; i++) {
            int bucle = aleatori.nextInt(preguntas.size());
            relacio = relacio + preguntas.get(bucle);
            relacio = relacio + respostes.get(bucle);
        }
        
        return relacio;
    }
}
