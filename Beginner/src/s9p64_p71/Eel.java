package s9p64_p71;

public class Eel extends Fish {

	private String spec3;
	
	Eel() {
		super();
		spec3 = "Release Electric Charge";
	}
	
	Eel(int rHeight, int rWeight, String rAnimalType, String rBloodType) {
		super(rHeight, rWeight, rAnimalType, rBloodType);
		spec3 = "Release Electric Charge";
	}
	
	public void setSpec3(String rSpec3) {
		this.spec3 = rSpec3;
	}
	
	public String getSpec3() {
		return spec3;
	}
	
	public void showInfo() {
		System.out.println("<Eel>");
		System.out.println(super.toString());
		System.out.println("Specialty #3 = " + spec3 + "\n");
	}
	
}
