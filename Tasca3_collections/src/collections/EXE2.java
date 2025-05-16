package collections;

import java.util.*;

public class EXE2 {
	
	public static void main(String[] args) {
		System.out.println("És palíndrom? "+ isPalindrome("Anna"));
		System.out.println("És palíndrom? "+ isPalindrome("Wesh"));
	}

	public static boolean isPalindrome (String word) {
		
		Deque<Character> cua = new LinkedList<>();
		
		String Lowercase = word.toLowerCase();
		
		for(int i = 0; i < Lowercase.length(); i++) {
			char c = Lowercase.charAt(i);
			if(Character.isLetter(c)) {
				cua.add(c);
			}
		}
		
		while(cua.size() > 1) {
			if(cua.pollFirst() != cua.pollLast()) {
				return false;
			}
		}
		return true;
	}

}
