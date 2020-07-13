package practice;



import java.util.Scanner;
public class chess {
static int count=0;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
chess(0,0,n-1,n-1,"");
System.out.println();
System.out.println(count);
}
public static void chess(int cr,int cc,int er,int ec,String ans) {
if(cr==er&&cc==ec) {
System.out.print(ans+"{"+cc+"-"+cr+"}"+" ");
		count++;
return ;
		}
	if(cr>er||cc>ec) {
		return;
	}
chess( cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}"+"K");
			chess(cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}"+"K");
	if (cr == 0 || cc == 0 || cr == er || cc == ec) {
	for(int i=1;i<=ec;i++) {
		if(cc+i<=ec) {
			chess(cr,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}"+"R");
		}	}
	for(int i=1;i<=er;i++) {
		if(cr+i<=er){
			chess(cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}"+"R");
} }	}
	if (cr == cc || cr + cc == er) {
	for(int i=1;i<=er&&i<=ec;i++) {
		if(cr+i<=er&&cc+i<=ec) {
			chess(cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}"+"B");
		}
}	}

	/* package l8;


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
*/

}

}
