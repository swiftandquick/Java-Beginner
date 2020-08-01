package s10p110;

public class Demo {
	
	public static void main(String[] args) {
		
		/* Retrieves variable from Learning enum class.  */
		Learning learn = Learning.COLLECTIONS;
		
		switch(learn) {
			case COLLECTIONS:
				System.out.println("Step 2");
				break;
			case COREJAVA:
				System.out.println("Step 1");
				break;
			case GENERICS:
				System.out.println("Step 3");
				break;
			case JSPANDSERVLETS:
				System.out.println("Step 4");
				break;
			case MULTITHREADING:
				System.out.println("Step 5");
				break;
			default:
				System.out.println("Default");
				break;
		}
		
	}
	
}
