package recursion;

public class Power {

	public static void main(String[] args) {

		System.out.println(power(5, 3));
	}

	public static int power(int n, int x) {

		if (x == 0) {

			return 1;
		}

		int num = power(n, x - 1);
		int power = num * n;

		return power;

	}

}
