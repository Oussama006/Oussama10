package paquets4;

import java.util.*;
import exercici.exercici6;
import metodes.exe3;
import Tasca2.metodes;

public class DissenyModular_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int op = 0;
		boolean correcte = false;
		
		while(!correcte) {
			menu();
			
			System.out.println("Entra una opcio: ");
			
			if(in.hasNextInt()) {
				op = in.nextInt();				
				if(op >= 1 && op <= 5) {
					correcte = true;
				}else {
					System.out.println("Error");
				}
			}else {
				System.out.println("El numero no es valid. ");
				in.next();
			}
		}
		switch(op) {
			case 1: 
				ejercicio1();
				break;
			case 2:
				ejercicio2();
				break;
			case 3:
				ejercicio3();
				break;
			case 4:
				ejercicio4();
				break;
			case 5:
				System.out.println("Sortir.");
				break;
			default:
				System.out.println("No valid.");

		}
	}
	public static void menu () {
		System.out.println("Menú: ");
		System.out.println("---------------------------------------------------------");
		System.out.println("1. Executa el test sobre el mètode de generació de matriu binària (dimensió= 4)");
		System.out.println("2. Mostra com s'escriu amb lletres el número 2823 ");
		System.out.println("3. Dibuixa les fulles d'un arbre amb base 21");
		System.out.println("4. Preguntes més freqüents sobre mètodes");
		System.out.println("5. Sortir ");
		System.out.println();

	}
	public static void ejercicio1 () {
		int [][] matriu = exercici6.generarMatriuBinaria(4);
		System.out.print("Matriu generada: ");
		exercici6.mostrarMatriu(matriu);
	}
	public static void ejercicio2 () {
		int num = 2823;
		String nom = exe3.intToNom(num);
		System.out.print(nom);
	}
	public static void ejercicio3 () {
		int num = 21;
		char letra = 'O';
		
		metodes.taula(num,letra);
		metodes.tronc(num);
	}
	public static void ejercicio4 () {
		String resultat = DissenyModular_2.faq();
		System.out.print(resultat);
	}
}