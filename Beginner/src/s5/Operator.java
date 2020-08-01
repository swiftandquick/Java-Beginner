package s5;

public class Operator {

	public static void main(String args[]) {
		double ba = 2.5 * 1;
		int ab = (int) (2.5 * 1);
		
		double g = 52.63 % 5;
		System.out.println(g);
		
	    int a=3;
	    
	    a=a++; // will print 3
	    System.out.println("Post-Increment a: " +a);
	 
	    a=++a; // will print 4.  
	    System.out.println("Pre-Increment a: "+a );
	 
	    a=a--;
	    System.out.println("Post-Decrement a: " +a);
	 
	    a=--a;
	    System.out.println("Pre-Decrement a: "+a );
		
	    /** Ternary Operator */
	    String funny = (3 > 5 ? "haha" : "hehe");
	    System.out.println(funny);
	    
	}
	
}
