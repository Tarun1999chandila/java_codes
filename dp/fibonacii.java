package dp;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacii {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int n=scn.nextInt();
//////		int [] strg=new int[n+1];
//////System.out.println(fibonaciitd(n,strg));
//////int n1=scn.nextInt();
//////System.out.println(fibonaciibu(n1));
//////System.out.println(fibonaciispacebu(50));
//////		int [] strg=new int[n+6];
//////		System.out.println(boardpathtd(0, n, strg));
//////System.out.println(boardpathtd(0, n, strg));
//////System.out.println(boardpathspacebu(n));
//		int m=scn.nextInt();
//System.out.println(mazepathtd(0, 0, n, m, new int [n+1][m+1]));
//		System.out.println(mazepathbu(n, m));
//		System.out.println(mazepathspacebu(n, m));
//System.out.println(LCS("abdef","abef"));
//		String s1 = "sunday";
//		String s2 = "saturday";
//		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
//		for (int i = 0; i < strg.length; i++) {
//		Arrays.fill(strg[i], -1);
//	}
//	System.out.println(LCStd(s1, s2, strg));
	String s1=scn.next();
	String s2=scn.next();
//	String s3=scn.next();
//	int[][][]strg=new int[s1.length()+1][s2.length()+1][s3.length()+1];
//	for (int i = 0; i < s1.length(); i++) {
//		for (int j = 0; j < s2.length(); j++) {
//			for (int k = 0; k < s3.length(); k++) {
//				strg[i][j][k]=-1;
//			}
//		}
//		
////				Arrays.fill(strg[i], -1);
//		}
//	System.out.println(lcs12(s1,s2,s3,strg));
	    
//		System.out.println(Lcsbu(s1, s2));
//		 System.out.println(editdistancetd(s1,s2,strg));
		// int []arr= {1,2,3,4};
		 System.out.println(editdistancebu(s1, s2));
		// System.out.println(multmat(arr, 0, , strg));
//	int []arr=new int[5];
//	for(int i=0;i<arr.length;i++) {
//		arr[i]=scn.nextInt();
//		}
//System.out.println( multmat(arr, 0, arr.length-1, new int[arr.length][arr.length]));
//		int[] arr = { 2, 3, 5, 1, 4 };
//		System.out.println(wineproblem(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
//		System.out.println(wineproblembu(arr));
//		String src = "aaabbb";
//		String pat = "*****?";
//		System.out.println(wildcardmatching(src, pat));
//		System.out.println(wildmatchingbu(src, pat));
//		int[]p= {1,4,5,7};
//		int[]w= {1,3,4,5};
//		System.out.println(knapsack(p, w, 0, 7));
//		System.out.println(knapsacktd(p, w, 0, 7, new int[p.length][7+1]));
//		System.out.println(knapsackbu(p, w, 7));
//		int []arr= {0,1,4,2,3,1};
////		int[][]strg=new int[arr.length][arr.length];
////		for(int i=0;i<strg.length;i++) {
////			Arrays.fill(strg[i], -1);
////		}
////		System.out.println(mixturetd(arr, 0, arr.length-1,strg));
////		System.out.println(mixturebu(arr));
//		
//		System.out.println(rodcuttd(arr, 5,new int [arr.length]));
//		System.out.println(rodcutbu(arr));
//		
	}


	public static int fibonaciitd(int n, int[] strg) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fbn1 = fibonaciitd(n - 2, strg);
		int fbn2 = fibonaciitd(n - 1, strg);
		int fn = fbn1 + fbn2;
		strg[n] = fn;
		return fn;
	}

	public static int fibonaciibu(int n) {

		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

	public static int fibonaciispacebu(int n) {

		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 1; i <= n - 1; i++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}

	public static int boardpathtd(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int c = 0;
		for (int i = 1; i <= 6; i++) {
			c = c + boardpathtd(curr + i, end, strg);
		}
		strg[curr] = c;
		return c;
	}

	public static int boardpathbu(int n) {
		int[] strg = new int[n + 6];
		strg[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}
		return strg[0];
	}

	public static int boardpathspacebu(int n) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int i = 0; i < n; i++) {
			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}
		return strg[0];
	}

	public static int mazepathtd(int cr, int cc, int er, int ec, int[][] strg) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cc > ec || cr > er) {
			return 0;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		int h = mazepathtd(cr + 1, cc, er, ec, strg);
		int v = mazepathtd(cr, cc + 1, er, ec, strg);
		strg[cr][cc] = h + v;
		return h + v;
	}

	public static int mazepathbu(int er, int ec) {
		int[][] strg = new int[er + 2][ec + 2];
		strg[er][ec] = 1;
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					continue;
				}
				strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
			}

		}
		return strg[0][0];
	}

	public static int mazepathspacebu(int er, int ec) {
		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);
		for (int i = er - 1; i >= 0; i--) {
			for (int col = ec - 1; col >= 0; col--) {
				if (i == er && col == ec) {
					continue;
				}
				strg[col] = strg[col] + strg[col + 1];
			}

		}
		return strg[0];
	}

	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);

			ans = Math.max(o1, o2);
		}

		return ans;

	}

	public static int LCStd(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCStd(ros1, ros2, strg) + 1;
		} else {
			int o1 = LCStd(s1, ros2, strg);
			int o2 = LCStd(ros1, s2, strg);

			ans = Math.max(o1, o2);
		}
		strg[s1.length()][s2.length()] = ans;
		return ans;

	}

	public static int Lcsbu(String s1, String s2) {
		int strg[][] = new int[s1.length() + 1][s2.length() + 1];
		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;

				} else {
					int o1 = strg[row][col + 1];
					int o2 = strg[row + 1][col];
					strg[row][col] = Math.max(o1, o2);

				}

			}

		}
		return strg[0][0];
	}

	public static int editdistancetd(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}
		int ch1 = s1.charAt(0);
		int ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			ans = editdistancetd(ros1, ros2, strg);
		} else {
			int i = editdistancetd(ros1, s2, strg);
			int d = editdistancetd(s1, ros2, strg);
			int r = editdistancetd(ros1, ros2, strg);
			ans = Math.min(i, Math.min(d, r)) + 1;
		}
		strg[s1.length()][s2.length()] = ans;
		return ans;
	}

	public static int editdistancebu(String s1, String s2) {
		int strg[][] = new int[s1.length() + 1][s2.length() + 1];
		if (strg[s1.length()][s2.length()] != 0) {
			return strg[s1.length()][s2.length()];
		}

		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {
				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;

				}
				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;

				}
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] ;

				} else {
					int o1 = strg[row + 1][col];
					int o2 = strg[row][col + 1];
					int o3 = strg[row + 1][col + 1];
					strg[row][col] = Math.min(o1, Math.min(o2, o3)) + 1;

				}

			}

		}
		return strg[0][0];
	}

	public static int multmat(int[] arr, int si, int ei, int[][] strg) {
		if (ei - si == 1) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int total = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int left = multmat(arr, si, k, strg);
			int right = multmat(arr, k, ei, strg);

			int sw = arr[ei] * arr[si] * arr[k];
			int total1 = sw + left + right;
			if (total > total1) {
				total = total1;
			}
		}
		strg[ei][si] = total;
		return strg[ei][si];
	}

	public static int multmatbu(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 1; slide <= n - 2; slide++) {
			for (int si = 0; si <= n - slide - 2; si++) {
				int ei = si + slide + 1;
// copy
				int min = Integer.MAX_VALUE;
				for (int k = si + 1; k <= ei - 1; k++) {
					int fp = strg[si][k];
					int sp = strg[k][ei];
					int sw = arr[si] * arr[k] * arr[ei];
					int total = fp + sp + sw;
					if (total < min) {
						min = total;
					}
				}
				strg[si][ei] = min;
			}
		}
		return strg[0][n - 1];
	}

	public static int wineproblem(int[] arr, int si, int ei, int[][] strg) {
		int yr = arr.length - ei + si;
		if (si == ei) {
			return arr[si] * yr;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int start = wineproblem(arr, si + 1, ei, strg) + (arr[si] * yr);
		int end = wineproblem(arr, si, ei - 1, strg) + (arr[ei] * yr);
		int ans = Math.max(start, end);
		strg[si][ei] = ans;
		return ans;
	}

	public static int wineproblembu(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int yr = arr.length - ei + si;
				if (si == ei) {
					strg[si][ei] = (arr[si] * yr);
					continue;
				}
				int start = strg[si + 1][ei] + arr[si] * yr;
				int end = strg[si][ei - 1] + arr[ei] * yr;
				int ans = Math.max(start, end);
				strg[si][ei] = ans;

			}

		}
		// int[][]strg=new int [n][n];
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg.length; j++) {
				System.out.print(strg[i][j] + "\t");
			}
			System.out.println();
		}

		return strg[0][n - 1];
	}

	public static boolean wildcardmatching(String src, String pat) {
		if (src.length() == 0 && pat.length() == 0) {
			return true;
		}
		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}
		if (src.length() == 0 && pat.length() != 0) {
			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		char ch1 = src.charAt(0);
		char ch2 = pat.charAt(0);

		String ros = src.substring(1);
		String rop = pat.substring(1);
		boolean res;
		if (ch1 == ch2 || ch2 == '?') {
			res = wildcardmatching(ros, rop);
		} else if (ch2 == '*') {
			boolean res1 = wildcardmatching(src, rop);
			boolean res2 = wildcardmatching(ros, pat);
			res = res1 || res2;
		} else {
			return false;
		}
		return res;

	}

	public static boolean wildcardmatchingtd(String src, String pat, int[][] strg) {
		if (strg[src.length()][pat.length()] != 0) {
			return strg[src.length()][pat.length()] == 2 ? true : false;
		}

		if (src.length() == 0 && pat.length() == 0) {
			return true;
		}
		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}
		if (src.length() == 0 && pat.length() != 0) {
			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		char ch1 = src.charAt(0);
		char ch2 = pat.charAt(0);

		String ros = src.substring(1);
		String rop = pat.substring(1);
		boolean res;
		if (ch1 == ch2 || ch2 == '?') {
			res = wildcardmatchingtd(ros, rop, strg);
		} else if (ch2 == '*') {
			boolean res1 = wildcardmatchingtd(src, rop, strg);
			boolean res2 = wildcardmatchingtd(ros, pat, strg);
			res = res1 || res2;
		} else {
			return false;
		}
		strg[src.length()][pat.length()] = (res) ? 2 : 1;
		return res;

	}

	public static boolean wildmatchingbu(String src, String pat) {
		boolean[][] strg = new boolean[src.length()][pat.length()];
		strg[src.length()][pat.length()] = true;
		for (int row = src.length(); row >= 0; row--) {
			for (int col = pat.length() - 1; col >= 0; col--) {
				char ch1 = src.charAt(row);
				char ch2 = pat.charAt(col);
				boolean res;
				if(pat.charAt(row)=='*') {
					strg[row][col]=strg[row][col+1];
				}
				else {
					strg[row][col]=false;
				}
//				continue;
				if (ch1 == ch2 || ch2 == '?') {
					res = strg[row + 1][col + 1];
				} else if (ch2 == '*') {
					boolean res1 = strg[row][col + 1];
					boolean res2 = strg[row + 1][col];
					res = res1 || res2;
				} else {
					return false;
				}
				strg[row][col] = res;
			}
		}
		return strg[0][0];
	}
public static int knapsack(int[] p,int [] w,int vidx,int cap) {
	if(vidx==w.length) {
		return 0;
	}
	
	int inc=0;
	int exc=0;
	if(w[vidx]<=cap) 
	 inc=knapsack(p,w,vidx+1,cap-w[vidx])+p[vidx];
	 exc=knapsack(p,w,vidx+1,cap);
	
	return Math.max(inc,exc);
}
public static int knapsacktd(int[] p,int [] w,int vidx,int cap,int[][]strg) {
	if(vidx==w.length) {
		return 0;
	}
	if(strg[vidx][cap]!=0) {
		return strg[vidx][cap];
	}
	int inc=0;
if(w[vidx]<=cap)
	 inc=knapsacktd(p,w,vidx+1,cap-w[vidx],strg)+p[vidx];
	int exc=knapsacktd(p,w,vidx+1,cap,strg);
	 return strg[vidx][cap]=Math.max(inc,exc);
	//return Math.max(inc,exc);
}
public static int knapsackbu(int []p,int[]w,int cap) {
	int[][]strg=new int[p.length+1][cap+1];
	for(int row=p.length-1;row>=0;row--) {
		for(int col=0;col<=cap;col++) {
			int inc=0;
//			if(row==p.length-1) {
//				strg[row][col]=0;
//				continue;
//			}
			if(w[row]<=col)
			 inc=strg[row+1][col-w[row]]+p[row];
			int exc=strg[row+1][col];
			strg[row][col]=Math.max(inc, exc);
		}
	}
	return strg[0][cap];
}
public static int mixturetd(int []arr,int si,int ei,int[][]strg) {
	if(ei==si) {
		return 0;
	}
	if(strg[si][ei]!=-1) {
		return strg[si][ei];
	}
	int min=Integer.MAX_VALUE;
	for(int k=si;k<=ei-1;k++) {
		int sr=mixturetd(arr,si,k,strg);
		int vv=mixturetd(arr,k+1,ei,strg);
		int sw=color(arr,si,k)*color(arr,k+1,ei);
		int total=sr+vv+sw;
		if(min>total) {
			min=total;
		}
		
	}
	strg[si][ei]=min;
	return min;
}
public static int color(int []arr,int si,int ei) {
	int sum=0;
	for(int i=si;i<=ei;i++) {
		sum+=arr[i];
	}
	return sum%100;
}
public static int mixturebu(int[]arr) {
	int n=arr.length;
	int[][]strg=new int[n][n];
	for(int slide=1;slide<=n-1;slide++) {
			for(int si=0;si<=n-slide-1;si++) {
				int ei=slide+si;
				int min=Integer.MAX_VALUE;
				for(int k=si;k<=ei-1;k++) {
					int sr=strg[si][k];
					int vv=strg[k+1][ei];
					int sw=color(arr,si,k)*color(arr,k+1,ei);
					int total=sr+vv+sw;
					if(min>total) {
						min=total;
					}
					
				}
				strg[si][ei]=min;
			}
	}
	return strg[0][n-1];
}
public static int rodcuttd(int []arr,int len,int[]strg) {
	int max=arr[len];
	int left=1;
	int right=len-1; 
	if(strg[len]!=0) {
		return strg[len];
	}
	while(left<=right) {
		int lb=rodcuttd(arr,left,strg);
		int rb=rodcuttd(arr,right,strg);
		
		int total=lb+rb;
		if(total>max) {
			max=total;
		}
		left++;
		right--;
		
	}
	strg[len]=max;
	return max;
}
public static int rodcutbu(int []arr) {
	int []strg=new int [arr.length];
	for(int len=0;len<strg.length;len++) {
	int max=arr[len];
	int left=1;
	int right=len-1; 
//		if(strg[len]!=0) {
//			return strg[len];
//		}
		while(left<=right) {
			int lb=strg[left];
			int rb=strg[right];
			
			int total=lb+rb;
			if(total>max) {
				max=total;
				
			}
			left++;
			right--;
			
		}
		strg[len]=max;
	}
	return strg[arr.length-1];
}


    public static int lcs12(String s1,String s2,String s3,int[][][] strg){
        if(s1.length()==0||s2.length()==0||s3.length()==0){
            return 0;
        }
        if(strg[s1.length()][s2.length()][s3.length()]!=-1){
            return strg[s1.length()][s2.length()][s3.length()];
        }

         char ch1=s1.charAt(0);
        char ch2=s2.charAt(0);
        char ch3=s3.charAt(0);
        
        String ros1=s1.substring(1);
         String ros2=s2.substring(1);
          String ros3=s3.substring(1);
        int ans=0;
        if(ch1==ch2&&ch1==ch3&&ch2==ch3){
            ans=lcs12(ros1,ros2,ros3,strg)+1;
        }
        else{
            int o1=lcs12(s1,ros2,ros3,strg);
            int o2=lcs12(ros1,s2,ros3,strg);
            int o3=lcs12(ros1,ros2,s3,strg);
            ans=Math.max(o1,Math.max(o2,o3));
        }
        strg[s1.length()][s2.length()][s3.length()]=ans;
        
        return ans;
        
    }
    
    
}

