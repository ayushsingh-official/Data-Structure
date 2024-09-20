package firstMissingPositiveNumber;

import java.util.HashSet;
import java.util.Scanner;

public class FirstMissingPositiveNumber {

	public int firstMissingPositive(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		System.out.println("array size : " + nums.length);

		for (int value : nums) {
			if (value == 200001) {
				System.out.println("array conatins : " + 200001);
			}
			set.add(value);
		}
		System.out.println("set size : " + set.size());

		System.out.println(set.contains(165515));

		int missingValue = -1;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
//			System.out.println("running index " + i);

			if (!set.contains(i)) {
				System.out.println("running....");
				missingValue = i;
				break;
			}
		}

		return missingValue;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; ++i) {
			nums[i] = in.nextInt();
		}
		int result = new FirstMissingPositiveNumber().firstMissingPositive(nums);
		System.out.println(result);
	}
}
