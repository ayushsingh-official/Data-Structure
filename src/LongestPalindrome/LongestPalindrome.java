package LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {

		String s = "aacccddd";

		int n = s.length();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

		}

		int sum = 0;
		boolean odd = false;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			int value = entry.getValue();

			if (value % 2 == 0) {
				sum += value;
			} else {
				sum = sum + (value - 1);
				odd = true;
			}

		}

		if (odd) {
			sum++;
		}

		System.out.println("Sum : " + sum);

	}

}
