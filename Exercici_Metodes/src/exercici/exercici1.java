package exercici;

public class exercici1 {

	public static void main (String [] args) {
		// TODO Auto-generated method stub

	}
	public static int sumaRang (int limit1, int limit2) {
		// TODO Auto-generated method stub
		int retorn;
		
		if(limit1 < limit2) {
			int suma = 0;
			for(int i = limit1; i< limit2+1; i++) {
				suma += i;
			}
			retorn = suma;
		}else {
			int suma = 0;
			for(int i = limit2; i < limit1+1; i++) {
				suma +=i;
			}
			retorn = suma;
		}
		return retorn;
	}

}
