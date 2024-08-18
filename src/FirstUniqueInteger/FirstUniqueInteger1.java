package FirstUniqueInteger;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class FirstUniqueInteger1 {

	public static int firstUniqueInteger(Vector<Integer> vec) {

		// edge case value
		// If no unique value
		int result= -1;

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int key : vec) {

			map.put(key, map.getOrDefault(key, 0) + 1);

		}

		for (Map.Entry<Integer, Integer> keyset : map.entrySet()) {
			
			if(keyset.getValue() == 1) {
				result = keyset.getKey();
				break;
			}
			
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Integer> vec = new Vector<Integer>();
		for (int i = 0; i < n; i++)
			vec.add(sc.nextInt());
		System.out.println(firstUniqueInteger(vec));
	}
}
