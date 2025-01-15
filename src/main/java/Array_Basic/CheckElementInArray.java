package Array_Basic;

public class CheckElementInArray {

	public static void main(String[] args) {
		int[] arr = { 30, 40, 50, 60, 80, 90 };
		int target = 80;
		boolean find = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				find = true;
				break;
			}
		}
		if (find) {
			System.out.println(target + " " + "" + "is found");
		} else {
			System.out.println(target + " " + "" + "is not found");
		}

	}

}
