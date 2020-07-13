package crux5june2019;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		System.out.println(a);
		int b = 1;
		int c=0;
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(a);
		}

	}

}
