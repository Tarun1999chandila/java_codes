package l2;

import java.util.Scanner;

public class patternnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp=csp=1;
			}
			int cst=1;
			while(cst<=nst) {
				if(cst%2==0)
				System.out.print(" ");
				else
					System.out.println("*");
				cst=cst+1;
			}
		
			System.out.println();
			if(row<=n/2) {
				nst=nst+2;
				nsp=nsp-1;
			}
			else {
				nst=nst-2;
				nsp=nsp+1;
			}
			row=row+1;
		}
		
	}
}