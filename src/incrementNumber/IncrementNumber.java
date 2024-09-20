package incrementNumber;

import java.util.Scanner;

class IncrementNumber {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		int incArr[] = incrementNumber(n, arr);

		for (int i = 0; i < incArr.length; i++) {
			System.out.print(incArr[i]);
		}

	}

	static int[] incrementNumber(int n, int arr[]) {

		int carry = 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] + carry >= 10) {
				arr[i] = 0;
				carry = 1;
			} else {
				arr[i] = arr[i] + carry;
				carry = 0;
			}

		}
		if (carry == 1) {
			int[] newArray = new int[n + 1];
			newArray[0] = carry;
			for (int i = 0; i < arr.length; i++) {
				newArray[i + 1] = arr[i];
			}
			return newArray;
		}

		return arr;

	}
}