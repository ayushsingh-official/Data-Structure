package recursion;

public class MaximumOfArray {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 7, 3 };

		System.out.println(maxOfArray(array, 0));
	}

	public static int maxOfArray(int[] array, int idx) {

		int max = array[idx];
		
		// Only for the last function
		if (idx == 4) {

		// First return
			return max;
		}

		int value = maxOfArray(array, idx + 1);
		
		// When returning back to the parent functions
		
		if (value > max) {
			max = value;
		}
		
		// Rest of the return
		return max;
	}
}
