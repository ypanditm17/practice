package StringBasic;

public class LengthExample {

	public static void main(String[] args) {
		String str1 = "Hello, World!";
		String str2 = "Java Programming";
		String str3 = "   ";
		String str4 = "";

		int result1 = str1.length();
		System.out.println(result1); // 13

		int result2 = str2.length();
		System.out.println(result2);// 16

		int result3 = str3.length();
		System.out.println(result3);// 3

		int result4 = str4.length();
		System.out.println(result4); // 0

		String str5 = "I am \"Yogesh\"Pandit";
		System.out.println(str5);

	}

}
