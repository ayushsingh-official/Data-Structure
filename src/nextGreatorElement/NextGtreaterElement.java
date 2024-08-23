// Without order of NGE 
package nextGreatorElement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NextGtreaterElement {
	
	//  Without order of NGE 
	static int[] nextLargerElement(int nums[], int n) {

		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			while (!stack.empty() && stack.peek() < nums[i]) {

				list.add(stack.pop());

			}
			stack.push(nums[i]);

		}

		// No NGE then -1
		while (!stack.empty()) {
			list.add(-1);
			stack.pop();
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
