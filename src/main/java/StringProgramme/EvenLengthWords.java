package StringProgramme;

public class EvenLengthWords {

	public static void main(String[] args) {
		String str1 = "Java is a versatile language and widely used";

		String[] word = str1.split(" ");
		for (String words : word) {
			if (words.length() % 2 == 0) {
				System.out.println(words);
			}
		}

	}

}
