package StringBasic;

public class subString {

	public static void main(String[] args) {

		//1. substring(int beginIndex)
		//This version of substring returns a new string starting from the specified beginIndex to the end of the original string.
		String s1 = "Hello , Java";
		String s2 = s1.substring(8);
		System.out.println(s2);

		//2. substring(int beginIndex, int endIndex)
		//This version of substring returns a new string starting from the specified beginIndex and ending at endIndex - 1 (the character at endIndex is not included)
		String s3 = "Hello , Java";
		String s4 = s3.substring(8, 12);
		System.out.println(s4);

	}

}
