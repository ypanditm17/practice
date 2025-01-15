package Array_Basic;

public class SearchElementAtIndex {

	public static void main(String[] args) {

		int[] arr = { 50, 70, 10, 80, 20, 30 };

		int target = 80;

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				System.out.println("Element " + target + " found at index: " + i);
				found = true;
				break;
			}
		}
	}

}
