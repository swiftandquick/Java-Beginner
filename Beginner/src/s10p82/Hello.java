package s10p82;

public class Hello {

	public static void main(String args[]) {
		OnePlus5 phone = new OnePlus5();
		String processor1 = phone.processor();
		String os1 = phone.OS();
		int space1 = phone.spaceInGB();
		System.out.println("One Plus 5");
		System.out.println("Processor:  " + processor1);
		System.out.println("OS:  " + os1);
		System.out.println("Space in GB:  " + space1);
		
		Iphone8 phone2 = new Iphone8();
		String processor2 = phone2.processor();
		String os2 = phone2.OS();
		int space2 = phone2.spaceInGB();
		System.out.println("\niPhone 8");
		System.out.println("Processor:  " + processor2);
		System.out.println("OS:  " + os2);
		System.out.println("Space in GB:  " + space2);
	}
	
}
