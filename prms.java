import java.util.Scanner;

public class paranthesis1 {

 static Scanner scn= new Scanner(System.in);

	public static void main(String[] args) {

		

		//int er=scn.nextInt();

		int n=scn.nextInt();

		int er=n;

		int ec=n;

		int c=mazepath(0, 0, er-1, ec-1, "");

		System.out.println();

		System.out.println(c);

		

		

		

	}

	

public static int mazepath(int cr, int cc, int er, int ec, String ans) {

		int c=0;

		int c3=cr;