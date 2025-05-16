package Classeabstracta;

/**
 * Clase principal que ejecuta el programa.
 */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			employee one = new employee("Oussama", "39505687N", 10000);
			employee two = new employee("Khabib", "39552311R", 2000);
			student tree = new student("Asensio", "DAM" , 1);
			
			one.getdescription();
			two.getdescription();
			tree.getdescription();
	}

}
