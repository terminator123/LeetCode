/**
 * 
 * @author chenqun
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 */
public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {
		// 检查每行
		int row = board.length;
		int col = board[0].length;
		for (int i = 0; i < row; i++) {
			int[] numCount = new int[9];
			for (int j = 0; j < col; j++) {
				if (board[i][j] >= '1' && board[i][j] <= '9') {
					numCount[board[i][j] - '1'] += 1;
					if (numCount[board[i][j] - '1'] > 1)
						return false;
				} else if (board[i][j] != '.')
					return false;
			}
		}
		// 检查每列
		for (int i = 0; i < col; i++) {
			int[] numCount = new int[9];
			for (int j = 0; j < row; j++) {
				if (board[j][i] >= '1' && board[j][i] <= '9') {
					numCount[board[j][i] - '1'] += 1;
					if (numCount[board[j][i] - '1'] > 1)
						return false;
				} else if (board[j][i] != '.')
					return false;
			}
		}
		// 检查每3*3小方块 i=i+3 j=j+3
		for (int i = 0; i < row - 2; i = i + 3) {

			for (int j = 0; j < col - 2; j = j + 3) {
				int[] numCount = new int[9];
				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if (board[m][n] >= '1' && board[m][n] <= '9') {
							numCount[board[m][n] - '1'] += 1;
							if (numCount[board[m][n] - '1'] > 1)
								return false;
						} else if (board[m][n] != '.')
							return false;

					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] test = new char[][] { { '3', '1', '2' }, { '4', '5', '6' },
				{ '7', '8', '9' }, { '3', '1', '2' }, { '4', '5', '6' },
				{ '7', '8', '9' } };
		System.out.println(isValidSudoku(test));
	}

}
