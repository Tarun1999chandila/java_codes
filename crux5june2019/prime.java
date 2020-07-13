package crux5june2019;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=2;
		for (; i < n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		if (i == n) {
			System.out.println("prime");
			} else {
				System.out.println("not prime");
		}
	}

}
