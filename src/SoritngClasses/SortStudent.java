package SoritngClasses;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudent {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Student arr[] = new Student[n];

		for (int i = 0; i < n; i++) {

			int id = sc.nextInt();
			String name = sc.next();
			int marks[] = new int[5];

			for (int j = 0; j < 5; j++)
				marks[j] = sc.nextInt();
			arr[i] = new Student(id, name, marks);
		}

		int res[] = marksSort(n, arr);

		for (int j : res) {
			System.out.print(j + " ");
		}
	}

	static int[] marksSort(int n, Student arr[]) {

		// comparator with lambda
		Arrays.sort(arr, (a, b) -> {

			int sumA = sum(a.marks);
			System.out.println("sumA : " + sumA);

			int sumB = sum(b.marks);
			System.out.println("sumB : " + sumB);

			if (sumA != sumB) {
				return Integer.compare(sumB, sumA);
			} else if (sumA == sumB) {
				return a.name.compareTo(b.name);
			} else
				return Integer.compare(a.id, b.id);

		});

		int[] sortedArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("id : " + arr[i].id);
			sortedArray[i] = arr[i].id;
		}

		return sortedArray;

	}

	static int sum(int[] marks) {

		int sum = 0;

		for (int mark : marks) {

			sum = sum + mark;
		}

		return sum;
	}

}
