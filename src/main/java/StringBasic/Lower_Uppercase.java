package StringBasic;

import java.util.Locale;

public class Lower_Uppercase {

	public static void main(String[] args) {
		// Original String
		String str = "Hello, Java!";

		// Convert to Lowercase
		String lowerStr = str.toLowerCase();

		// Convert to Uppercase
		String upperStr = str.toUpperCase();

		// Output the results
		System.out.println("Original String: " + str);
		System.out.println("Lowercase String: " + lowerStr);
		System.out.println("Uppercase String: " + upperStr);

		// Example with Turkish locale
		String strLocale = "Istanbul";
		String upperStrLocale = strLocale.toUpperCase(new Locale("tr", "TR"));
		System.out.println("Uppercase String (Turkish Locale): " + upperStrLocale);

	}

}
