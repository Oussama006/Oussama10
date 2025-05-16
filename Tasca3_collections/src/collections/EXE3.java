package collections;

import java.util.*;

public class EXE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Escriu alguna cosa: ");
		String text = in.nextLine();
		
		Map<String, Integer> number = new HashMap<>();
		
		String[] words = text.toLowerCase().split(" ");
		
		for(int i=0; i < words.length; i++) {
			String word = words[i];
			
			if(number.containsKey(word)) {
				number.put(word, number.get(word)+1);
			} else {
				number.put(word, 1);
			}
		}
		
		for(String word : number.keySet()) {
			System.out.println(word + ": " + number.get(word));
		}
	}
}