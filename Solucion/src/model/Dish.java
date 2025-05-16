package model;
import exceptions.NonValidPriceException;

public class Dish implements Comparable<Dish> {
	
	private String name;
	private float price;
	
	public Dish(String name, float price) throws NonValidPriceException {
		if (price <= 0) {
			throw new NonValidPriceException("Price " + price + " not valid, it should be greater than 0.");
		}
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " - " + price;
	}

	@Override
	public int compareTo(Dish dish) {
		//return this.name.compareTo(dish.name); Este para el nombre.

		if(this.price > dish.price) {
			return 1;
		}else if(this.price < dish.price) {
			return -1;
		}else {
			return 0;
		}
	}
	

}
