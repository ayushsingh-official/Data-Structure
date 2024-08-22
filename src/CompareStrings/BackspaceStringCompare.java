package CompareStrings;

import java.util.Scanner;
import java.util.Stack;

class BackspaceStringCompare {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			String S = sc.next();
			String T = sc.next();

			boolean res = backspaceStringCompare(S, T);

			if (res)
				System.out.println(true);
			else
				System.out.println(false);

		}
	}

	static boolean backspaceStringCompare(String S, String T) {

		Stack<Integer> stackS = new Stack<>();
		Stack<Integer> stackT = new Stack<>();

		for (int i = 0; i < S.length(); i++) {

			int value = S.charAt(i);

			if (value == '#' && !stackS.isEmpty()) {

				stackS.pop();

			} else {

				stackS.push(value);
			}

		} 

		for (int i = 0; i < T.length(); i++) {

			int value = T.charAt(i);

			if (value == '#' && !stackT.isEmpty()) {

				stackT.pop();

			} else {

				stackT.push(value);
			}

		}

		if (stackS.equals(stackT)) {
			return true;
		} else
			return false;

	}

}