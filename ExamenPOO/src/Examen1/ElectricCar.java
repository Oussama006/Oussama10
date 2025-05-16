package Examen1;

/***
 * Aqui esta heredant al concessionari.
 */

class ElectricCar extends CarDealership{

	/***
	 * Aqui estic creant atributs.
	 */
	private int chargeTime;
	private int batteryCapacity;
	private double consumption;
	
	/***
	 * 
	 * @param plateNumber
	 * @param brand
	 * @param model
	 * @param price
	 * @param autonomy
	 * @param chargeTime
	 * @param batteryCapacity
	 * @param consumption
	 */
	
	/***
	 * 
	 * Aqui estic creant un constructor.
	 */
	
	public ElectricCar(String plateNumber, String brand, String model, double price, int autonomy, int chargeTime, int batteryCapacity, double consumption) {
		super(plateNumber, brand, model, price, autonomy);
		this.setChargeTime(chargeTime);
		this.setBatteryCapacity(batteryCapacity);
		this.setConsumption(consumption);
	}
	
	/***
	 * 
	 * @return
	 */

	public int getChargeTime() {
		return chargeTime;
	}
	
	/***
	 * 
	 * @param chargeTime
	 */

	public void setChargeTime(int chargeTime) {
		this.chargeTime = chargeTime;
	}
	
	/***
	 * 
	 * @return
	 */

	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	/***
	 * 
	 * @param batteryCapacity
	 */

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	/***
	 * 
	 * @return
	 */
	
	public double getConsumption() {
		return (consumption * 100) / batteryCapacity;
	}
	
	/***
	 * Aqui estic fent l'operacio.
	 * @param consumption
	 */

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	 
}
