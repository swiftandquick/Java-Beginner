package s9p64_p69;

public class Truck extends Vehicle {

	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String container;
	
	Truck() {
		super();
		steering = "?";
		musicSystem = "?";
		seatBelt = "?";
		airConditioner = "?";
		container = "?";
	}
	
	Truck(String rEngine, int rWheels, int rSeats, 
			String rFuelTank, String rLights, String rSteering, 
			String rMusicSystem, String rSeatBelt, 
			String rAirConditioner, String rContainer) {
		super(rEngine, rWheels, rSeats, rFuelTank, rLights);
		setSteering(rSteering);
		setMusicSystem(rMusicSystem);
		setSeatBelt(rSeatBelt);
		setAirConditioner(rAirConditioner);
		setContainer(rContainer);
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

	public void setContainer(String rContainer) {
		this.container = rContainer;
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
	
	public String getContainer() {
		return container;
	}
	
	@Override
	public void type() {
		System.out.print("  <Truck>  ");
	}
	
	public String toString() {
		return "Car[ " + super.toString() + 
				", Steering = " + steering + ", Music System = " + musicSystem
				+ ", Seat Belt = " + seatBelt + ", Air Conditioner = " + airConditioner
				+ ", Container = " + container + " ]";
	}
	
}
