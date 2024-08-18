package countDistinctElements;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElements2 {

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

		int[] arr = {10, 7, 8, 6, 7, 6, 7, 7, 9, 5, 5, 5, 5, 3, 9, 6, 7, 3, 8, 7};

		ArrayList<Integer> res = countDistinctElements(20, 14, arr);

//		ArrayList<Integer> res = countDistinctElements(n, b, arr);

		for (int j : res)
			System.out.print(j + " ");

	}

	static ArrayList<Integer> countDistinctElements(int N, int B, int arr[]) {

		int size = arr.length;
		
		 ArrayList<Integer> list = new ArrayList<>();
		 
		// Edge case 
		// If window size is > array size
		 if(B > N)
		 {
	        return list;
	     }

		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate the First Window from index 0
		// to map
		for (int i = 0; i < B; i++) {

			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		}

		// Add distinct element of windows which is equal to the size of map
		list.add(map.size());

		// Iterate the rest of array
		// and compare and add vales in map for every new windows
		for (int i = B; i < arr.length; i++) {
			
			int elementToRemove = arr[i - B];
			System.out.println("elementToRemove : " + elementToRemove);
			
			System.out.println("map.get(elementToRemove frencency ) : " + map.get(elementToRemove));
			// remove or update the frequency of first element
			if (map.get(arr[i - B])== (1) ) {
				map.remove(arr[i - B]);

			} else {
				map.put(arr[i - B], map.get(arr[i - B]) - 1);
			}

			// add the last element of the current window
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

			list.add(map.size());
			System.out.println("list : " + list);


		}

		return list;

	}

}
