package collections;

import java.util.*;

public class EXE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> OneSet = new HashSet<>(Arrays.asList(9,8,7));
		Set<Integer> TwoSet = new HashSet<>(Arrays.asList(6,5,4));

		Set<Integer> Unio = new HashSet<>(OneSet);
		Unio.addAll(TwoSet);
		
		Set<Integer> Interseccio = new HashSet<>(OneSet);
		Interseccio.addAll(TwoSet);
		
		System.out.println("Unió: "+ Unio);
		System.out.println("Intersecció: "+ Interseccio);
	}

}