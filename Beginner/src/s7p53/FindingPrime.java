package s7p53;

public class FindingPrime {

	public static boolean checkPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		int a = 25, b = 26, c = 27, d = 28, e = 29;

		System.out.println(checkPrime(a));
		System.out.println(checkPrime(b));
		System.out.println(checkPrime(c));
		System.out.println(checkPrime(d));
		System.out.println(checkPrime(e));
		
	}
	
}
