package s10p93_p94;

public class App {

	public static void main(String[] args) {
		/** To access an inner class' method from a static method, the inner class 
		 * also needs to be static itself.  */
		outer.inner.testingInnerMethod();
	}

}
