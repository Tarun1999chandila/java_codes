package l4;

import java.util.Scanner;

public class array2d {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = takeinput();
		// display(array);
		// vertical(array);
//spiral(array);
		wave(array);
	/*	int[][] one = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] two = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int[][] res = matrixMultiplication(one, two);

		display(res);*/
	}

	public static int[][] takeinput() {
		System.out.println("row");
		int row = scn.nextInt();
		int[][] arr = new int[row][];
		for (int r = 0; r < arr.length; r++) {
			System.out.println("cols");
			int cols = scn.nextInt();
			arr[r] = new int[cols];
			for (int c = 0; c < arr[r].length; c++) {
				System.out.println("[" + r + " " + c + "]");
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

	public static void vertical(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

	public static void wave(int[][] arr) {
		int i = 0;
		int j = 0;

//	for(int i=0;i<arr[0].length;i++) {
//		for(int j=0;j<arr.length;j++){
		for (int count = 0; count < arr[0].length; count++) {
			if (count % 2 != 0) {

				for (i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][count] + " ");

				}

			} else {
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i][count] + " ");

				}
			}
			System.out.println();
		}
	}

	public static void spiral(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;
		while(count < nel) {

			for (int r = minrow; r <= maxcol && count < nel; r++) {
				System.out.print(arr[r][mincol] + " ");
				count++;
			}
			mincol++;
			for (int c = mincol; c <= maxcol && count < nel; c++) {
				System.out.print(arr[maxrow][c] + " ");
				count++;
			}
			maxrow--;
			for (int r = maxrow; r >= minrow && count < nel; r--) {
				System.out.print(arr[r][maxcol] + " ");
				count++;
				
			}
			maxcol--;

			for (int c = maxcol; c > mincol && count < nel; c--) {
				System.out.print(arr[minrow][c] + " ");
				count++;
			}
			minrow++;
		}
	}

		
		
	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;

		int[][] ans = new int[r1][c2];

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {

				int sum = 0;

				for (int k = 0; k < c1; k++) {
					sum = sum + one[i][k] * two[k][j];
				}

				ans[i][j] = sum;
			}

		}

		return ans;

	}

}
