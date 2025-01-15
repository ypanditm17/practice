package StringBasic;

public class ConcatExample {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = " is";
		String str3 = " amazing!";

		str1 = str1 + str2 + str3;
		System.out.println(str1);

		// Concatenating multiple strings
		System.out.println(str1);

		str1 = str1.concat(str3);
		System.out.println(str1);

		// Concatenating multiple strings
		String result = str1.concat(str2).concat(str3);
		System.out.println("Concatenated String: " + result);

		// Using StringBuilder to concatenate strings efficiently
		StringBuilder sb = new StringBuilder(str1);
		sb.append(str2).append(str3);
		System.out.println("Concatenated String using StringBuilder: " + sb.toString());

		StringBuilder sb1 = new StringBuilder("Python");
		sb1.append(str2).append(str3);
		System.out.println("Concatenated String using StringBuilder: " + sb1.toString());

		str1 = str1 + str2 + str3;
		System.out.println(str1);

	}

}
