package s10p93_p94;

public class outer {
	private int testVar = 5;

	public static class inner {
		public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
			System.out.println("Test variable value:  " + new outer().testVar);
		}
	}
	
}
