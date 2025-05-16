package Tasca2;

import java.time.LocalDate;
import java.time.Period;

public class TestEmpleats {
    public static void main(String[] args) {
    	
        Comercial comercial1 = new Comercial("12345678A", "Ahmed", "Ben Ali", LocalDate.of(1985, 5, 10), 2500, 0);
        Comercial comercial2 = new Comercial("23456789B", "Fatima", "El Hassan", LocalDate.of(1995, 8, 20), 2200, 0);
        Comercial comercial3 = new Comercial("56789012E", "Omar", "Ibn Khaldun", LocalDate.of(1980, 12, 5), 2800, 0);
        Comercial comercial4 = new Comercial("67890123F", "Aisha", "Al Mansour", LocalDate.of(1992, 4, 18), 2400, 0);


        Repartidor Repartidor1 = new Repartidor("34567890C", "Youssef", "Al Farsi", LocalDate.of(2001, 3, 15), 1800, "zona 5");
        Repartidor Repartidor2 = new Repartidor("45678901D", "Zainab", "El Idrissi", LocalDate.of(1998, 7, 25), 1750, "zona 3");
        Repartidor Repartidor3 = new Repartidor("78901234G", "Khalid", "Al Rashid", LocalDate.of(2000, 9, 10), 1900, "zona 5");
        Repartidor Repartidor4 = new Repartidor("89012345H", "Layla", "Ben Youssef", LocalDate.of(1996, 11, 30), 1700, "zona 2");
        
        
        comercial1.aplicarComissio();
        comercial2.aplicarComissio();
        comercial3.aplicarComissio();
        comercial4.aplicarComissio();
        
        Repartidor1.aplicarComissio();
        Repartidor2.aplicarComissio();
        Repartidor3.aplicarComissio();
        Repartidor4.aplicarComissio();

        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(comercial3);
        System.out.println(comercial4);
        
        System.out.println(Repartidor1);
        System.out.println(Repartidor2);
        System.out.println(Repartidor3);
        System.out.println(Repartidor4);
    }
}