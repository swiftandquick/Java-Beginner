package s10p92;

public class App {

	public static void main(String[] args) {
		TestStatic obj1 = new TestStatic();
		/** Initial staticVariable is 0, so getter should return 0.  */
		System.out.println(obj1.getStaticVariable());
		/** Sets staticVariable to 1.  */
		obj1.setStaticVariable(1);
		/** Now it should print out 1.  */
		System.out.println(obj1.getStaticVariable());
		
		/** A new object will have the staticVariable intialize as 0 again.  */
		TestStatic obj2 = new TestStatic();
		System.out.println(obj2.getStaticVariable());
		obj2.setStaticVariable(24);
		System.out.println(obj2.getStaticVariable());
		
		TestStatic obj3 = new TestStatic();
		System.out.println(obj3.getStaticVariable());
		
	}
	
}
