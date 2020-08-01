package s10p107_p108;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	public static void main(String[] args) {
		
		try {
			someMethod();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found!  ");
		}

		try {
			int var; 
			var = 5 - 6; 
			/* throw is used inside the method.  */
			if (var < 0) {
				throw new NegativeNumberException();
			}
		}
		catch (NegativeNumberException e) {
			System.out.println("var is negative!  ");
		}
		finally {
			System.out.println("Finally block.  ");
		}
		
	}
	
	
	/* throws is used next to the method name.  */
	public static void someMethod() throws FileNotFoundException {
		FileReader in = new FileReader("file.txt");
		/* There is no file so this line will not be executed.  */
		System.out.println("Message from someMethod().  ");
	}
	
}
