package minimumStack;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	static Stack<Integer> stack = new Stack<Integer>();
	static Stack<Integer> min = new Stack<Integer>();

	static void push(Integer e) {

		stack.push(e);

		if(min.empty()){
			min.push(e);
		}else {
			
			if(e > min.peek()){
				min.push(min.peek());
			}
			else{
				min.push(e);
			}
		}
	}

	static void pop() {

		if(!stack.empty()){
			stack.pop();
		}
		if(!min.empty()){
			min.pop();
		}
	}

	static Integer findMin() {

		if(min.empty()){
			return -1;
		}else
		return min.peek();

	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Integer a = sc.nextInt();
			if (a == 1) {
				Integer e = sc.nextInt();
				push(e);
			}
			if (a == 2) {
				pop();
			}
			if (a == 3) {
				System.out.println(findMin());
			}
		}
	}}
