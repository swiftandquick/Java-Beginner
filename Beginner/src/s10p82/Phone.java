package s10p82;

/** Interface have abstract methods. Classes that implement interfaces gain
 * access to the empty methods. In both Iphone8.java and OnePlus5.java, the
 * abstract methods of the same name are implemented differently as they return
 * different values.  */
public interface Phone {

	public String processor();
	public String OS();
	public int spaceInGB();
	
}
