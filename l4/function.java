package l4;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// int hi=scn.nextInt();
		// int lo=scn.nextInt();
		printprimes(10, 200);

	}

	public static void printprimes(int lo, int hi) {
		for (int n = lo; n <= hi; n++) {
			boolean res = isprime(n);
			if (res)
				System.out.println(n);
		}

	}

	public static boolean isprime(int n) {
		int div = 1;
		int fact = 1;
		while (div < n) {
			if (n % div == 0) {
				fact = fact + 1;
			}
			div = div + 1;
		}
		if (fact == 2) {
			return true;
		} else {
			return false;
		}
	}

}
