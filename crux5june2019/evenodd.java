package crux5june2019;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//System.out.println(n);
		int r=n%2;
		if (r == 0) {
			System.out.println("no is even");
		} else
			System.out.println("no. is odd");
	}

}
