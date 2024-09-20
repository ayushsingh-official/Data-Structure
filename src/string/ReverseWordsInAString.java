package string;

import java.util.Scanner;

class ReverseWordsInAString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverseWordsInAString(s));
		sc.close();
	}

	// Standard way
	static String reverseWordsInAString(String s) {

		String[] arr = s.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}

		return sb.toString();
	}

}
