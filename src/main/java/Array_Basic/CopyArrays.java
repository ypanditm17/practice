package Array_Basic;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5, 6 };
		number[0] = -1; // we can change the value
		int[] values = number;
		for (int value : values) {
			System.out.println(value);
		}

		int[] source = { 1, 2, 3, 4, 5, 6 };
		int[] destination = new int[6];
		// iterate and copy elements from source to destination

		for (int i = 0; i < source.length; i++) {
			destination[i] = source[i];
		}
		//System.out.println(Arrays.toString(destination));
		// System.out.println(Arrays.toString(destination));

	}

}
