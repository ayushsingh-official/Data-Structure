package BinarySearch;

import java.util.Scanner;

class PeakElement {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(peakElement(arr));
	}

	static int peakElement(int arr[]) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			int leftMid;
			int rightmid;

			if (mid == 0) {
				leftMid = Integer.MIN_VALUE;
			} else
				leftMid = arr[mid - 1];

			if (mid == arr.length - 1) {
				rightmid = Integer.MIN_VALUE;
			} else
				rightmid = arr[mid + 1];

			
			
			if (rightmid < arr[mid] && leftMid < arr[mid]) {
				return mid;
			} else if (rightmid > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return 0;
	}
}
