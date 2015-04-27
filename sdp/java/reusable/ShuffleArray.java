package sdp.java.reusable;

public class ShuffleArray {

	public static void shuffleArray(Object[] array) {
		int noOfElements = array.length;
		for (int i = 0; i < noOfElements; i++) {
			int s = i + (int) (Math.random() * (noOfElements - i));
			Object temp = array[i];
			array[i] = array[s];
			array[s] = temp;
		}
	}

	public static void main(String[] args) {

		String[] array = { "Sanjoy", "Bruce", "Yardley" };
		shuffleArray(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
