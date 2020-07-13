package l7;

public class paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//validparanthesis(3,0,0,"");
//permutation("abac","");
		// boardpath(0, 10, "");
		// mazepath(0, 0, 2, 2, "");
		laxico(0, 1000);
		
	}

	public static void validparanthesis(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}
		validparanthesis(n, open + 1, close, ans + "(");
		validparanthesis(n, open, close + 1, ans + ")");

	}

	public static void permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			int count = 0;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ch == ques.charAt(j)) {
					count++;
				}
			}
			if (count == 0)
				permutation(roq, ans + ch);
		}
	}

	public static void boardpath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
		for (int i = 1; i <= 6; i++) {
			boardpath(curr + i, end, ans + i);
		}
	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cc + 1 <= ec) {
			mazepath(cr, cc + 1, er, ec, ans + "H");
		}
		if (cr + 1 <= er) {
			mazepath(cr + 1, cc, er, ec, ans + "V");
		}
	}

	public static void laxico(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			laxico(curr * 10 + i, end);
		}
	}
	
}
