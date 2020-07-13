package crux5june2019;

import java.util.Scanner;

public class prme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();

	int flag;
	int i=2;
	

	while(i<=n) {
		
		flag=0;
		//System.out.println(flag +" "+i);
	int div=2;
	
		while(div<i) {
			if(i%div==0) {
				flag=flag+1;
				break;
			}
		div=div+1;
		}
		if(flag==0) {
			System.out.println(i);
			
		}
		i=i+1;
	}
			
}
}