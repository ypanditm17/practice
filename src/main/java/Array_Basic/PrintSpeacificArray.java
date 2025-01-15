package Array_Basic;

public class PrintSpeacificArray {

	public static void main(String[] args) {
		
		/*
		 * Initialization 
		 * Accessing and Modifying Elements 
		 * Traversing and Iterating
		 * Searching for an Element 
		 * Sorting 
		 * Reversing 
		 * Copying Arrays
		 *  Finding Maximum/Minimum 
		 *  Summing Elements 
		 *  Cloning 
		 *  Resizing (Workaround) 
		 *  Checking if Element Exists 
		 *  Array to String Conversion 
		 *  Stream Operations (Java 8+)
		 * Multidimensional Arrays
		 */
		
		int[] arr = { 50, 70, 10, 80, 20, 30 };

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == 1 || i == 5) {
				System.out.println(arr[i]);
			}
		}

	}

}
