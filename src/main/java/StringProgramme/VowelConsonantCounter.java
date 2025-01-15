package StringProgramme;

public class VowelConsonantCounter {

	public static void main(String[] args) {
		String str = "Hello javaa";
		str = str.toLowerCase();

		int vovelCount = 0;
		int consonantcount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovelCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonantcount++;
			}
		}
		System.out.println("vovelcout is : -" + vovelCount);
		System.out.println("consonant is : -" + consonantcount);
	}

}
