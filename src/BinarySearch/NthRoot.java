package BinarySearch;

import java.util.Scanner;

class NthRoot {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int x = sc.nextInt();
			int n = sc.nextInt();

			int ans = nthRoot(x, n);

//			System.out.println(n + " root of " + x + " is " + ans);
			System.out.println(ans);

		}
	}

	static int nthRoot(int x, int n) { // x -> number, n -> root

		int left = 0;
		int right = x;

		int value = n;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (Math.pow(mid, n) == x) {
				return value = mid;
			}

			if (Math.pow(mid, n) > x) {
				right = mid - 1;
			} else if (Math.pow(mid, n) < x) { // Last iteration of mid value for left will be closest smaller to n
				left = mid + 1;
				value = mid;
			}

//			System.out.println("left : " + left + " right : " + right + " mid : " + mid);

		}

		return value;

	}

}