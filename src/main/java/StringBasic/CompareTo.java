package StringBasic;

public class CompareTo {

	public static void main(String[] args) {
//		The compareTo() method in Java is used to compare two strings lexicographically. 
//		It compares the strings based on the Unicode value of each character in the strings.

		String str1 = "apple";
		String str2 = "banana";
		String str3 = "apple";

		// return type is int

		int result1 = str1.compareTo(str2);
		System.out.println(result1);

		int result2 = str1.compareTo(str2);
		System.out.println(result2);

		int result3 = str1.compareTo(str1);
		System.out.println(result3);

		int result4 = str1.compareTo(str3);
		System.out.println(result4);

		System.out.println(str1.compareTo("apple"));// ****

	}

}
