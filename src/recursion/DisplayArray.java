package recursion;

public class DisplayArray {

	public static void main(String[] args) {

		int[] array = { 2, 5, 2, 7, 3 };

		displayArray(array, 5);
	}

	private static void displayArray(int[] array, int length) {

		if (length == 0) {
			return;
		}
		System.out.println(array[length - 1]);
		displayArray(array, length - 1);

	}

}
