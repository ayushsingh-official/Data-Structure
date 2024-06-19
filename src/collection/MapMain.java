package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap();

		map.put("India", 1);
		map.put("Pakistan", 69);
		map.put("Australia", 2);
		map.put("West Indies", 3);
		map.put("england", 100);
		map.put("New Zealand", 5);

		System.out.println(map.get("India"));

		System.out.println(map.containsKey("Pakistan"));

		System.out.println(map.containsValue(100));

		map.remove("New Zealand");

		System.out.println(map.containsValue(5));

		System.out.println(map.values());

		Collection<Integer> collection = map.values();

		System.out.println(collection);

		collection.forEach((Integer value) -> System.out.println(value));

		System.out.println(collection.toString());

		System.out.println(collection.toArray().hashCode());

		Set<String> set = map.keySet();

		set.forEach((String value) -> System.out.println(value));

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> value : entrySet) {
			String country = value.getKey();
			int rank = value.getValue();
			System.out.println("Country : " + country + "rank : " + rank);
		}

	}

}
