package l11;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion1 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//System.out.println(mazePathd(0,0,2,2));
	//	System.out.println(mazePathm(0,0,2,2));
	System.out.println(snakeladder(0,10));
	}
	public static ArrayList<String> mazePathd(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		// horizontal
		if (cc + 1 <= ec) {
			ArrayList<String> rrh = mazePathd(cr, cc + 1, er, ec);

			for (String val : rrh) {
				mr.add("H" + val);
			}
		}

		// vertical
		if (cr + 1 <= er) {
			ArrayList<String> rrv = mazePathd(cr + 1, cc, er, ec);

			for (String val : rrv) {
				mr.add("V" + val);
			}
		}
	if(cr+1<=er||cc+1<=ec) {
			ArrayList<String> rrd = mazePathd(cr + 1, cc+1, er, ec);
			for (String val : rrd) {
				mr.add("D" + val);
			}
		}

		return mr;
	}

	public static ArrayList<String> mazePathm(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
for(int mov=1;mov<=er&&mov<=ec;mov++) {
		// horizontal
		if (cc + 1 <= ec) {
			ArrayList<String> rrh = mazePathm(cr, cc + mov, er, ec);

			for (String val : rrh) {
				mr.add("H"+mov + val);
			}
		}

		// vertical
		if (cr + 1 <= er) {
			ArrayList<String> rrv = mazePathm(cr + mov, cc, er, ec);

			for (String val : rrv) {
				mr.add("V"+mov + val);
			}
		}
		if(cr+1<=er||cc+1<=ec) {
			ArrayList<String> rrd = mazePathm(cr + mov, cc+mov, er, ec);
			for (String val : rrd) {
				mr.add("D"+ mov + val);
			}
		}
}
		return mr;

}
	public static ArrayList<String> snakeladder(int curr,int end){
		if(curr==end) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		if(curr>=end) {
			ArrayList<String> br=new ArrayList<>();
			//br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		
		for(int mov=1;mov<=6;mov++) {
			
			
				ArrayList<String> rr = snakeladder(curr+mov,end);
			
			for(String val:rr) {
				mr.add(mov+val);
			
			}
		}
		return mr;
	}
}
