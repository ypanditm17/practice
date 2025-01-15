package StringBasic;

public class charAt_Method {
	// The charAt() method in Java is used to access a specific character from a
	// string by its index position. The method returns the character at the
	// specified index

	// The index starts at 0 (for the first character).
	// The charAt() method throws a StringIndexOutOfBoundsException if the index is
	// negative or greater than or equal to the length of the string.

	public static void main(String[] args) {
		String str = "Hello Java";

		char str1 = str.charAt(0);
		System.out.println("First character position at 0 :- " + str1);

		char lastchar = str.charAt(str.length() - 1);
		System.out.println(" last character position : " + lastchar);

		String str2 = "Hello, World!";

		// Get characters at specific indices
		char charAtIndex5 = str2.charAt(5); // character at index 5
		char charAtIndex0 = str2.charAt(0); // character at index 0

		// Output the results
		System.out.println("Character at index 5: " + charAtIndex5); // ','
		System.out.println("Character at index 0: " + charAtIndex0); // 'H'

		// Trying to get a character at an invalid index
		try {
			char invalidChar = str2.charAt(20);
			System.out.println("I am inside the try block " + invalidChar);// This will throw an exception
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception: Index out of bounds.");
		}

	}

}
