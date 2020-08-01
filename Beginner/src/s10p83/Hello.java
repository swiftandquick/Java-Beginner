package s10p83;

public class Hello {

	public static void main(String args[]) {
		MeatLover meatLover = new MeatLover();
		/** MeatLover class shares the speak() method with abstract class.  */
		meatLover.speak();
		/** eat() method is overridden in the MeatLover class.  */
		meatLover.eat();
		Vegan vegan = new Vegan();
		vegan.speak();
		vegan.eat();
	}
	
}
