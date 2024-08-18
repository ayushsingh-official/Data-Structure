package countDistinctElements;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElements1 {

	public static void main(String args[]) {

//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		int b = sc.nextInt();
//
//		int arr[] = new int[n];
//
//		for (int i = 0; i < n; i++)
//			arr[i] = sc.nextInt();

		int[] arr = { 1, 2, 1, 3, 4, 3 };

		ArrayList<Integer> res = countDistinctElements(6, 3, arr);

//		ArrayList<Integer> res = countDistinctElements(n, b, arr);

		for (int j : res)
			System.out.print(j + " ");

	}

	static ArrayList<Integer> countDistinctElements(int N, int B, int arr[]) {

		int size = arr.length;
		int i = -1;

		ArrayList<Integer> list = new ArrayList<>();

		HashSet<Integer> set = new HashSet<>();

		while (i++ < (size - B)) {

			System.out.println("i : " + i);

			for (int j = i; j < B + i; j++) {

				System.out.println("values : " + arr[j]);
				set.add(arr[j]);

			}

			System.out.println("set size : " + set.size());

			list.add(set.size());

			set.clear();

		}

		return list;

	}

}
