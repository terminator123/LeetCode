/**
 * 
 * @author chenqun
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * Empty cells are indicated by the character '.'.
 *	You may assume that there will be only one unique solution.
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {
           solve(board);
       
    }
    private boolean solve(char[][] board) {
         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j ++) {
                if (board[i][j] =='.') {
                    for (char k = '1'; k <= '9'; k++) {
                        board[i][j] = k;
                        if (isValid(board, i, j) && solve(board)) {
                            return true;
                        }
                       board[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board,int x, int y ) {
        boolean [][] square = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            if (y != i &&board[x][y] == board[x][i]){
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (x != i &&board[i][y] == board[x][y]){
                return false;
            }
        }
        for (int i = (x / 3) * 3; i < (x / 3) * 3 + 3; i++) {
            for (int j = (y /3) * 3; j < (y / 3) *3 + 3; j++) {
                if (x != i && y != j && board[i][j] == board[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++)
				board[i][j] = '.';
		}
		SudokuSolver test = new SudokuSolver();
		test.solve(board);
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++)
				System.out.print(board[i][j]);
			System.out.println();
		}
	}
}
