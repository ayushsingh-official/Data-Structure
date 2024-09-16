package MinNumberOfRooms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindNumRooms {

	// we can also use comparable here as we are provided the class option
	// else we can use comparator at the time of sorting.
	static class pair {
		int first, second;

		pair(int x, int y) {
			first = x;
			second = y;
		}
	}

	public int findNumRooms(int[][] intervals) {
		// Initialize a vector of pair, Time, first value
		// indicates the time of entry or exit of a lecture
		// second value denotes whether the lecture starts
		// or ends
		ArrayList<pair> Time = new ArrayList<>();

		// Store the lecture times
		for (int i = 0; i < intervals.length; i++) {
			Time.add(new pair(intervals[i][0], 1));
			Time.add(new pair(intervals[i][1] , -1));
		}

		// Sort the vector
		Collections.sort(Time, (pair A, pair B) -> {
			return A.first - B.first;
		});

		int answer = 0, sum = 0;

		// Traverse the Time vector and Update sum and
		// answer variables
		for (int i = 0; i < Time.size(); i++) {
			sum += Time.get(i).second;
			answer = Math.max(answer, sum);
		}

		// Return the answer
		return answer;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[][] nums = new int[n][2];

		for (int i = 0; i < n; i++) {
			nums[i][0] = scanner.nextInt();
			nums[i][1] = scanner.nextInt();
		}

		int result = new FindNumRooms().findNumRooms(nums);

		System.out.printf("%d", result);
	}

}
