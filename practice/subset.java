package practice;

import java.util.Scanner;

public class subset {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	int n=scn.nextInt();
	for(int j=0;j<n;j++) {
		int n1=scn.nextInt();
	 int [] arr=new int[n1];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=scn.nextInt();
	 }
	 subset(arr);
	// printss("123","");
	}
}
	public static void subset(int[] arr) {

		int limit = (int) Math.pow(2, arr.length);

		for (int i = 0; i <= limit - 1; i++) {
			int idx = 0;
			int rem = 0;
			int temp = i;
			int count=0;
			while (temp != 0) {
				rem = temp % 2;

				if (rem == 1) {
					System.out.print(arr[idx] + " ");
//					count++;
//					System.out.println(count);
				}

				idx++;
				temp = temp / 2;
			}
			System.out.println();
		}
	}
//	public static void printss(String ques,String ans) {
//		if(ques.length()==0) {
//			System.out.println(ans);
//			return;
//		}
//		char ch=ques.charAt(0);
//		String roq=ques.substring(1);
//		printss(roq,ans);
//		printss(roq,ans+ch);
//	}
}
