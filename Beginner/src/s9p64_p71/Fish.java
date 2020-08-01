package s9p64_p71;

public class Fish extends Animal {
	private String spec1, spec2;
	
	/** Reptile's default features.  */
	Fish() {
		super();
		spec1 = "Live In Water";
		spec2 = "Has Gills";
	}
	
	Fish(int rHeight, int rWeight, String rAnimalType, String rBloodType) {
		super(rHeight, rWeight, rAnimalType, rBloodType);
		spec1 = "Live In Water";
		spec2 = "Has Gills";
	}
	
	public void setSpec1(String rSpec1) {
		this.spec1 = rSpec1;
	}

	public void setSpec2(String rSpec2) {
		this.spec2 = rSpec2;
	}
	
	public String getSpec1() {
		return spec1;
	}

	public String getSpec2() {
		return spec2;
	}
	
	public String toString() {
		return super.toString() + "\nSpecialty #1 = " + spec1
				+ "\nSpecialty #2 = " + spec2;
	}
}
