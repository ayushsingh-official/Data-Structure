package sortArrayAbsolute;

import java.util.Arrays;
import java.util.Scanner;

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

		Integer[] array = new Integer[n];
		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i];
		}

		Arrays.sort(array, (a, b) -> {

			if (Math.abs(a) < Math.abs(b)) {
				return -1;
			} else if (Math.abs(a) > Math.abs(b)) {
				return 1;
			} else {
				return 0;
			}
		});

		for (int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}

		return arr;

	}
}