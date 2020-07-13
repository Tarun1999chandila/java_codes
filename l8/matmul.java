package l8;

import java.util.Scanner;

public class matmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
int [][]one=new int[n][n];
for(int i=0;i<one.length;i++) {
	for(int j=0;j<one[0].length;j++) {
	one[i][j]=scn.nextInt();
	}
	
}
int [][]two=new int[n][n];
for(int i=0;i<two.length;i++) {
	for(int j=0;j<two[0].length;j++) {
	two[i][j]=scn.nextInt();
	}
	
}
System.out.println();

	}
	public static int[][] mat(int[][] one,int [][]two) {
		int r1=one.length;
		int c1=one[0].length;
		int r2=two.length;
		int c2=two[0].length;
		int [][]ans=new int[r1][c2];
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				int sum=0;
				for(int k=0;k<c1;k++) {
					sum+=one[i][k]*two[k][j];
				}
				ans[i][j]=sum;
			}
		}
		return ans;
	}

}
