package Examen1;

/***
 * Aqui estic creant una classe abstract per els altres.
 */

abstract class CarDealership {
	
	/***
	 * Aqui estic crean els atributs.
	 */
	
	private String plateNumber;
	private String brand;
	private String model;
	private double price;
	private int autonomy;
	
	/***
	 * 
	 * @param plateNumber
	 * @param brand
	 * @param model
	 * @param price
	 * @param autonomy
	 */
	
	/***
	 * 
	 * Aqui estic crean un contructor
	 */
	public CarDealership(String plateNumber, String brand, String model, double price, int autonomy) {
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.autonomy = autonomy;
	}

	/***
	 * Ja aqui estic creant els getters i setters.
	 * @return
	 */
	public String getPlateNumber() {
		return plateNumber;
	}
	
	/***
	 * 
	 * @return
	 */
	
	public String getBrand() {
		return brand;
	}

	/***
	 * 
	 * @return
	 */
	public String getModel() {
		return model;
	}
	
	/***
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/***
	 * 
	 * @param price
	 */

	public void setPrice(double price) {
		if(price >5000) {
			this.price = price;
		}
	}
	/***
	 * Aqui estic ajustant que el preu ha de ser superior que els 5000€
	 * @return 
	 */

	public int getAutonomy() {
		return autonomy;
	}
	
	/**
	 * 
	 * @param autonomy
	 */

	public void setAutonomy(int autonomy) {
		this.autonomy = autonomy;
	}
}