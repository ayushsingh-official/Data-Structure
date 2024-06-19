package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMain {

	public static void main(String[] args) {

		int[] array1 = new int[6];

		int[] array2 = { 23, 34, 53, 76, 24, 8568, 65123 };

		Arrays.sort(array2);

		System.out.println(array2);

		for (int array2Value : array2) {
			System.out.println(array2Value);
		}

		System.out.println("array2 length : " + array2.length);

		List<int[]> list = Arrays.asList(array2);

		System.out.println(array2.hashCode());

		int[] value = list.get(0);

		for (int Value : value) {
			System.out.println(Value);
		}

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		int val = list2.get(0);

		System.out.println(val);

	}

}
