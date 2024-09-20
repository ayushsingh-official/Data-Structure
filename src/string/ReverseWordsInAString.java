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

		String str = removeMultipleSpaces(sb.toString()); // or use replaceAllmethod with reex.

		return str;
	}

	private static String removeMultipleSpaces(String input) {
		StringBuilder result = new StringBuilder();
		boolean lastWasSpace = false;

		// Traverse through each character in the string
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// Check if the current character is a space
			if (currentChar == ' ') {
				if (!lastWasSpace) {
					result.append(currentChar); // Add only one space
				}
				lastWasSpace = true; // Set flag to true if a space is found
			} else {
				result.append(currentChar); // Add non-space characters
				lastWasSpace = false; // Reset flag when a non-space character is found
			}
		}

		// Return the final string with multiple spaces removed
		return result.toString();
	}

}
