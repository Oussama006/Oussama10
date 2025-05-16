package Excepcions2;

import java.util.*;
import java.io.*;

public class exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		boolean home = false;
		while(!home) {
			System.out.println("Introdueix una frase menys de 10 caracters. ");
			String frase = in.nextLine();
			
			try {				
				if(frase.length() < 10) {
					throw new IllegalArgumentException("Ha de tenir menys de 10 caracters. ");
				}
				String reverce = new StringBuilder(frase).reverse().toString();
				System.out.println(reverce);
				home = true;
			} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
			} finally {
				System.out.println("Ejecutando");
			}
			
		}
		
	}
}