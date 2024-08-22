package longestValidParanthesis;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {

		String str = "()(()(())";

		System.out.println(str.length());
		Stack<Integer> stack = new Stack<Integer>();
		int length = str.length();;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int index = i;

			if (ch == '(') {
				stack.push(i);
			} else {
				if (!stack.empty()) {

					if (str.charAt(stack.peek()) == '(') {

						stack.pop();

					} else {
						stack.push(i);
//						System.out.println("stack peek else : " + stack.peek());

					}
				} else {

					stack.push(i);
//					System.out.println("stack peek else 2 : " + stack.peek());

				}
			}
		}

		int max = 0;
		int top = length;
		while (!stack.isEmpty()) {
			

			max = Math.max(max, top - stack.peek() -1);
			
			top = stack.pop();

		}

		max = Math.max(max, top);

		
		System.out.println("length : " + max);
	}

}
