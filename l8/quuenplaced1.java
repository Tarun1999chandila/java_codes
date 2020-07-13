package l8;


	import java.util.Scanner;
	public class quuenplaced1 {
	 static Scanner scn= new Scanner(System.in);
		public static void main(String[] args) {
			int n=scn.nextInt();
int c=knight(new boolean[n][n], 0, 0, 0, n, "");
			System.out.println();
			System.out.println(c);
			
		}
			public static int knight(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
			int c=0;
				if (qpsf == tq) {
				System.out.print( ans+" ");
				return 1;
			}
			if (col == board[0].length) {
				row = row + 1;
				col = 0;
			}
			if (row == board.length) {
				return 0 ;
			}
			if (isitsafe2(board, row, col)) {
			//if (isitsafe(board, row, col)) {
				// yes
				board[row][col] = true;
				c+=knight(board, row, col + 1, qpsf + 1, tq,  ans  +" "+ "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
			// no
			c+=knight(board, row, col + 1, qpsf, tq, ans);
			return c;
		}
	public static boolean isitsafe2(boolean[][] board, int row, int col) {
		
			int r = row - 1;
		   int c = col - 2;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}

		// diagonally right
		r = row - 2;
		c = col - 1;
		while (r >= 0 && c >=0) {
			if (board[r][c])
				return false;
			
			r--;
			c++;
			
		}
		r = row - 1;
		c = col + 2;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			
			r--;
			c++;
			
		}
		r = row - 2;
		c = col +1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			
			r--;
			c++;
			
		}
		return true;
		}

	}
