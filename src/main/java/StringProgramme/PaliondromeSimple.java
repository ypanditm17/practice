package StringProgramme;

public class PaliondromeSimple {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String is paliondrome");
		} else {
			System.out.println("String is not paliondrome");
		}

	}

}
