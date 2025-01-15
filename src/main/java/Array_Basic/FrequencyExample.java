package Array_Basic;

import java.util.HashMap;

public class FrequencyExample {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6 };

		// Create a HashMap to store the frequency of each element
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		// Iterate through the array and calculate frequency
		for (int num : arr) {
			// If the number is already in the map, increment its count
			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			} else {
				// If the number is not in the map, add it with frequency 1
				frequencyMap.put(num, 1);
			}
		}

		// Print the frequency of each element
		System.out.println("Element frequencies:");
		for (int num : frequencyMap.keySet()) {
			System.out.println(num + ": " + frequencyMap.get(num));
		}
	}
}