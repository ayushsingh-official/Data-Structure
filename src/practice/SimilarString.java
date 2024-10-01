package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimilarString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			String first_string = sc.next();
			String second_string = sc.next();
			String answer = similarString(n, m, first_string, second_string, k);
			System.out.println(answer);
		}
		sc.close();
	}

	static String similarString(int n, int m, String s, String t, int k) {

		Map<Character, Integer> smap = new HashMap<>();
		Map<Character, Integer> tmap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
		}
		String similar;

		// if(smap.size() != tmap.size()){
		// similar = "No";
		// }else{
		similar = checksimilarString(tmap, smap, k);
		// }
		return similar;
	}

	static String checksimilarString(Map<Character, Integer> bigMap, Map<Character, Integer> smallMap, int k) {

		for (Map.Entry<Character, Integer> entry : bigMap.entrySet()) {

			char key = entry.getKey();

			if (Math.abs(bigMap.get(key) - smallMap.get(key)) > k) {
				return "No";
			}

		}

		return "Yes";

	}

}
