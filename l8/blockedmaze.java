package l8;

public class blockedmaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[][]maze= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
//blockedmaze(maze,0,0,"",new boolean[maze.length][maze[0].length]);
		
	}
	public static void blockedmaze(int[][] maze,int row,int col,String ans,boolean[][] visited) {
	if(row==maze.length-1&&col==maze[0].length-1) {
		System.out.println(ans);
		return;
	}
		if(row<0||col<0||row>=maze.length||col>=maze[0].length||visited[row][col]||maze[row][col]==1) {
		return;
	}
		visited[row][col]=true;
		//b
		blockedmaze(maze,row+1,col,ans+"b",visited);
		//t
		blockedmaze(maze,row-1,col,ans+"t",visited);
		//l
		blockedmaze(maze,row,col-1,ans+"l",visited);
		//r
		blockedmaze(maze,row,col+1,ans+"r",visited);
		visited[row][col]=false;
	}

	public static boolean searchword(char[][] arr,int row,int col,String word,int idx,boolean[][] visited) {
		if(idx==word.length()) {
			return true;
		}
		if(row<0||col<0||row>=arr.length||col>=arr[0].length||visited[row][col])	{
		return false;
	}
		if(arr[row][col]!=word.charAt(idx)) {
			return false;
		}
	
	
	visited[row][col]=true;
	boolean t=searchword(arr, row-1, col, word, idx+1, visited);
	boolean l=searchword(arr, row, col-1, word, idx+1, visited);
	boolean r= searchword(arr, row, col+1, word, idx+1, visited);
	boolean b=searchword(arr, row+1, col, word, idx+1, visited);
	visited[row][col]=false;
	return t||l||r||b;
	}
}
