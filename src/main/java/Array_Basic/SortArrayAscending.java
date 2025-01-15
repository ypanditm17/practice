package Array_Basic;

import java.util.Arrays;

public class SortArrayAscending {

	public static void main(String[] args) {

		int[] numbers = { 50, 20, 30, 10, 40 };
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}

}
