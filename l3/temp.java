package l3;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		//int minf=scn.nextInt();
		int maxf=scn.nextInt();
		int step=scn.nextInt();
		int minf=0;
		int temp=minf;
		int c=0;
		while(temp<=maxf) {
			c=(int)((5.0/9)*(temp-32));
			minf=minf+step;
			
			
		
		System.out.println(temp + "\t" + c);
		temp=temp+step;
		}
	}

}
