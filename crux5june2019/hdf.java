package crux5june2019;

import java.util.Scanner;

public class hdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		int rem;

		while (divident % divisor != 0) {

			rem = divident % divisor;
			System.out.println(rem);
			divident = divisor;
			divisor = rem;

		}

	}

}
