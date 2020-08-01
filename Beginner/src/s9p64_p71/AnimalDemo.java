package s9p64_p71;

public class AnimalDemo {

	public static void main(String args[]) {
		Animal animal = new Crocodile(140, 400, "Crocodile", "AB");
		Crocodile crocodile = (Crocodile) animal; // Down casting.  
		crocodile.showInfo();
		
		Eel eel = new Eel(50, 2, "Eel", "O");
		eel.showInfo();
		
		Eagle eagle = new Eagle(60, 4, "Eagle", "A");
		eagle.showInfo();
		
	}
	
}
