package l3;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int temp = n;
		int nod=0;
		int rem = 0;
		int mul = (int) Math.pow(10, x);
		while(temp!=0) {
			nod=temp%10;
			temp=temp/10;
		}
		n=n%10;
	
	}

}
