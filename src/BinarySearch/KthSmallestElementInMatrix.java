package BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KthSmallestElementInMatrix {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<ArrayList<Integer>> Matrix = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				row.add(sc.nextInt());
			}
			Matrix.add(row);
		}
		int ans = kthSmallestElementInMatrix(Matrix, k);
		System.out.print(ans);
	}

	static int kthSmallestElementInMatrix(List<ArrayList<Integer>> Matrix, int k) {

		int size = Matrix.size();

		int left = Matrix.get(0).get(0);
		int right = Matrix.get(size - 1).get(0);

		while (left <= right) {

			int mid = (left + right) / 2;

			if (Matrix.get(mid).get(0) > k) {
				right = mid;
			} else if (Matrix.get(mid).get(0) < k) {
				left = mid;
			}

		}

		return -1;

	}

}
