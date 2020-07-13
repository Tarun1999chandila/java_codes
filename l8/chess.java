package l8;

import java.util.Scanner;

public class chess {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//boolean[][] board =new boolean[n][n];
chess(0,0,n-1,n-1,"");
System.out.println();
System.out.println(count);
	}
public static void chess(int cr,int cc,int er,int ec,String ans) {
	if(cr==er&&cc==ec) {
		System.out.print(ans+"{"+cc+"-"+cr+"}");
		count++;
		return ;
	}
	if(cr>er||cc>ec) {
		return;
	}
	
	
		chess( cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}"+"k");
	
	
	chess(cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}"+"k");
	
	if (cr == 0 || cc == 0 || cr == er || cc == ec) {
	for(int i=1;i<=er;i++) {
		if(cr+i<=er){
			chess(cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}"+"r");
		}
		
	}
	for(int i=1;i<=ec;i++) {
		if(cc+i<=ec) {
			chess(cr,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}"+"r");
		}
		
	}
	}
	if (cr == cc || cr + cc == er) {
	for(int i=1;i<=er&&i<=ec;i++) {
		if(cr+i<=er&&cc+i<=ec) {
			chess(cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}"+"b");
		}
	
		//chess(cr,cc+i,er,ec,ans+"{"+cc+"-"+cr+"}"+"k");
	}
	}
	
}
}
