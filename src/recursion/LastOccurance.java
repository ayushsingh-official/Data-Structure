package recursion;

public class LastOccurance {

	public static void main(String[] args) {

		int[] array = { 2, 5, 2, 7, 3, 8, 7, 4, 2, 6, 3, 6, 5, 9, 2 };

		lastOccurance(array, 0, 3);

		System.out.println(lastOccuranceReturn(array, 0, 3));
	}

	// Without Return Type
	private static void lastOccurance(int[] array, int idx, int value) {

		if (idx == array.length) {

			// First Return
			return;

		}
		lastOccurance(array, idx + 1, value);

		if (array[idx] == value) {

			System.out.println(idx);

		}

		// Rest of the Returns
		return;

	}

	// With Return Type
	private static int lastOccuranceReturn(int[] array, int idx, int value) {

		if (idx == array.length) {

			// First Return
			return -1;

		}

		int num = lastOccuranceReturn(array, idx + 1, value);

		if (num == -1) {
			if (array[idx] == value) {

				return idx;
			} else {
				return -1;
			}
		}

		return num;

	}

}
