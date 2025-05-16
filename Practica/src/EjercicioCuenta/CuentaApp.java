package EjercicioCuenta;

public class CuentaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuenta1 = new Cuenta("Oussama", 1000);
		
		cuenta1.ingresar(100);
		cuenta1.ingresar(200);
		
		cuenta1.retirada(120);
				
		System.out.println(cuenta1.toString());
		
	}
}