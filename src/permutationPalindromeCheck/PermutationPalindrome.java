package permutationPalindromeCheck;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationPalindrome {

	public static int isPermutationPalindrome(String s) {

		int ans = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int value = map.getOrDefault(c, 0) + 1;
			map.put(c, value);
		}

		int odd = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			char key = entry.getKey();
			int value = entry.getValue();

			if (value % 2 != 0) {
				odd++;
			}

		}

		if (s.length() % 2 == 0) {
			if (odd == 0)
				ans = 1;
		} else if (s.length() % 2 != 0) {
			if (odd == 1) {
				ans = 1;
			}
		}

		return ans;

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = 1;
		t = sc.nextInt();
		sc.nextLine();
		while (t > 0) {
			t--;
			String s = new String();
			s = sc.next();

			int flag = isPermutationPalindrome(s);
			if (flag == 1) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}

}
