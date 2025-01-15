package StringProgramme;

public class FirstLowerSecondUpper {

	public static void main(String[] args) {
		String str1 = "example";
		StringBuilder result = new StringBuilder();

		// Loop through each character of the string
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i); // Get the character at the current index

			// Check if the index is even or odd
			if (i % 2 == 0) {
				result.append(Character.toLowerCase(ch)); // Even index -> lowercase
			} else {
				result.append(Character.toUpperCase(ch)); // Odd index -> uppercase
			}
		}

		// Print the final result after loop ends
		System.out.println(result.toString());
	}
}