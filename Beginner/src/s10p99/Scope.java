package s10p99;

public class Scope {

	/* j needs to be static to use static variable.  */
	static int j = 1;
	
	public static void main(String args[]) {
		/* Local variable.  */
		int i = 10;
		System.out.println(i + "\n");
		System.out.println(j + "\n");
		
		int count;
		/* count++ happens after the loop is iterated, so when count is 9, loop iterates, 
		 * then count increments to 10, but loop doesn't iterate anymore as 10 < 10 is false.  
		 * However, when I print count outside of the loop, it prints the current value:  10.  */
		for(count = 1; count < 10; count++) {
			System.out.println(count);
		}
		System.out.println(count);
	}
	
}
