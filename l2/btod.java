package l2;

import java.util.Scanner;

public class btod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int multiplier=1;
		int ans=0;
		while(n!=0) {
			int rem=n%8;
			ans=ans+rem*multiplier;
			n=n/8;
			multiplier=multiplier*10;
			
		}
		System.out.println(ans);

	}

}
