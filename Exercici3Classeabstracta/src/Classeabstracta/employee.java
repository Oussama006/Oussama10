package Classeabstracta;

/**
 * Representa a un empleado con nombre, salario y DNI opcional.
 */

public class employee extends person{
	
	private double salary;
	private String DNI;
	
    /**
     * Constructor con nombre, DNI y salario.
     */

	public employee (String name, String DNI, double salary) {
		super(name);
		this.DNI = DNI;
		this.salary = salary;
	}
	
    /**
     * Constructor con nombre y salario (sin DNI).
     */
	
	public employee (String name, double salary) {
		super(name);
		this.DNI = null;
		this.salary = salary;
	}
	
    /** Muestra la descripción del empleado. */
	
	@Override
	
	public void getdescription() {
		if(DNI != null) {
			System.out.println("Name: " + getname() + " DNI: " + DNI + " Salary: " + salary);
		} else {
			System.out.println("Name: " + getname() + " Salary: " + salary);
		}
	}
}