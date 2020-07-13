package crux5june2019;

import java.util.Scanner;

public class otherlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		int rem = 0;
		int a = divident;
		int b = divisor;
		int lcm=0;
		// int lcm = divident;
		while (divident % divisor != 0) {
			rem = divident % divisor;

			divident = divisor;
			divisor = rem;

			lcm = (a * b) / rem;
		}
			if (rem != 0) {
				System.out.println(lcm);
			} else {
				System.out.println(divident);
			}
		
	}
}