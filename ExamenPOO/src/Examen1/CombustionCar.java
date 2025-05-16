package Examen1;

/***
 * Aqui esta heredant al concessionari.
 */

class CombustionCar extends CarDealership{

	/***
	 * Aqui estic creant les atributs.
	 */
	
	private String fuelType;
	private double tankCapacity;
	private double consuption;
	
	/***
	 * 
	 * @param plateNumber
	 * @param brand
	 * @param model
	 * @param price
	 * @param autonomy
	 * @param fuelType
	 * @param tankCapacity
	 * @param Consuption
	 */
	
	public CombustionCar(String plateNumber, String brand, String model, double price, int autonomy, String fuelType, double tankCapacity, double Consuption) {
		super(plateNumber, brand, model, price, autonomy);
			this.setFuelType(fuelType);
			this.setTankCapacity(tankCapacity);
			this.setConsuption(Consuption);	
	}

	/***
	 * 
	 * @return
	 */
	
	public String getFuelType() {
		return fuelType;
	}
	
	/***
	 * 
	 * @param fuelType
	 */

	public void setFuelType(String fuelType) {
		
		this.fuelType = fuelType;
	}
	
	/***
	 * 
	 * @return
	 */

	public double getTankCapacity() {
		return tankCapacity;
	}
	
	/***
	 * 
	 * @param tankCapacity
	 */

	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	/**
	 * 
	 * @return
	 */

	public double getConsuption() {
		return (consuption*100)/tankCapacity;
	}
	
	/**
	 * 
	 * @param consuption
	 */

	public void setConsuption(double consuption) {
		this.consuption = consuption;
	}

	

}