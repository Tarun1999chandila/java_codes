package l2;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = n - 1;
		int row = 1;
		while (row <= 2 * n - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			System.out.println();

			if (row <= n - 1) {
				nst = nst - 1;
				nsp = nsp - 1;
			} else {
				nst = nst + 1;
				nsp = nsp + 1;
			}
			row = row + 1;
		}
	}

}