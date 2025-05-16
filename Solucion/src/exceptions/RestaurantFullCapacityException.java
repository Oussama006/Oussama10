package exceptions;

public class RestaurantFullCapacityException extends Exception {

	public RestaurantFullCapacityException(String message){
		super(message);
	}
}
