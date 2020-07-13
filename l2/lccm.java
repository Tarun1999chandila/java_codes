package l2;

import java.util.Scanner;

public class lccm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int divident=scn.nextInt();
		int divisor=scn.nextInt();
		int ans=0;
		int a=divident;
		int b=divisor;
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			//ans=divident*divisor/rem;
	
			divident=divisor;
			divisor=rem;
		}
		ans= ( a * b )\rem;
		System.out.println(ans);
	}

}
