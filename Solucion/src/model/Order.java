package model;
import java.util.Map;
import java.util.Map.Entry;

public class Order {
	private Map<Dish,Integer> orderedDishes;
	
	public Order(Map orderedDishes) {
		this.orderedDishes = orderedDishes;
	}
	
	@Override
	public String toString() {
		int total = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("Dish - Price - Quantity - Total Price\n");
		sb.append("=====================================\n");
		for(Entry<Dish, Integer> entry: orderedDishes.entrySet()) {
			sb.append(entry.getKey()
					+ " - " + entry.getValue()
					+ "u - " + entry.getKey().getPrice()*entry.getValue()
					+ "\n");
			total += entry.getKey().getPrice()*entry.getValue();
		}
		sb.append("TOTAL = " + total);
		return sb.toString();
		
	}
}
