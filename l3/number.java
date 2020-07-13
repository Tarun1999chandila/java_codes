package l3;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int mul = 1;
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;

			ans = ans + rem * mul;
			n = n / 10;
			mul = mul * x;

			// x=x+1;
		}
		System.out.println(ans);
	}

}
