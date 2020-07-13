package l8;
import java.util.*;

public class editdistance {
	
	
	    public static void main(String args[]) {
	        // Your Code Here
	        Scanner scn=new Scanner(System.in);
	        String s1=scn.next();
	           String s2=scn.next();
	           int [][]strg=new int[s1.length()+1][s2.length()+1];
	           for(int i=0;i<strg.length;i++){
	               Arrays.fill(strg[i],-1);
	           }
	           System.out.println(editdistancetd(s1,s2,strg));
	           
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
	}

