package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);

		list.forEach((Integer val) -> System.out.println(val));

		list.size();

		System.out.println(list.contains(2));

		System.out.println(list.get(0));

		System.out.println(Collections.max(list));

		list.remove(3);

		list.forEach((Integer val) -> System.out.println(val));

	}
}
