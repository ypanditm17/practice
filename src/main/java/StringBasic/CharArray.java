package StringBasic;

public class CharArray {

	public static void main(String[] args) {
		String str = "Hello , Java";

		char[] word = str.toCharArray();
		for (char words : word) {
			//System.out.print(words + " ");
			System.out.println(words);
		}

		
		// Convert char array back to string
		String str1 = new String(word);
		System.out.println(str1);
		System.out.println("15/01/2025+1");

	}

}
