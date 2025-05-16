package exercici2;

public class testcurs {
	
	public static void main(String[] args) {
	
		Curs curs1 = new Curs("M02 Bases de Dades","Jordi Torres");
		Curs curs2 = new Curs("M03 Programacio","Albert Nadal");
	
		System.out.println(curs1.formatcadena());
		System.out.println(curs2.formatcadena());
	}
}