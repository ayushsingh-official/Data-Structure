package recursion;

public class IncreasingNumber {

	public static void main(String[] args) {

		increasingNumber(0);
	}

	public static void increasingNumber(int n) {

		if (n == 10) {
			
			return;
		}

		increasingNumber(n + 1);
		System.out.println(n);

	}

}
