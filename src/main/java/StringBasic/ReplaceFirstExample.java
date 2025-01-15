package StringBasic;

public class ReplaceFirstExample {

	public static void main(String[] args) {
		
		String str = "Hello, world! Welcome to the world!";
		// Replace the first occurrence of "world" with "Java"
		String result = str.replaceFirst("world", "Java");
		// Output the result
		System.out.println(result);
		

		String str2 = "abc123abc123abc";
		// Replace the first occurrence of any digits (using regex) with "XYZ"
		String result2 = str2.replaceFirst("\\d+", "XYZ");
		// Output the result
		System.out.println(result2);

	}

}
