package BinarySearch;

import java.util.Scanner;

class CountOccurrences {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int res = countOccurrences(n, k, a);

		System.out.println(res);
	}

	static int countOccurrences(int n, int k, int a[]) {

		int firstOccurance = searchFirstOccurance(n, k, a);
		int lastOccurance = searchLastOccurance(n, k, a);

		System.out.println("firstOccurance : " + firstOccurance);
		System.out.println("lastOccurance : " + lastOccurance);

		int frequency = lastOccurance - firstOccurance + 1;

		return frequency;

	}

	private static int searchLastOccurance(int n, int k, int[] a) {

		int left = 0;
		int right = n - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (a[mid] == k) {
				left = mid + 1;
			} else if (a[mid] > k) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return right; // As left will be 1 index ahead bcze of greed y approach to find more k

	}

	private static int searchFirstOccurance(int n, int k, int a[]) {

		int left = 0;
		int right = n - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (a[mid] == k) {
				right = mid - 1;
			} else if (a[mid] < k) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return left;
	}

}
