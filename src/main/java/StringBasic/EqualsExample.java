package StringBasic;

public class EqualsExample {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("Hello");

		boolean result1 = str1.equals(str2);
		System.out.println(result1);

		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));

		System.out.println((str1 == str4));
		System.out.println("str1 == str2: " + (str1 == str2)); // true (string pool)
		System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)

	}

}
