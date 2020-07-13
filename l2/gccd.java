package l2;

import java.util.Scanner;

public class gccd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int divident=scn.nextInt();
int divisor=scn.nextInt();
int rem=0;
while(divident%divisor!=0) {
	 rem=divident%divisor;

	divident=divisor;
	divisor=rem;
}
System.out.println(rem);
	}

}
