package removeElementFromLinkedList;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveElementFromLinkedList {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(5);

		LinkedList<Integer> ll = new LinkedList<>();
		
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set);
//		}

		for (int value : set) {
			System.out.println(set.remove(value));
		}
		
		

	}

}
