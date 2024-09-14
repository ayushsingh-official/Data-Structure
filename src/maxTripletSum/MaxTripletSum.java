package maxTripletSum;

import java.util.Scanner;

class MaxTripletSum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			long arr[] = new long[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextLong();

			long result = maxSumTriplet(n, arr);

			System.out.println(result);

		}

	}

	
	static long maxSumTriplet(int n, long arr[]) {

		long maxSum = 0;

		for (int j = 1; j < n - 1; j++) {

			long mid = arr[j];
			long left = Long.MIN_VALUE; // 0
			long right = Long.MIN_VALUE; // 0
			// left
			for (int i = 0; i < j; i++) {

				if (arr[i] < mid) {
					left = Math.max(left, arr[i]);
				}

			}
			// right
			for (int k = j + 1; k < n; k++) {

				if (arr[k] > mid) {
					right = Math.max(arr[k], right);
				}

			}
			// left and right should not be the default(i.e 0) value
			// which means no
			// change in left and right value
			if (left < mid && mid < right && left > 0 && right > 0) {
				long sum = left + mid + right;
				maxSum = Math.max(sum, maxSum);
			}
			// else continue;

		}

		return maxSum;
	}
}