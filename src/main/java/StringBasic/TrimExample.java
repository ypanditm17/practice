package StringBasic;

public class TrimExample {

	public static void main(String[] args) {
		String str1 = "   Hello, Java!   ";

		// Using trim() method to remove leading and trailing spaces
		String trimmedStr = str1.trim();

		System.out.println("Original String: '" + str1 + "'");
		System.out.println("Trimmed String: '" + trimmedStr + "'");

	}

}
