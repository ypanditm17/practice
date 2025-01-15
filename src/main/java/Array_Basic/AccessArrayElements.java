package Array_Basic;

public class AccessArrayElements {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+",");
		}

		int[] arr1 = new int[5];
		arr1[0] = 60;
		arr1[1] = 70;
		arr1[2] = 80;
		arr1[3] = 90;
		arr1[4] = 1000;

	}

}
