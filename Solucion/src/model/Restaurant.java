package model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import exceptions.DishNotInMenuException;
import exceptions.NonValidPriceException;
import exceptions.RestaurantFullCapacityException;

import java.util.Queue;

public class Restaurant {
	
	private List<Dish> menu;
	private Queue<Order> orders;
	private Map<Dish, Integer> orderedDishesCounts;

	public Restaurant(){
		menu = new ArrayList();
		orders = new LinkedList();
		orderedDishesCounts = new HashMap();
	}
	
	public void showMenu(){
		System.out.println("Dish - Price");
		System.out.println("============");
		for(Dish dish: menu) {
			System.out.println(dish);
		}
	}
	
	public void showMostOrderedDishes() {
		System.out.println("Dish - Price - Total Units Ordered");
		System.out.println("==================================");
		for(Entry<Dish,Integer> entry: orderedDishesCounts.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	
	public Dish getDishFromName(String name) throws DishNotInMenuException {
		for (Dish dish: menu) {
			if (dish.getName().equals(name)){
				return dish;
			}
		}
		throw new DishNotInMenuException("Dish " + name + " not found in menu.");		
	}
	
	public Order askOrder(Map<String,Integer> dishes) throws RestaurantFullCapacityException, DishNotInMenuException {
		if( orders.size() >= 10) {
			throw new RestaurantFullCapacityException("Restaurant can't take more orders. Already serving 10 orders.");
		}
		Map<Dish,Integer> orderedDishes = new HashMap();
		for (Entry<String, Integer> entry:dishes.entrySet()) {
			String dishName = entry.getKey();
			Dish dish = getDishFromName(dishName);
			int units = entry.getValue();
			orderedDishes.put(dish, units);
		}
		
		Order order = new Order(orderedDishes);
		orders.add(order);
		
		for (Entry<Dish, Integer> entry:orderedDishes.entrySet()) {
			Dish dish = entry.getKey();
			int units = entry.getValue();
			orderedDishesCounts.put(
					dish,
					orderedDishesCounts.getOrDefault(dish, 0)+units);
		}
		return order;		
	}
	
	public Order serveOrder(){
		return orders.poll();
	}
	
	public void addDishToMenu(String name, float price) throws NonValidPriceException {
		menu.add(new Dish(name, price));
		menu.sort(null);;
	}
	
	
}
