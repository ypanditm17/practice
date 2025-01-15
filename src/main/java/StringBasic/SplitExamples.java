package StringBasic;

public class SplitExamples {

	public static void main(String[] args) {

		// Example 1: Split by space
		String str1 = "Java is a powerful programming language";
		String[] words = str1.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println();

		// Example 2: Split by comma
		String str2 = "apple,orange,banana,grape";
		String[] data = str2.split(",");
		for (String datas : data) {
			System.out.println(datas);
		}
		System.out.println();

		// Example 3: Split by regular expression (digits)
		String str3 = "apple123orange456banana789grape";
		String[] digit = str3.split("\\d+");
		for (String digits : digit) {
			System.out.println(digits);
		}
		System.out.println();

		// Example 4: Split with limit
		String str4 = "Java is a versatile language and widely used";
		String[] limit = str4.split(" ", 2);
		for (String limits : limit) {
			System.out.println(limits);
		}
	}

}
