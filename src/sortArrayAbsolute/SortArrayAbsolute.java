package sortArrayAbsolute;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

class SortArrayAbsolute {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res[] = sortArrayAbsolute(n, arr);

		for (int j : res)
			System.out.print(j + " ");
	}

	static int[] sortArrayAbsolute(int n, int arr[]) {

		SortedSet<Integer> set = new TreeSet<>();

		for (int value : arr) {
			System.out.println("value : " + Math.abs(value));
			set.add(Math.abs(value));
		}

		int[] array = new int[set.size()];

		for (int value : set) {
			int i = 0;
			System.out.println("value in set: " + value);

			array[i] = value;
			System.out.println("array value : " + array[i]);
			i++;
		}
		
		return array;

	}
}