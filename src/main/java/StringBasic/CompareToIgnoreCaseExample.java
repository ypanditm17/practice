package StringBasic;

public class CompareToIgnoreCaseExample {

	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "Banana";
		String str3 = "APPLE";

		int result1 = str1.compareToIgnoreCase(str2);
		System.out.println(result1);

		int result2 = str2.compareToIgnoreCase(str1);
		System.out.println(result2);

		int result3 = str1.compareToIgnoreCase(str3);
		System.out.println(result3);

	}

}
