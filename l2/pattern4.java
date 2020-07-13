package l2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = 2 * n - 3;
		int row = 1;
		int val=1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				cst = cst + 1;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;

			}
			cst = 1;
			if (row == n) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print("*");

				cst = cst + 1;
			}
			System.out.println();
			nst = nst + 1;
			nsp = nsp - 2;
			row = row + 1;

		}

	}

}
