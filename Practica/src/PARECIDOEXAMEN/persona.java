package PARECIDOEXAMEN;

abstract class persona {

	private String nombre;
	private int edat;
	private String sexo;
	
	public persona(String nombre, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	abstract int generar();
	abstract boolean generarnota();
}