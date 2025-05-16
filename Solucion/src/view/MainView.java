package view;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import exceptions.DishNotInMenuException;
import exceptions.NonValidPriceException;
import exceptions.RestaurantFullCapacityException;
import model.Restaurant;

public class MainView {

	public static void printMenu() {
		System.out.println(
				"\n=== OPTIONS ===\n"
				+ "Customer options:\n"
				+ "1. Show menu.\n"
				+ "2. Order.\n"
				+ "Restaurant options:\n"
				+ "3. Add dish to menu.\n"
				+ "4. Server order.\n"
				+ "5. Show stats.\n"
				+ "Chose your option with a number from (1-5) or 0 to exit:"
				);
	}
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Scanner sc = new Scanner(System.in);

		int option = -1;
		while (option != 0) {
			printMenu();
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				restaurant.showMenu();
				break;
			case 2:
				boolean adding = true;
				Map<String, Integer> dishes = new HashMap();
				while (adding) {
					System.out.println("Dish name:");
					String dishName = sc.nextLine();
					System.out.println("Dish quantity:");
					int dishQuantity = sc.nextInt();
					sc.nextLine();
					dishes.put(dishName, dishQuantity);
					System.out.println("Add more dishes? Enter 'y' to continue:");
					adding = sc.nextLine().equals("y");
				}
				try {
					System.out.println(restaurant.askOrder(dishes));
				} catch (RestaurantFullCapacityException e) {
					System.out.println(e.getMessage());
				} catch (DishNotInMenuException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Add new dish name");
				String dishName = sc.nextLine();
				System.out.println("Add new dish price");
				float dishPrice = sc.nextFloat();
				sc.nextLine();
				try {
					restaurant.addDishToMenu(dishName, dishPrice);
					System.out.println("Dish added to menu.");
				} catch (NonValidPriceException e) {
					System.out.println("Dish couldn't not be added to menu.");
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println(restaurant.serveOrder());
				break;
			case 5:
				restaurant.showMostOrderedDishes();
				break;
			}

		}

	}

}
