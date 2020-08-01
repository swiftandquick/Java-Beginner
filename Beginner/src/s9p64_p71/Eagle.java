package s9p64_p71;

public class Eagle extends Birds {

	Eagle() {
		super();
	}

	Eagle(int rHeight, int rWeight, String rAnimalType, String rBloodType) {
		super(rHeight, rWeight, rAnimalType, rBloodType);
	}
	
	public void showInfo() {
		System.out.println("<Eagle>");
		System.out.println(super.toString() + "\n");
	}
	
}
