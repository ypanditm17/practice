package Array_Basic;

public class FindMaxMin {

	public static void main(String[] args) {
		int[] numbers = { 50, 60, 80, 90, 40 };

		int min = numbers[0];
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
