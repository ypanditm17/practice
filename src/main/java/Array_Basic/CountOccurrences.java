package Array_Basic;

public class CountOccurrences {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 2, 5, 6, 2, 7 };

		int target = 2;
		int count = 0;

		for (int arr1 : arr) {
			if (arr1 == target) {
				count++;
			}
		}
		System.out.println("The no " + target + " appeared " + count + " times ");
	}

}
