package BinarySearch;

public class PeakElementInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 8, 3, 4, 6 };

		int left = 0;
		int right = a.length - 1;
		int peakValue = Integer.MIN_VALUE;

		while (left <= right) {

			int mid = (left + right) / 2;

			int leftAdjecentValue = a[mid - 1];
			int midValue = a[mid];
			int rightAdjecentValue = a[mid + 1];

			if (midValue > rightAdjecentValue && midValue > leftAdjecentValue) {

				peakValue = mid;
				break;

			} else if (leftAdjecentValue > midValue) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		System.out.println(peakValue);
	}

}
