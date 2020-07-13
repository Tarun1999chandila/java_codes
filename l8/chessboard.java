package l8;
import java.util.Arrays;
import java.util.Scanner;

public class chessboard {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			//char[][] charray = fillArray(3);
		char[][] board=new char[n][n];
			int c=board1(board, 0, 0, n-1, n-1, "");
			System.out.println();
			System.out.println(c);

		}

		public static int board1(char[][] board, int cr, int cc, int er, int ec, String ans) {

			if (cr == er && cc == ec) {
				System.out.println(ans + "{" + cr + "-" + cc + "} ");
				return 1;
			}

		int cnt=0;

			// knight
			cnt += board1(board, cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
			cnt += board1(board, cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

			// Rook

			if (cr == 0 || cc == 0 || cr == er || cc == ec) {

				for (int i = 1; i <= ec; i++)
					cnt += board1(board, cr, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}R");

				for (int i = 1; i <= er; i++)
					cnt += board1(board, cr + i, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}
			// Bishop

			if (cr == cc || cr + cc == er) {
				for (int i = 1; i <= er && i <= ec; i++) {
					cnt += board1(board, cr + i, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}B");
				}
			}

			return cnt;
		}

		
	}


