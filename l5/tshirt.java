package l5;

import java.util.Scanner;

class tshirt {
	public static void main(String ags[]) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			int n1 = scn.nextInt();
			for (int j = 1; j <= n1; j++) {
				int n2 = j;
				int rem = 0;
				int ans = 0;
				int mul = 1;
				while (n2 != 0) {

					rem = n2 % 2;
					ans = ans + rem * mul;
					n2 = n2 / 2;
					mul = mul * 10;
				}
				System.out.println(ans + " ");
			}
		}
	}
}