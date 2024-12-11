package tasca7_exe1;
import java.util.*;


public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Encriptació de missatges: Fes un programa que demani una frase i encripti aquesta frase d’acord amb la següent norma:

Imaginem que tenim un desplaçament de 1 (constant), 
aleshores si escribim la paraula HOLA hauriem de suma 1 al codi ASCII de la lletra per obtenir la nova lletra. 
De la següent forma:

H → Ascii 72 (decimal) + 1(desplaçament) → 73 → que es converteix en I

O → Ascii 79 (decimal) + 1(desplaçament) → 80 → que es converteix en P

L → Ascii 76 (decimal) + 1(desplaçament) → 77 → que es converteix en M

A → Ascii 65(decimal) + 1(desplaçament) → 66 → que es converteix en B

La paraula encriptada seria IPMB

Ara, a més a més,  fes que si la lletra és una E, 
en comptes de sumar 1 es converteixi en un espai, 
I si tenim un espai es converteixi en una E.*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escriu una frase: ");
		String frase = in.nextLine();
		
		String constant = "";
		
		for(int i =0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if(letra == 'E') {
				constant += ' ';
			} else if (letra == ' '){
				constant += 'E';
			}else {
				constant += (char) (letra+1);
			}
		}	System.out.println("La paraula escrita és "+ constant);	
	}
}