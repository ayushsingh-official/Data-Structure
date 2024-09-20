package matrix;

import java.util.Scanner;

class SetMatrixZero {

	public void setMatrixZeroes(int[][] matrix) {

		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];

		for (int m = 0; m < matrix.length; m++) {

			int[] arr = matrix[m];

			for (int n = 0; n < arr.length; n++) {

				if (matrix[m][n] == 0) {

					rows[m] = cols[n] = true;
				}
			}
		}

		for (int m = 0; m < matrix.length; m++) {

			int[] arr = matrix[m];

			for (int n = 0; n < arr.length; n++) {

				if (rows[m] == true || cols[n] == true) {

					matrix[m][n] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int m = in.nextInt();
		int n = in.nextInt();

		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				matrix[i][j] = in.nextInt();
			}
		}

		in.close();
		new SetMatrixZero().setMatrixZeroes(matrix);

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(matrix[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}