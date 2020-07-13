package l3;

import java.util.Scanner;

public class dtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int mul = 1;
		int ans = 0;
		while (n != 0) {
			int rem = n % x;

			ans = ans + rem * mul;
			n = n / x;
			mul = mul * 10;
			// x=x+1;
		}
		System.out.println(ans);
	}

}
