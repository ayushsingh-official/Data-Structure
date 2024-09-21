package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ThreeSum {

	public List<List<Integer>> threeSum(Integer[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i <= nums.length - 3; i++) {

			int a = nums[i];
			System.out.println("a : " + a);

			int target = 0 - nums[i];
			System.out.println("target : " + target);

			List<List<Integer>> list = twoSum(nums, i, target);

			if (list.size() > 0) {

				result.addAll(list);
			}

		}

		return result;
	}

	private List<List<Integer>> twoSum(Integer[] nums, int i, int target) {

		List<List<Integer>> list = new ArrayList<>();

		int ptr1 = i + 1;
		int ptr2 = nums.length - 1;
		System.out.println(" pointers :  " + ptr1 + " , " + ptr2);

		while (ptr1 < ptr2) {
			int sum = nums[ptr1] + nums[ptr2];

			System.out.println(" pointers insode...  :  " + ptr1 + " , " + ptr2);

			if (sum == target) {
				list.add(Arrays.asList(nums[i], nums[ptr1], nums[ptr2]));
				ptr1++;
				ptr2--;
//				break;
			} else if (sum < target) {
				ptr1++;
			} else {
				ptr2--;
			}

		}
//		System.out.print(" triplets : ");
//
//		for (int triplet : list) {
//			System.out.print(triplet);
//		}
//		System.out.println("");

//		list.sort(Comparator.naturalOrder());

		return list;

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
}
