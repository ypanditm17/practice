package StringProgramme;

public class FirstCharacterPrint {

	public static void main(String[] args) {
		String str1 = "Java is a versatile language and widely used";
		String[] word = str1.split(" ");
		for (String words : word) {
			char character = words.charAt(0);
			System.out.println(character);
		}

	}

}
