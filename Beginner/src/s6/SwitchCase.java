package s6;

public class SwitchCase {

	public static void main(String args[]) {
		
		int num = 5;
		
		if (num == 5) {
			System.out.println("Five");
		}
		else {
			System.out.println("Hello world!");
		}
		
		switch(num) {
			case 5:
				System.out.println("Five");
				// Because I didn't break, default will also execute.  
			default:
				System.out.println("Hello world!");
		}
		
	}
	
}
