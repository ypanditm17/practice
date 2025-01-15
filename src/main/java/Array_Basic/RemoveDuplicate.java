package Array_Basic;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 3, 6, 7, 1 };

		// Create a HashSet to store unique elements
		HashSet<Integer> set = new HashSet<>();

		// Add each element from the array to the HashSet
		for (int arr1 : arr) {
			set.add(arr1);
		}

		// Convert the HashSet to an array using the toArray() method
		Integer[] result = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(result));

	}

}
