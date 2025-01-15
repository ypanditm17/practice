package StringBasic;

public class StartWithEndWith {

	public static void main(String[] args) {
		// Define a string
		String str = "Java Programming";

		// Check if the string starts with "Java"
		boolean startsWithJava = str.startsWith("Java");
		System.out.println("Starts with 'Java': " + startsWithJava); // true

		// Check if the string starts with "Programming"
		boolean startsWithProgramming = str.startsWith("Programming");
		System.out.println("Starts with 'Programming': " + startsWithProgramming); // false

		// Check if the string ends with "Programming"
		boolean endsWithProgramming = str.endsWith("Programming");
		System.out.println("Ends with 'Programming': " + endsWithProgramming); // true

		// Check if the string ends with "Java"
		boolean endsWithJava = str.endsWith("Java");
		System.out.println("Ends with 'Java': " + endsWithJava); // false

	}

}
