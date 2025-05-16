package Introducció_gestió_excepcions;

import java.io.*;
import java.util.*;

public class fitxers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fitxer = new File("numeros.txt");
		
		
		try{
			Scanner in = new Scanner(fitxer);

			int numfiles = 1;
			
			while(in.hasNextLine()) {
				String linia = in.nextLine();
				String[] valors = linia.split(" ");
				
				int contador= 0;
				double suma= 0;
				boolean error= false;
				
				for(int i = 0; i < valors.length; i++) {
					String valor = valors[i];
					Scanner verificar = new Scanner(valor);
					
					if(verificar.hasNextDouble()) {
						suma += verificar.nextDouble();
						contador++;
					} else {
						error = true;
					}
					verificar.close();
				}
				
				if(error) {
					System.out.println("Fila "+ numfiles + ":" + " ERROR. El valor no és númeric.");
				} else if(contador>0) {
						double mitjana = suma/contador;
						System.out.println("Fila "+ numfiles + ":" + " Mitjana: "+ mitjana);
					}else {
						System.out.println("Fila "+ numfiles + ":" + " No hi ha numeros ");
					}
				numfiles++;

				}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: L'archiu no s'ha trobat.");
		}
		
		
		
	}
}