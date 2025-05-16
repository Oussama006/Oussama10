package metodes;

import java.util.Scanner;

public class exe3 {

	public static final String[] UNIDADES = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho",
			"nueve" };
	public static final String[] DEZENAS = { "", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis",
			"diecisiete", "dieciocho", "diecinueve" };
	public static final String[] DEZENAS_COMPLETAS = { "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
			"setenta", "ochenta", "noventa" };

	public static String intToNom(int numero) {
		if (numero == 0) return "cero";
		  	if (numero < 0 || numero >= 10000) return "Número no válido";
		        StringBuilder resultado = new StringBuilder();
		        if (numero >= 1000) 
		        {
		            int miles = numero / 1000;
		            resultado.append(UNIDADES[ miles]).append(" mil ");
		            numero %= 1000;
		        }

		        if (numero >= 100) {
		            int centenas = numero / 100;
		            if (centenas == 1) {
		                resultado.append("ciento ");
		            } else {
		                resultado.append(UNIDADES[ centenas]).append(" cien ");
		            }
		            numero %= 100;
		        }

		        if (numero >= 20) {
		            int decenas = numero / 10;
		            if (numero % 10 == 0) {
		                resultado.append(DEZENAS_COMPLETAS[decenas]);
		            } else {
		                resultado.append(DEZENAS_COMPLETAS[decenas]).append("-" );
		                numero %= 10;
		            }
		        } else if (numero >= 10) {
		            resultado.append(DEZENAS[ numero - 10]);
		            numero = 0;
		        }

		        if (numero > 0) {
		            resultado.append(UNIDADES[ numero]);
		        }

		        return resultado.toString().trim(). replaceAll(" $", "").replaceAll("u ", "un ");
		    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Entra un número positivo < 10000: ");
			int numero = scanner.nextInt();

			if (numero < 0) {
				break;
			}

			String nombre = intToNom(numero);
			System.out.println(nombre);
		}

		scanner.close();
	}
}