package PARECIDOEXAMEN;

class estudiante extends persona {
	
	private double calificacion;

	public estudiante(String nombre,  String sexo, double calificacion) {
		super(nombre, sexo);
		this.calificacion = generarnota();
	}
	
	int generar() {
		return super.edat = (int)(Math.random()*30);
	}
	
	private float generarnota() {
		return (float)(Math.random()*10);
	}
	
	boolean calcMovillos() {
		int probabilidad = (int)(Math.random()*100);
		return probabilidad >= 0 && probabilidad <= 50;
	}
	
}