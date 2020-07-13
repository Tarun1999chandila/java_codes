package l8;

public class backtracking {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queenpermutation( new boolean[4],0,2,"");
		// queencombbox( new boolean[4],0,0,2,"");
		// queencombination( new boolean[4],0,2,"",0);
		queencombbox2d(new boolean[4][4], 0, 0, 0, 4, "");
	}                  

	public static void queenpermutation(boolean[] board, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(++count + "." + ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queenpermutation(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false;
			}
		}
	}

	public static void queencombination(boolean[] board, int qpsf, int tq, String ans, int last) {
		if (qpsf == tq) {
			System.out.println(++count + "." + ans);
			return;
		}
		for (int i = last; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				queencombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
				board[i] = false;
			}
		}
	}

	public static void queencombbox(boolean[] board, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (col == board.length) {
			return;
		}
		// yes
		board[col] = true;
		queencombbox(board, col + 1, qpsf + 1, tq, ans + "b" + col);
		board[col] = false;
		// no
		queencombbox(board, col + 1, qpsf, tq, ans);
	}

	public static void queencombbox2d(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(++count + "." + ans);
			return;
		}
		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		// if (isitsafe2(board, row, col)) {
		if (isitsafe(board, row, col)) {
			// yes
			board[row][col] = true;
			queencombbox2d(board, row, col + 1, qpsf + 1, tq, ans + "b" + "[" + row + " " + col + "]");
			board[row][col] = false;
		}
		// no
		queencombbox2d(board, row, col + 1, qpsf, tq, ans);
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// vertically up
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}

		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;

			c--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;

			r--;
			c++;

		}

		return true;
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
		while (r >= 0 && c >= 0) {
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
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;

			r--;
			c++;

		}
		return true;
	}

}
