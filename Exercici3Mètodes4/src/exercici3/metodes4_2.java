package exercici3;

import java.util.*;

public class metodes4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		introdueixData(in);

	}
	
	public static void introdueixData (Scanner in) {
		
		boolean correcte = false;
		
		do {
			System.out.print("Introdueix una data amb aquest format (dd/mm/aaaa): ");
			String data = in.nextLine();
			
			String[] parte = data.split("/");
			
			int dia = Integer.parseInt(parte[0]);
			int mes = Integer.parseInt(parte[1]);
			int any = Integer.parseInt(parte[2]);
			
			if(parte.length != 3) {
				
				System.out.println("ERROR. Ha de ser amb aquest format: (dd/mm/aaaa). ");
			}
			
			String nom = nomdelMes(mes);
			String diasemanal = calculSetmana(dia,mes,any);
			
			if(!comprovarAny(any)||!comprovarMes(mes)||!comprovardia(dia,mes,any)) {
				System.out.println("Error.");
			}else {
				System.out.print("La teva data és "+ diasemanal + " dia "+ dia + " de " + nom + " de " + any);
				correcte = true;
			}
		}while(!correcte);
	}
	public static boolean comprovarAny (int any) {
		
		if(any == 2021 || any == 2022 || any == 2023 || any == 2024) {
			return true;
		}else {
            System.out.println("ERROR l'any ha de ser 2021, 2022, 2023 o 2024.");
            return false;
		}	
	}
	public static boolean comprovarMes (int mes) {
		
		if(mes >= 1 && mes <= 12) {
			return true;
		}else {
            System.out.println("ERROR el mes ha de ser 1 i 12.");
			return false;
		}
				
	}
	
	public static String nomdelMes(int mes) {
		String [] nomMes = {"gener","febrer","març","abril", "maig","juny","juliol","agost","setembre","octubre","novembre","desembre"};
		return nomMes [mes - 1];
	}
	
	public static boolean comprovardia (int dia, int mes, int any) {
		int [] diames = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(mes == 2 && any == 2024) {
			diames[1] = 29;
		}
		return dia >= 1 && dia <= diames [mes -1];
	}
	
	
	public static String calculSetmana (int dia,int mes, int any) {
		int [] començament = {5, 6, 0, 2};
		
		String[] nomdies = {"diumenge","dilluns","dimarts","dimecres","dijous","divendres","dissabte"};
		
		int indexany = any - 2021;
		
		int total = començament[indexany];
		
		for(int i = 0; i < mes -1; i++) {
			total = total + diesDelMes(i+1,any);
		}
		
		total = total + dia - 1;
		
		return nomdies[total % 7];
		
	}
	public static int diesDelMes (int mes, int any ) {
		int [] diames = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(mes == 2 && any == 2024) {
			return 29;
		}
		return diames[mes - 1];
	}
}
