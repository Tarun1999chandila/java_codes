package crux5june2019;

import java.util.Scanner;

public class fbn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
int a=0;
int b=1;
int c;
int i=0;
while(i<=n-1) {
	c=a+b;
	System.out.println(a);
	a=b;
	b=c;
	i=i+1;
}

	}

}
