package StringBasic;

public class ReplaceExample {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = "Java is fun, and Java is powerful.";

		String result1 = str1.replace('e', 'a');
		String result2 = str2.replace("Java", "Python");
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
