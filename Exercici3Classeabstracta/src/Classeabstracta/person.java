package Classeabstracta;

/**
 * Clase abstracta que representa a una persona con un nombre.
 */

abstract class person {

	private String name;
	
    /**
     * Constructor de Person.
     * @param name Nombre de la persona.
     */
	
	public person (String name) {
		this.name = name;
	}
	
    /**
     * Obtiene el nombre de la persona.
     * @return Nombre de la persona.
     */
	
	public String getname() {
		return name;
	}
	
    /** Método abstracto para obtener la descripción. */

	public abstract void getdescription();
}