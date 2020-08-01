package s9p64_p69;

public class Car extends Vehicle {

	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	Car() {
		super();
		steering = "?";
		musicSystem = "?";
		seatBelt = "?";
		airConditioner = "?";
		fridge = "?";
		entertainmentSystem = "?";
	}
	
	Car(String rEngine, int rWheels, int rSeats, 
			String rFuelTank, String rLights, String rSteering, 
			String rMusicSystem, String rSeatBelt, String rAirConditioner, 
			String rFridge, String rEntertainmentSystem) {
		super(rEngine, rWheels, rSeats, rFuelTank, rLights);
		setSteering(rSteering);
		setMusicSystem(rMusicSystem);
		setSeatBelt(rSeatBelt);
		setAirConditioner(rAirConditioner);
		setFridge(rFridge);
		setEntertainmentSystem(rEntertainmentSystem);
	}

	public void setSteering(String rSteering) {
		this.steering = rSteering;
	}

	public void setMusicSystem(String rMusicSystem) {
		this.musicSystem = rMusicSystem;
	}

	public void setSeatBelt(String rSeatBelt) {
		this.seatBelt = rSeatBelt;
	}

	public void setAirConditioner(String rAirConditioner) {
		this.airConditioner = rAirConditioner;
	}

	public void setFridge(String rFridge) {
		this.fridge = rFridge;
	}

	public void setEntertainmentSystem(String rEntertainmentSystem) {
		this.entertainmentSystem = rEntertainmentSystem;
	}
	
	public String getSteering() {
		return steering;
	}
	
	public String getMusicSystem() {
		return musicSystem;
	}
	
	public String getSeatBelt() {
		return seatBelt;
	}
	
	public String getAirConditioner() {
		return airConditioner;
	}
	
	public String getFridge() {
		return fridge;
	}
	
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	@Override
	public void type() {
		System.out.print("  <Car>  ");
	}
	
	public String toString() {
		return "Car[ " + super.toString() + 
				", Steering = " + steering + ", Music System = " + musicSystem
				+ ", Seat Belt = " + seatBelt + ", Air Conditioner = " + airConditioner
				+ ", Fridge = " + fridge + ", Entertainment System = " + entertainmentSystem + " ]";
	}
	
}
