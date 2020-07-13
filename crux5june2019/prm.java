package crux5june2019;

import java.util.Scanner;

public class prm {

	public static void main(String[] args) {
		// TODO Auto-generated metho
		 Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int div = 1;
		int f = 0;
		int primeno;
		int i=2;
		while(i<=n) {
		while (div <= i) {
			if (i % div == 0) {
				f =f+1;
			}
			div = div + 1;
		}
		
		if (f == 2) {
		//	System.out.println("prime");
			System.out.println(i);
			i=i+1;
		} 
	//	else {
		//	System.out.println("not prime");
	//	}
		}
		
	}
}
