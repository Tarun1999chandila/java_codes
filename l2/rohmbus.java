package l2;

import java.util.Scanner;

public class rohmbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=2*n-1) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" " + "\t");
				csp=csp+1;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*" + "\t");
				cst=cst+1;
			}
		}
			System.out.println();
			if(row<=n-1) {
				nsp=nsp-1;
				nst=nst+2;
			}
			else {
				nsp=nsp+1;
				nst=nst-2;
			}
			row=row+1;
			
		
	}

}
