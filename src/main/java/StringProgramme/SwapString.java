package StringProgramme;

public class SwapString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		System.out.println("String before the swap");
		System.out.println(s1);
		System.out.println(s2);

		String temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("String After the swap");
		System.out.println(s1);
		System.out.println(s2);

	}

}
