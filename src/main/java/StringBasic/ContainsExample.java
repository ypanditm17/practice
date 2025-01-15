package StringBasic;

public class ContainsExample {

	public static void main(String[] args) {
		String str1 = "Hello, welcome to Java programming!";

		// Using contains() method to check for substring
		System.out.println("Contains 'Welcome': " + str1.contains("welcome")); // true
		System.out.println("Contains 'Java': " + str1.contains("Java")); // true
		System.out.println("Contains 'world': " + str1.contains("world")); // false
	}

}
