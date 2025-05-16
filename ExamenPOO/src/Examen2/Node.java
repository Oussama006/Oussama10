package Examen2;

class Node {

	/***
	 * Creant els atributs;
	 */
	
	private Person person;
	private String next;
	
	/***
	 * 
	 * @param person
	 * 
	 * Creant el constructor.
	 */
	public Node(Person person) {
		this.person = person;
	}

	/***
	 * 
	 * @return
	 * 
	 * Creant els getters i setters.
	 */
	
	public Person getPerson() {
		return person;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

}
