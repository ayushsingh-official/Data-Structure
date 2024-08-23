package nextGreatorElement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NextGtreaterElementMain {

	// With order of NGE
	// this will maintain insertion order of NGE
	static int[] nextLargerElement(int nums[], int n) {

		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		int[] nge = new int[nums.length];

		for (int i = n - 1; i >= 0; i--) {

			while (!stack.empty() && nums[i] >= stack.peek()) {

				stack.pop();
			}

			if (stack.empty()) {
				nge[i] = -1;
			} else {
				nge[i] = stack.peek();
			}
			stack.push(nums[i]);
		}

		return nge;
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
