package Classeabstracta;

/**
 * Representa a un estudiante con nombre, curso e ID de estudiante.
 */

public class student extends person {

	private String course;
	private int Studentid;
	
    /**
     * Constructor de Student.
     */
	
	public student (String name, String course, int Studentid) {
		super(name);
		this.course = course;
		this.Studentid = Studentid;
	}
	
    /** Muestra la descripción del estudiante. */
	@Override
	public void getdescription() {
		System.out.println("Name: " + getname() + " course " + course + " student id " + Studentid );
	}

}