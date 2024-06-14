package recursion;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));
	}

	public static int factorial(int n) {

		if (n == 1) {

			return 1;
		}
		
		int num = factorial(n - 1);
		int fact = num * n;

		return fact;

	}

}
