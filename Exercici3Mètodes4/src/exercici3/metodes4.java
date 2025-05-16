package exercici3;

import java.util.*;
import java.lang.*;

public class metodes4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> champions = new ArrayList<>();
		StringBuilder parelles = new StringBuilder();
		
		bombo(champions);
		
		champions = emparejamientos(champions);
				
		sorteo(champions, parelles);
			
		System.out.print(parelles.toString());
		System.out.println("------------------------------------------------");

				
	}
	public static void bombo (ArrayList<String> champions) {
		
		System.out.println();

		System.out.println("Emparellaments dels quarts de final de la Champions League:");
		
		System.out.println("_________________________________________________________________________________________________________________________________");
		
		champions.add("Real Madrid CF");
		champions.add("FC Barcelona");
		champions.add("Liverpool FC");
		champions.add("Manchester City FC");
		champions.add("Bayern Múnich");
		champions.add("Borussia Dortmund");
		champions.add("Paris Saint-Germain FC");
		champions.add("Milan");
		
		
		//String liga = champions.toString();
		
		System.out.println(champions);
		System.out.println("_________________________________________________________________________________________________________________________________");

	}
	public static void sorteo (ArrayList<String> champions, StringBuilder parelles) {
		
		String equip1,equip2;
		
		while(champions.size() > 0) {
			equip1 = champions.remove(0);
			equip2 = champions.remove(0);
			
			parelles.append(equip1).append(" vs ").append(equip2).append("\n");
		}
	}
	public static ArrayList<String> emparejamientos (ArrayList<String> champions) {
		
		System.out.println("------------------------------------------------");

		Collections.shuffle(champions);
		
		return champions;
				
	}


}
