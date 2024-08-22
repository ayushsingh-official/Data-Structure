package postfixExpressionDSA;

import java.util.Scanner;
import java.util.Stack;

class PostfixExpressionDSA {
	// NOTE: Please do not modify this function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();

		int val = postfixExpression(exp);
		System.out.println(val);
	}

	// TODO: Implement this method
	static int postfixExpression(String exp) {

		Stack<Integer> stack = new Stack<Integer>();

		String[] arr = exp.split(" ");

		for (String str : arr) {

			if (str.equals("+")) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(a+b);
			} else if (str.equals("-")) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(a-b);
			} else if (str.equals("/")) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(a/b);
			} else if (str.equals("*")) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(a * b);
			} else {
				stack.push(Integer.parseInt(str));
			}
		}
		return stack.pop();
	}
}
