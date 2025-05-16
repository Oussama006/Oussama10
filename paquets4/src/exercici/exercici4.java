package exercici;

public class exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPrimer();
		testUltim();
		testConta();
	}
	public static int primerDigit(int n) {
		while(n>=10) {
			n = n/10;
		}
		return n;
	}
	public static int ultimDigit(int n) {
		n = n%10;
		return n;
	}
	public static int contaDigits(int n) {
		int contador=0;

		do {
			contador++;
			n =n/10;
		}while(n>0);
		return contador;
	}
	
	public static void testPrimer() {
		System.out.println("Primer digit: ");

		comprovarPrimer(123456,1);
		comprovarPrimer(123456,6);
		comprovarPrimer(12345678,8);
		comprovarPrimer(123456,5);
	}
	
	public static void testUltim() {
		System.out.println("Ultim digit: ");

		comprovarUltim(123456,1);
		comprovarUltim(123456,6);
		comprovarUltim(12345678,8);
		comprovarUltim(123456,5);
	}
	
	public static void testConta() {
		System.out.println("Conta digit: ");

		comprovarConta(123456,1);
		comprovarConta(123456,6);
		comprovarConta(12345678,8);
		comprovarConta(123456,5);
	}
	
	public static void comprovarPrimer(int n, int resultat) {
		System.out.printf("(%d): %d ", n, resultat);
		
		if(resultat == primerDigit(n)) {
			System.out.println(" Correcte.");
		}else {
			System.out.println(" No correcte.");
		}
	}
	public static void comprovarUltim(int n, int resultat) {
		System.out.printf("(%d): %d", n, resultat);
		
		if(resultat == ultimDigit(n)) {
			System.out.println(" Correcte.");
		}else {
			System.out.println(" No correcte.");
		}
	}
	public static void comprovarConta(int n, int resultat) {
		System.out.printf("(%d): %d", n, resultat);
		
		if(resultat == contaDigits(n)) {
			System.out.println(" Correcte.");
		}else {
			System.out.println(" No correcte.");
		}
	}
}