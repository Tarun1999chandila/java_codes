package l6;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
//substring(str);
//System.out.println(palindrome(str));
//System.out.println(countpalindrome(str));
System.out.println(StringBuilderchangecase(str));

	}
	public static void substring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
				
			}
			//System.out.println();
		}
	}
	public static boolean palindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
public static int countpalindrome(String str) {
	int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
			
			String ss=str.substring(i,j);
			if(palindrome(ss)){
				count++;
			}
			}
			//System.out.println();
		
	}
		return count;
}
public static void StringBuilderchangecase(String str) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch)) {
			sb.append(Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch)) {
			sb.append(Character.toUpperCase(ch));
	}
		
}
	return sb;
}
}