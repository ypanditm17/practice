package StringProgramme;

import java.util.Arrays;

public class AnagranCheck {

	public static void main(String[] args) {
		String str1 = "grab";
		String str2 = "Brag";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("String are not anagram");
		} else {
			char[] st1 = str1.toCharArray();
			char[] st2 = str2.toCharArray();

			Arrays.sort(st1);
			Arrays.sort(st2);
			if (Arrays.equals(st1, st2)) {
				System.out.println("String are  anagram");
			} else {
				System.out.println("String are not anagram");
			}
		}
	}

}
