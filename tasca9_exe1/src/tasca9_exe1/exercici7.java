package tasca9_exe1;
import java.util.*;

public class exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
7.- Escriu un programa que demani un nombre enter positiu i mostri la seva representació en binari. 
Recorda comprovar que el nombre entrat és positiu. 
Cal fer-ho anant dividint per 2, no es poden utilitzar els mètodes inclosos al llenguatge 
Java, Integer.toBinaryString(int).
	*/
		Scanner in = new Scanner (System.in);
		
		System.out.print("Introdueix un numero: ");
		int numero = in.nextInt();
		
		String binari = "";
		
		if(numero <= 0) {
			System.out.print("El numero ha de ser positiu. ");

		}else {
			while(numero > 0) {
				binari = (numero % 2) +binari;
				numero = numero / 2;
			}
		}
		
		System.out.print(binari);

	}
}