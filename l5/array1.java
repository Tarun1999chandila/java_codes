package l5;

import java.util.Scanner;

class array1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String ags[]) {

		int[][] array = takeinput();
		// display(array);
		wave(array);

	}

	public static int[][] takeinput() {
		// System.out.println("row");
		int row = scn.nextInt();
		int cols = scn.nextInt();
		int[][] arr = new int[row][];
		for (int r = 0; r < row; r++) {
			// System.out.println("cols");

			arr[r] = new int[cols];
			for (int c = 0; c < arr[r].length; c++) {
				// System.out.println("[" + r + " " + c + "]");
				arr[r][c] = scn.nextInt();

			}

		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int[] row1 : arr) {
			for (int val : row1) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	public static void wave(int[][] arr) {

		for (int r = 0; r < arr.length; r++) {

			if (r % 2 == 0) {

				for (int c = 0; c < arr[0].length; c++) {
					System.out.print(arr[r][c] + "," + " ");
				}

			} else {

				for (int c = arr[0].length - 1; c >= 0; c--) {
					System.out.print(arr[r][c] + "," + " ");
				}

			}

		}
		System.out.print("END");
		System.out.println();

	}
}
