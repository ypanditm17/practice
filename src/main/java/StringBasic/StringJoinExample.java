package StringBasic;
import java.util.Arrays;
import java.util.List;

public class StringJoinExample {

	public static void main(String[] args) {
		// Example 1: Joining an Array of Strings with a Space Separator
		String[] words = { "Java", "is", "fun" };
		String result1 = String.join(" ", words);
		System.out.println("Example 1: " + result1); // Output: Java is fun

		// Example 2: Joining with a Different Delimiter (Comma)
		String[] fruits = { "Apple", "Banana", "Cherry" };
		String result2 = String.join(", ", fruits);
		System.out.println("Example 2: " + result2); // Output: Apple, Banana, Cherry

		// Example 3: Using a List of Strings
		List<String> cities = Arrays.asList("New York", "London", "Tokyo");
		String result3 = String.join(" - ", cities);
		System.out.println("Example 3: " + result3); // Output: New York - London - Tokyo

		// Example 4: Using an Empty String as a Delimiter
		String[] characters = { "a", "b", "c" };
		String result4 = String.join("", characters);
		System.out.println("Example 4: " + result4); // Output: abc

		// Example 5: Using String.join with a Single Element
		String[] singleElement = { "Hello" };
		String result5 = String.join(", ", singleElement);
		System.out.println("Example 5: " + result5); // Output: Hello
	}
}
