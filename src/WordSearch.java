/**
 * 
 * @author chenqun
 * Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those 
 * horizontally or vertically neighboring. The same letter cell may not be used more than once. 
 *
 */
//�ݹ����
public class WordSearch {

	public boolean exist(char[][] board,String word){
		if(word.length() == 0)
			return false;
		//�����ж�һ�����Ƿ��Ѿ��߹���
		boolean[][] visited = new boolean[board.length][board[0].length];
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				visited[i][j] = false;
			}
		}
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if(board[i][j] == word.charAt(0)){
					visited[i][j] = true;
					if(word.length() == 1 || search(board,i,j,word.substring(1),visited)){
						return true;
					}
					visited[i][j] = false;
				}
			}
		}
		return false;
	}
	public boolean search(char[][] board,int i,int j,String word,boolean[][] visited){
		if(word.length() == 0)
			return true;
		//�ĸ�����
		int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
		for(int k=0; k<direction.length;k++){
			int ii = i + direction[k][0];
			int jj = j+ direction[k][1];
			if(ii >=0 && ii<=board.length &&
					jj>=0 && jj<= board[i].length &&
					board[ii][jj] == word.charAt(0) &&
					visited[ii][jj] == false){
				visited[ii][jj] = true;
				if(word.length() == 1 || search(board,ii,jj,word.substring(1),visited))
					return true;
				visited[ii][jj] = false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
