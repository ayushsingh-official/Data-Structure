package BinarySearch;

import java.util.Scanner;

class SearchInRotatedSortedArray {

	// Complete the function implementation below
	public int search(int[] nums, int target) {

		System.out.println("started ....");

		int left = 0;
		int right = nums.length - 1;

		int pivot = -1;
		int index = -1;

		// pivot find
		while (left <= right) {

			int mid = (left + (right - left) / 2);
			System.out.println("mid : " + mid);

			if (nums[mid] > nums[0]) {
				pivot = mid; // As we have to find the max which fall in this bracket
				left = mid + 1;
			} else if (nums[mid] < nums[0]) {
				right = mid - 1;
			} else { // if equals , then we have to check another index (if max came)
				pivot = mid; // As we have to find the max which fall in this bracket
				left = mid + 1;
			}
		}

		System.out.println("pivot : " + pivot);

		// right side of max(pivot) or left
		if (nums[0] <= target) {
			index = searchTargetIndex(0, pivot, nums, target);
		} else {
			index = searchTargetIndex(pivot + 1, nums.length - 1, nums, target);

		}
		return index;

	}

//	Binary search of Target value
	private int searchTargetIndex(int left, int right, int[] nums, int target) {

		while (left <= right) {

			int mid = (left + right) / 2;

			if (target == nums[mid]) {
				return mid;
			}

			if (target > nums[mid]) {
				left = mid + 1;
			} else if (target < nums[mid]) {
				right = mid - 1;

			}

		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		int q = scanner.nextInt();
		while (q > 0) {
			int target = scanner.nextInt();
			int result = new SearchInRotatedSortedArray().search(nums, target);
			System.out.println(result);
			q--;
		}
	}
}
