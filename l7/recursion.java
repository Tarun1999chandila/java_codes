package l7;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// int x=scn.nextInt();
		// int n=scn.nextInt();
		// pids(n);
// System.out.println(factorial(n));
// System.out.println(power(x,n));
// System.out.println(fibonacii(n));
		/*
		 * int arr; int[] array = takeinput(); display(array);
		 */
		int[] arr = { 10, 20, 30, 40, 30, 30, 50 };
		/*
		 * System.out.println(findfirstindex(arr,0,50)); System.out.println(max(arr,0));
		 * System.out.println(); int[] ans=findallindex(arr,0,30,0); for(int val:ans) {
		 * System.out.println(val); }
		 */
	//	String str = scn.next();
		//int n=scn.nextInt();
		// System.out.println(getss(str));
		// System.out.println(getascii(str));
		//System.out.println(getkpc(str));
	//	System.out.println(getht(n));
		//System.out.println(permutation(str));
		System.out.println(mazePath(0,0,2,2));


	}

	public static void pids(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		pids(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		int fn1 = factorial(n - 1);
		int fn = fn1 * n;

		return fn;
	}

	public static int power(int x, int n) {
		if (n == 1) {
			return x;
		}
		int pow1 = power(x, n - 1);
		int pn = pow1 * x;
		return pn;

	}

	public static int fibonacii(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		int fbn1 = fibonacii(n - 2);
		int fbn2 = fibonacii(n - 1);
		int fn = fbn1 + fbn2;
		return fn;
	}

	/*
	 * public static int[] takeinput() { System.out.println("size"); int n =
	 * scn.nextInt();
	 * 
	 * int[] arr = new int[n]; for (int i = 0; i < arr.length; i++) {
	 * 
	 * // arr[i] = scn.nextInt(); } return arr; }
	 * 
	 * public static void display(int[] arr) { for (int val : arr) {
	 * System.out.println(val); } }
	 */

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return Integer.MIN_VALUE;
		}
		int rr = max(arr, vidx + 1);
		if (rr > arr[vidx]) {
			return rr;
		} else {
			return arr[vidx];
		}
	}

	public static int findfirstindex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == item) {
			return vidx;
		}
		int rr = findfirstindex(arr, vidx + 1, item);
		return rr;
	}

	public static int findlastindex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		int rr = findfirstindex(arr, vidx + 1, item);
		if (arr[vidx] == item && rr == -1) {
			return vidx;
		}

		return rr;
	}

	public static int[] findallindex(int[] arr, int vidx, int item, int count) {
		if (vidx == arr.length) {
			int[] br = new int[count];
			return br;
		}
		if (arr[vidx] == item) {
			int[] rr = findallindex(arr, vidx + 1, item, count + 1);
			rr[count] = vidx;
			return rr;

		} else {
			return findallindex(arr, vidx + 1, item, count);

		}
	}

	public static ArrayList<String> getss(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getss(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add(val);
			mr.add(ch + val);

		}
		return mr;
	}

	public static ArrayList<String> getascii(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		int as = ch;
		String ros = str.substring(1);
		ArrayList<String> rr = getascii(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add(val);
			mr.add(ch + val);
			mr.add(as + ch + val);

		}
		return mr;
	}

	public static ArrayList<String> getkpc(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);

		String ros = str.substring(1);
		ArrayList<String> rr = getkpc(ros);
		ArrayList<String> mr = new ArrayList<>();
		String code = getCode(ch);
		for (int i = 0; i <code.length(); i++) {

			for (String val : rr) {
				mr.add(code.charAt(i) + val);

			}
		}
		return mr;

	}

	public static String getCode(char ch) {

		if (ch == '1')

			return "abc";

		else if (ch == '2')

			return "def";

		else if (ch == '3')

			return "ghi";

		else if (ch == '4')

			return "jk";

		else if (ch == '5')

			return "lmno";

		else if (ch == '6')

			return "pqr";

		else if (ch == '7')

			return "stu";

		else if (ch == '8')

			return "vwx";

		else if (ch == '9')

			return "yz";

		else if (ch == '0')

			return "@#";

		else

			return "";

	}
	public static ArrayList<String> getht(int n) {
		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
ArrayList<String> rr=getht(n-1);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr) {
			mr.add("H"+val);
			mr.add("T"+val);
		}
		return mr;
	}
	public static  ArrayList<String> permutation(String str){
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);

		String ros = str.substring(1);
		ArrayList<String> rr = permutation(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			for(int i=0;i<=val.length();i++) {
				String ans=(val.substring(0,i)+ch+val.substring(i));
				mr.add(ans);
			}
		
	}
		return mr;
	}		
	
public static ArrayList<String> mazePath(int cr, int cc, int er, int ec) {

	if (cr == er && cc == ec) {
		ArrayList<String> br = new ArrayList<>();
		br.add("");
		return br;
	}

	ArrayList<String> mr = new ArrayList<>();

	// horizontal
	if (cc + 1 <= ec) {
		ArrayList<String> rrh = mazePath(cr, cc + 1, er, ec);

		for (String val : rrh) {
			mr.add("H" + val);
		}
	}

	// vertical
	if (cr + 1 <= er) {
		ArrayList<String> rrv = mazePath(cr + 1, cc, er, ec);

		for (String val : rrv) {
			mr.add("V" + val);
		}
	}
	
	return mr;
}

}