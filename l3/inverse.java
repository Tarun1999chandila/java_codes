package l3;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 1;
//int mul=1;
		int ans = 0;
		int rem = 0;
		while (n != 0) {
			rem = n % 10;
			ans = ans + count * (int) Math.pow(10, rem - 1);

			n = n / 10;
			count = count + 1;

		}
		System.out.println(ans);
	}

}
