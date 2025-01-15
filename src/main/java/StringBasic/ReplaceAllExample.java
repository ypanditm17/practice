package StringBasic;

public class ReplaceAllExample {

	public static void main(String[] args) {
		// Example 1: Replace all digits with '*'
		String str1 = "My phone number is 123-456-7890.";
		String result1 = str1.replaceAll("\\d", "*"); // "\\d" matches any digit
		System.out.println("After replacing digits with '*': " + result1);

		// Example 2: Remove all spaces
		String str2 = "Java programming is fun!";
		String result2 = str2.replaceAll("\\s", ""); // "\\s" matches any whitespace character
		System.out.println("After removing spaces: " + result2);

		// Example 3: Replace multiple words
		String str3 = "I love Java and JavaScript.";
		String result3 = str3.replaceAll("Java(Script)?", "Python"); // "Java(Script)?" matches "Java" or "JavaScript"
		System.out.println("After replacing 'Java' and 'JavaScript' with 'Python': " + result3);

		// Example 4: Replace only words with case-insensitivity
		String str4 = "Hello hello HELLO!";
		String result4 = str4.replaceAll("(?i)hello", "hi"); // "(?i)" makes the regex case-insensitive
		System.out.println("After case-insensitive replacement: " + result4);
	}

}
