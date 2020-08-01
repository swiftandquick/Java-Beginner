package s10p95_p96;

public class B extends A {

	/** x can only be initialized once in the constructor.  */
	private final int x;
	
	/** We have to specify "this" x as the instance variables x, 
	 * because the x that is passed in from the parameter is different.  */
	B(int x) {
		super();
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	@Override
	public void india() {
		System.out.println("Hello India, what's up?  ");
	}
	
}
