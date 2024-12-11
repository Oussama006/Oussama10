package tasca9_exe1;
import java.util.*;

public class exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.- Escriu un programa que demani un caràcter 
		 * i una cadena i trobi el nombre d’aparicions del caràcter dins de la cadena 
		 * i ens digui el nombre de majúscules que hi ha dins la cadena.
		Ex: 
			Entra un caràcter: e
			Entra una cadena: La meva germana i el Joan van anar a la festa.
			Aparicions del caràcter e:4
			Nombre de majúscules: 2
			*/
		
		Scanner in = new Scanner (System.in);
		
		int mayusculas = 0;
		int aparece = 0;
		
		System.out.print("Entra un caràcter: ");
		String caracter = in.nextLine();

		System.out.print(caracter.charAt(0));
		
		char primer = caracter.charAt(0);
		
		System.out.print("Entra una cadena: ");
		String cadena = in.nextLine();
		
		System.out.print("Aparicions del caràcter "+primer+":");

		for(int i = 0; i<cadena.length();i++) {
			char letra = cadena.charAt(i);
			if(Character.isUpperCase(letra)) {
				mayusculas++;
			}
			if(primer == letra) {
				aparece++;
			}
		}
		
		System.out.println(aparece);		

		System.out.print("Nombre de majúscules: ");
		System.out.println(mayusculas);		
	}
}