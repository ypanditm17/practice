package StringBasic;

public class EqualsIgnoreCaseExample {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "HELLO";
		String str4 = "World";

		boolean result1 = str1.equalsIgnoreCase(str2);
		System.out.println(result1);

		boolean result2 = str1.equalsIgnoreCase(str3);
		System.out.println(result2);

		boolean result3 = str1.equalsIgnoreCase(str4);
		System.out.println(result3);

	}

}
