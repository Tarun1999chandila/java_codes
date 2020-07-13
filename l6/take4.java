package l6;

import java.util.Scanner;
class take4{
	static Scanner scn=new Scanner(System.in);
	public static void main(String arg[]){
		int[][] array=takeinput();
		display(array);
	}
	public static int[][] takeinput(){
		int row=scn.nextInt();
		int col=scn.nextInt();
		int[][] arr=new int[row][col];
		for(int r=0;r<arr.length;r++){
			for(int c=0;c<arr[row].length;c++){
				arr[r][c]=scn.nextInt();
			}
	}
	return arr;
	}
	public static void display(int[][] arr){
		for(int[] row1:arr){
			for(int val:row1){
				System.out.println(val);
			}
		}
	}
}
