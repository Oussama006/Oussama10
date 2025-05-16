package Examen1;

import java.util.ArrayList;

class CarShowCase {
/***
 * Creant els atributs.
 */
	private ArrayList<CarDealership> cars;
	private CarDealership carShowCase;
	
	
	public CarShowCase(ArrayList<CarDealership> cars) {
		this.cars = cars;
	}

/***
 * Aqui estic modificant el preu.
 */
	public void UpdateCarPrice() {
		
		for(int i = 0; i<cars.size(); i++) {
			for(int j = 0; j < cars.size(); j++) {
				if(cars == null) {
					System.out.println("Esta buida:  " );
				}else {
					System.out.println("No és valid. ");
				}
			}
		}
	}
	
	/***
	 * Aqui estic añadin un nou cotxe i mirant si en cars esta buida o no.
	 */
	public void AddCar() {
		
		for(int i = 0; i<cars.size(); i++) {
			for(int j = 0; j < cars.size(); j++) {
				if(cars == null) {
					System.out.println("Esta buida.");
					cars.add(carShowCase);
				}else {
					System.out.println("No existeix. ");
				}
			}
		}
	}
	
}
