package recursion;

public class FirstOccurance {

	public static void main(String[] args) {

		int[] array = { 2, 5, 2, 7, 3, 8, 7, 4, 2, 6, 3, 6, 5, 9, 2 };

		firstOccurance(array, 0, 3);
	}

	private static void firstOccurance(int[] array, int idx, int value) {

		// while going inside the child functions
		if (array[idx] == value) {

			System.out.println(idx);

			// first Return
			return;

		}

		firstOccurance(array, idx + 1, value);

		// Rest of the Returns
		return;

	}

}
