package s10p111_p114;

public class Strings {

	public static void main(String[] args) {
		String x = "Study";
		String y = "easy";
		String z = x.concat(y);
		
		z = z.replace("easy", "hard");
		
		System.out.println(z);
		
		if(z.equals("Studyeasy")) {
			System.out.println("Text is Studyeasy");
		}
		else {
			System.out.println("Text is " + z);
		}
		
		String str = "dsaoi@*&#@";
		System.out.println(str.codePointAt(5));
		
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		/* Compare two string literal, it should be true.  */
		System.out.println(str1 == str2 ? true : false);
		
		String str3 = new String("Hello World!");
		System.out.println(str2 == str3 ? true : false);
		System.out.println(str2.equals(str3) ? true : false);
	}
	
}
