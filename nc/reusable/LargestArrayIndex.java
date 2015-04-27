package nc.reusable;

public class LargestArrayIndex {

	public static int largestArrayIndex(int[] array) {
		// change array type per requirements. Has to be some number
		int largest = array[0];
		int largestIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
				largestIndex = i;
			}
		}
		return largestIndex;
	}

	public static void main(String[] args) {
		int[] array = { 10, 50, 75, 95, 105, 123, 97, 23, 59, 29, 36 };
		System.out.println(largestArrayIndex(array)); // Starts from zero
	}

}
