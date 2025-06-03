package Assignment1;

abstract class Vehicle {
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double fuelEffi;

	public Vehicle(String make, String model, int year, String fuelType, double fuelEffi) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.fuelEffi = fuelEffi;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public double getFuelEffi() {
		return fuelEffi;
	}
	
}

public class AbsClass {

}
