package nextGreatorElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGtreaterElementWithOrder {

	// With order of NGE
	// Hashmap method have cant provide the NGE of Duplicates value at index array.
	static int[] nextLargerElement(int nums[], int n) {

		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			while (!stack.empty() && stack.peek() < nums[i]) {

				int value = stack.peek();
//				list.add(value);
				map.put(value, map.getOrDefault(value, nums[i]));
				stack.pop();

			}
			stack.push(nums[i]);

		}

		// No NGE then -1
		while (!stack.empty()) {
			int noNGE = stack.peek();
//			list.add(-1);
			map.put(noNGE, map.getOrDefault(noNGE, -1));
			stack.pop();
		}

		for (int i = 0; i < nums.length; i++) {
			list.add(map.get(nums[i]));
		}

		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		return array;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int[] ans = nextLargerElement(ar, n);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
	}

}
