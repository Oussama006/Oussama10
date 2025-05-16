package EjercicioCuenta;

class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta(String titular) {
		this(titular,0);
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		if(cantidad > 0) {
			this.cantidad = cantidad;
		}else {
			this.cantidad = 0;
		}
	}
	
	public String gettitular() {
		return titular;
	}
	
	public double getcantidad() {
		return cantidad;
	}
	
	public void settitular(String newtitu) {
		this.titular = newtitu;
	}
	
	public void setcanti(double newcanti) {
		this.cantidad = newcanti;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad > 0) {
			this.cantidad = cantidad;
		}
	}
	
	public void retirada(double cantidad) {
		if(this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		}else {
			this.cantidad = this.cantidad - cantidad;
		}
	}
	
	public String toString() {
		return "Titular: "+ gettitular() + " Cantidad: " + getcantidad();
	}
}