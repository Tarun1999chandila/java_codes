package crux5june2019;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		int ans = 0;
		int rem;
		while ((divident % divisor) != 0) {
			rem = divident % divisor;

			ans = (divident * divisor) / rem;
		
			divident = divisor;
		divisor = rem;
		}
		
		System.out.println(ans);
	}

}
