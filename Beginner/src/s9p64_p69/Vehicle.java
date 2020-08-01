package s9p64_p69;

public class Vehicle {

	private String engine;
	private int wheels;
	private int seats;
	private String fuelTank;
	private String lights;
	
	Vehicle() {
		engine = "?";
		wheels = 0;
		seats = 0;
		fuelTank = "?";
		lights = "?";
	}
	
	Vehicle(String rEngine, int rWheels, int rSeats, String rFuelTank, String rLights) {
		setEngine(rEngine);
		setWheels(rWheels);
		setSeats(rSeats);
		setFuelTank(rFuelTank);
		setLights(rLights);
	}

	public void setEngine(String rEngine) {
		this.engine = rEngine;
	}

	public void setWheels(int rWheels) {
		this.wheels = rWheels;
	}

	public void setSeats(int rSeats) {
		this.seats = rSeats;
	}

	public void setFuelTank(String rFuelTank) {
		this.fuelTank = rFuelTank;
	}

	public void setLights(String rLights) {
		this.lights = rLights;
	}
	
	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public String getFuelTank() {
		return fuelTank;
	}
	
	public String getLights() {
		return lights;
	}
	
	public void type() {
		System.out.print("  <Unknown>  ");
	}
	
	public String toString() {
		return "Vehicle[Engine = " + engine + ", Wheels = " 
				+ wheels + ", Seats = " + seats 
				+ ", Fuel Tank = " + fuelTank 
				+ ", Lights = " + lights + "]";
	}
	
}
