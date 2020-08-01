package s9p64_p71;

public class Reptile extends Animal {

	private String spec1, spec2, eggType;
	
	/** Reptile's default features.  */
	Reptile() {
		super();
		spec1 = "Dry Skin";
		spec2 = "Backbone";
		eggType = "Soft-Shelled Eggs";
	}
	
	Reptile(int rHeight, int rWeight, String rAnimalType, String rBloodType) {
		super(rHeight, rWeight, rAnimalType, rBloodType);
		spec1 = "Dry Skin";
		spec2 = "Backbone";
		eggType = "Soft-Shelled Eggs";
	}
	
	public void setSpec1(String rSpec1) {
		this.spec1 = rSpec1;
	}

	public void setSpec2(String rSpec2) {
		this.spec2 = rSpec2;
	}
	
	public void setEggType(String rEggType) {
		this.eggType = rEggType;
	}
	
	public String getSpec1() {
		return spec1;
	}

	public String getSpec2() {
		return spec2;
	}

	public String getEggType() {
		return eggType;
	}
	
	public String toString() {
		return super.toString() + "\nSpecialty #1 = " + spec1
				+ "\nSpecialty #2 = " + spec2
				+ "\nEgg Type = " + eggType; 
	}
	
}
