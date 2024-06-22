package BinarySearch;

public class FindTheFirstOne {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 1, 1 };

		int lo = 0;
		int hi = arr.length - 1;

		int answerIdx = -1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			System.out.println("mid :" + mid);

			if (arr[mid] == 1) {
				hi = mid - 1;
				System.out.println("hi : " + hi);
				answerIdx = mid;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(answerIdx);
	}

}
