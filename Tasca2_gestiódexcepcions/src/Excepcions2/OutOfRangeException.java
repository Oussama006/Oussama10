package Excepcions2;

public class OutOfRangeException extends Exception{

	private String message;

	public OutOfRangeException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}