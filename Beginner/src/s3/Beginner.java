package s3;

import java.math.BigDecimal;

public class Beginner {

	public static void main(String[] args) {
		
		// 2.9
		System.out.println("Hello World!");
		
		// 2.11
		int value1 = 1, value2;
		value2 = (2 * 2) - value1;		
		System.out.println(value2);
		value2 = 2;
		int value3 = value1 * value2 * value2;
		System.out.println(value3);
		
		// 2.15
		double c1 = 1.999995, c2 = 2.000005;
		System.out.println(c1 + c2);
		BigDecimal d1 = new BigDecimal("1.999995");
		BigDecimal d2 = new BigDecimal("2.000005");
		System.out.println(d1.add(d2));
	
		// 2.18
		int a = 25;
		float b = 42.159f;
		int value;
		value = (int) (a * a + 2 * a * b + b * b);
		System.out.println(value);
	}
	
}
