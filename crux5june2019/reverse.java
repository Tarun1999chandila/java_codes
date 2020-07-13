package crux5june2019;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int ans = 0;
		int rem;
		while (n != 0) {
			rem = n % 10;
			// System.out.print(rem);

			ans = ans * 10 + rem;
			n = n / 10;
		}
		System.out.println(ans);
	}

}
