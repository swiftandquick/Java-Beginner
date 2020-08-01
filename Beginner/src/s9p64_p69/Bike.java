package s9p64_p69;

public class Bike extends Vehicle {

	private String handle;
	
	Bike() {
		super();
		handle = "?";
	}
	
	Bike(String rEngine, int rWheels, int rSeats, 
			String rFuelTank, String rLights, String rHandle) {
		super(rEngine, rWheels, rSeats, rFuelTank, rLights);
		setHandle(rHandle);
	}

	public void setHandle(String rHandle) {
		this.handle = rHandle;
	}
	
	public String getHandle() {
		return handle;
	}
	
	/** Overrides parent method.  */
	@Override
	public void type() {
		System.out.print("  <Bike>  ");
	}
	
	public String toString() {
		return "Bike[ " + super.toString() + ", Handle = " + handle + " ]";
	}
	
}
