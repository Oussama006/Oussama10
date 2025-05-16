package recursivitat;

public class exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(find("recursivitat", "cursi"));
		
		
	}
	public static boolean find(String str, String match) {
		if(str.length() < match.length()) {
			return false;
		}
		if(str.substring(0,match.length()).equals(match)) {
			return true;
		}
		return find(str.substring(1),match);
	}
}