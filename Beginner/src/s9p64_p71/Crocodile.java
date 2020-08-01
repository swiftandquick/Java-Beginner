package s9p64_p71;

public class Crocodile extends Reptile {
	
	Crocodile() {
		super();
		setEggType("Hard-Shelled Eggs");
	}

	Crocodile(int rHeight, int rWeight, String rAnimalType, String rBloodType) {
		super(rHeight, rWeight, rAnimalType, rBloodType);
		setEggType("Hard-Shelled Eggs");
	}
	
	public void showInfo() {
		System.out.println("<Crocodile>");
		System.out.println(super.toString() + "\n");
	}
	
}
