package practice;

import java.util.Scanner;

public class fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
		//System.out.println(fibonacii(n));
//printfibonacii(0,6);
		//printprimes(0,100);
//System.out.println(power(2,3));
//System.out.println(factorial(5));
	}
////	public static void printfibonacii(int lo,int hi) {
////		for(int i=lo;i<=hi;i++) {
////			int res=fibonacii(i);
////			System.out.println(res);
////		}
////	}
//	public static int fibonacii(int n) {
//		if(n==0) {
//			return 0;
//		}
//		if(n==1) {
//			return 1;
//		}
//		int fn=0;
//		//System.out.println(n);
//		int ans1= fibonacii(n-1);
//		int ans2=fibonacii(n-2);
//	 fn=ans1+ans2;
//	 System.out.println(fn);
//		return fn;
//	}
//public static boolean primes(int n) {
//	int div=1;
//	int fact=1;
//	while(div<n) {
//		if(n%div==0) {
//			fact=fact+1;
//		}
//		div=div+1;
//	}
//	if(fact==2) {
//		return true;
//	}
//	else {
//		return false;
//	}
//	
//}
//public static void printprimes(int lo,int hi) {
//	for(int i=lo;i<=hi;i++) {
//		boolean res=primes(i);
//		if(res)
//			System.out.println(i);
//	}
//}
//public static int power(int x,int n) {
//	if(n==0) {
//		return 1;
//	}
//	int ans1=0;
//	int ans=power(x,n-1);
//	 ans1=ans*x;
//	return ans1;
//}
//public static int factorial(int n) {
//	if(n==0) {
//		return 1;
//	}
//	int ans1=0;
//	int ans=factorial(n-1);
//	ans1=ans*n;
//	return ans1;
//}
}
