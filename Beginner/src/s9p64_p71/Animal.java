package s9p64_p71;

public class Animal {

	private int height, weight;
	private String animalType, bloodType;
	
	Animal() {
		height = 0;
		weight = 0;
		animalType = "?";
		bloodType = "?";
	}
	
	Animal(int rHeight, int rWeight, String rAnimalType, String rBloodType) {
		setHeight(rHeight);
		setWeight(rWeight);
		setAnimalType(rAnimalType);
		setBloodType(rBloodType);		
	}

	public void setHeight(int rHeight) {
		this.height = rHeight;
	}

	public void setWeight(int rWeight) {
		this.weight = rWeight; 
	}

	public void setAnimalType(String rAnimalType) {
		this.animalType = rAnimalType;
	}

	public void setBloodType(String rBloodType) {
		this.bloodType = rBloodType; 
	}
	
	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
	
	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}
	
	public String toString() {
		return "Height = " + height + "\nWeight = " + weight + 
				"\nAnimal Type = " + animalType + "\nBlood Type = " + bloodType; 
	}
	
}
