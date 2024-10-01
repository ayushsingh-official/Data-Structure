package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class NextSmallerElement {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = nextSmallerElement(arr, n);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
	}

	static int[] nextSmallerElement(int arr[], int n) {

		Stack<Integer> stack = new Stack<>();
		int[] ans = new int[arr.length];
		Map<Integer, Integer> map = new HashMap<>();

		stack.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			while (!stack.isEmpty() && stack.peek() > arr[i]) {
				map.put(stack.pop(), arr[i]);
			}
			stack.push(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey((arr[i]))) {
				ans[i] = map.get(arr[i]);
			} else {
				ans[i] = -1;
			}
		}

		return ans;
	}
}
