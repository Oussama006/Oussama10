package PARECIDOEXAMEN;

class Aula implements Materials{
	private char id;
	private int maxAlum;
	private String materia;
	
	public Aula(char id, int maxAlum) {
		this.id = id;
		this.maxAlum = maxAlum;
		this.materia = Materials.material[getMaterialRandom()];
	}
	
	public int getMaterialRandom() {
		return (int) Math.random()*2;
	}
}
