package s9p58_p63;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	Car() {
		doors = "";
		engine = "";
		driver = "";
		speed = 0;
	}
	
	/** This constructor calls set methods to set variables.  */
	Car(String rDoors, String rEngine, String rDriver, int rSpeed) {
		setDoors(rDoors);
		setEngine(rEngine);
		setDriver(rDriver);
		setSpeed(rSpeed);
	}
	
	public void setDoors(String rDoors) {
		this.doors = rDoors;
	}
	
	public void setEngine(String rEngine) {
		this.engine = rEngine;
	}
	
	public void setDriver(String rDriver) {
		this.driver = rDriver;
	}
	
	public void setSpeed(int rSpeed) {
		this.speed = rSpeed;
	}
	
	public String getDoors() {
		return doors;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void run() {
		System.out.println("Vroom, vroom, vroom.  ");
	}
	
	public String toString() {
		return "Car\nDoors:  " + doors + "\nEngine:  " + engine 
				+ "\nDriver:  " + driver + "\nSpeed:  " + speed;
	}
	
}
