package Array_Basic;

import java.util.HashSet;

public class Find_duplicates {

	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6 };

		// Create a HashSet to track elements we've seen
		HashSet<Integer> seen = new HashSet<>();

		// Iterate through the array and check for duplicates
		System.out.print("Duplicate elements: ");
		for (int num : arr) {
			if (seen.contains(num)) {
				System.out.print(num + " ");
			} else {
				seen.add(num);

			}

		}

	}
}
