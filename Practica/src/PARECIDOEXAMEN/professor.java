package PARECIDOEXAMEN;

abstract class professor extends persona implements Materials {
	
	private String materia;

	public professor(String nombre, String sexo) {
		super(nombre, sexo);
		this.materia = Materials.material[getMateriaRandom()];
	}
	
	public String getMateria() {
		return materia;
	}
	
	public int getMateriaRandom() {
		return (int)Math.random()*2;
	}
	
}
