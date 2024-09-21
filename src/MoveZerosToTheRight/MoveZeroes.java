package MoveZerosToTheRight;

import java.util.Scanner;
import java.util.Vector;

public class MoveZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Integer> vec = new Vector<Integer>();
		for (int i = 0; i < n; i++)
			vec.add(sc.nextInt());
		Vector<Integer> res = moveZeroes(vec);
		for (Integer elem : res)
			System.out.print(elem + " ");
	}

	private static Vector<Integer> moveZeroes(Vector<Integer> vec) {

		int count = 0;

		Vector<Integer> vec2 = new Vector<>();
		// int pointer = 0;

		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i) == 0) {
				count++;
			} else {
				vec2.add(vec.get(i));
				// pointer++;
			}
		}

		while (count-- > 0) {
			// System.out.println("count : " + count);
			vec2.add(0);
		}

		return vec2;

	}
}
