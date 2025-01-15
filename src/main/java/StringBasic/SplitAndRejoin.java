package StringBasic;

public class SplitAndRejoin {

	public static void main(String[] args) {
		// Original sentence
		String sentence = "Hello World, how are you?";

		// Step 1: Split the sentence by space
		String[] words = sentence.split(" ");

		// Step 2: Print the words after splitting
		System.out.println("After splitting:");
		for (String word : words) {
			System.out.println(word);
		}

		// Step 3: Rejoin the words back into a single sentence
		String joinedSentence = String.join(" ", words);

		// Step 4: Print the rejoined sentence
		System.out.println("\nAfter rejoining:");
		System.out.println(joinedSentence);
	}

}
