package l2;

import java.util.Scanner;

public class patternn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;

		int a = 0;
		int b = 1;
		int c = 0;

		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {

				System.out.print(a + "\t");
				c = a + b;

				a = b;
				b = c;

				cst = cst + 1;

			}

			System.out.println();
			row = row + 1;
			nst = nst + 1;
		}
	}
}
