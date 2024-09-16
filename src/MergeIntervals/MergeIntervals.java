package MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class MergeIntervals {

	public int[][] mergeIntervals(int[][] intervals) {
		
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		// for(int[] arr :intervals){
		// System.out.println(Arrays.toString(intervals));
		// }

		ArrayList<int[]> list = new ArrayList<>();

		for (int[] arr : intervals) {
			if (list.isEmpty()) {
				list.add(arr);
			} else if (arr[0] <= list.get(list.size() - 1)[1]) {  // if overlap
				int[] a = list.remove(list.size() - 1);
				a[1] = arr[1];
				list.add(a);

			} else {
				list.add(arr);

			}
		}
		int[][] newarray = new int[list.size()][2];
		
		for(int[] arr : list) {
			int index = list.indexOf(arr);
			newarray[index] = arr;
		}
		return newarray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[][] nums = new int[n][2];

		for (int i = 0; i < n; i++) {
			nums[i][0] = scanner.nextInt();
			nums[i][1] = scanner.nextInt();
		}

		int[][] results = new MergeIntervals().mergeIntervals(nums);

		for (int i = 0; i < results.length; ++i) {
			System.out.printf("%d %d\n", results[i][0], results[i][1]);
		}
	}
}
