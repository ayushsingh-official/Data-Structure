package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ThreeSum1 {

	public List<List<Integer>> threeSum(Integer[] arr) {

		int targetSum = 0;
		Arrays.sort(arr);
		System.out.println("List : ");

		List<List<Integer>> allTriplets = new ArrayList<>();

		for (int i = 0; i < arr.length - 2; i++) {
			int sum = targetSum - arr[i];

			int start = i + 1;
			int end = arr.length - 1;

			while (start < end) {
				int t = arr[start] + arr[end];
				if (t == sum) {
					List<Integer> list = new ArrayList<>();
					list.add(arr[start]);
					list.add(arr[end]);
					list.add(arr[i]);
					// duplicacy check
					if (!checkDuplicate(allTriplets, list)) {
						allTriplets.add(list);
					}
					start++;
					end--;
				} else if (t < sum) {
					start++;
				} else {
					end--;
				}
			}
		}

		return allTriplets;
	}

	private boolean checkDuplicate(List<List<Integer>> allTriplets, List<Integer> list) {
		for (List<Integer> list1 : allTriplets) {
			if (list1.equals(list)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		Integer nums[] = new Integer[n];
		for (Integer i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();

		List<List<Integer>> result = new ThreeSum().threeSum(nums);
		for (Integer i = 0; i < result.size(); ++i) {
			System.out.printf("%d %d %d\n", result.get(i).get(0), result.get(i).get(1), result.get(i).get(2));
		}
	}
};
