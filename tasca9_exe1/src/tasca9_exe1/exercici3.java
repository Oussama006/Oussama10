package tasca9_exe1;
import java.util.*;

public class exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
3.- Escriu un programa que determini si una cadena és un password vàlid.
El password ha de tenir un mínim de 8 caràcters.
El password ha de tenir almenys una lletra minúscula i almenys una lletra majúscula.
Com a mínim ha de tenir dos dígits.*/
		Scanner in = new Scanner (System.in);
		
		System.out.print("Introdueix el vostre password: ");
		String password = in.nextLine();
		
		int numeros = 0;
		int minuscula = 0;
		int majuscula = 0;
		
		if (password.length()>=8) {
			for(int i = 0; i<password.length();i++) {
				char letra = password.charAt(i);
				
				if(Character.isUpperCase(letra)) {
					majuscula++;
				}if(Character.isLowerCase(letra)) {
					minuscula++;
				}if(Character.isDigit(letra)) {
					numeros++;
				}
			}
			if(majuscula > 0 && minuscula > 0 && numeros >= 2) {
				System.out.print("Password correcte. ");
			} else {
				System.out.print("Password incorrecte. ");
			}
			
		}else {
			System.out.print("Password incorrecte. ");
		}
		
	}

}


