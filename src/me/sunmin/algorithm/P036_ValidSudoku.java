package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-sudoku/
//Runtime: 13 ms, faster than 97.48% of Java online submissions for Valid Sudoku.

public class P036_ValidSudoku {
	private boolean validLine(char[] line) {
		int valid = 0;
		for (int i = 0; i < line.length; i++) {
			char c = line[i];
			if (c == '.') {
				continue;
			}
			else {
				int offset = c - '1';
				if ((valid & (1 << offset)) == 0) {
					valid |= (1 << offset);
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean validHLine(char[] line) {
		return validLine(line);
	}
	
	private boolean validVLine(char[][] board, int v) {
		char line[] = new char[board[0].length];
		for (int i = 0; i < line.length; i++) {
			line[i] = board[i][v];
		}
		return validLine(line);
	}
	
	private boolean validSquare(char[][] board, int i, int j) {
		char line[] = new char[board[0].length];
		for (int k = 0; k < line.length; k++) {
			line[k] = board[i+k/3][j+k%3];
		}
		return validLine(line);
	}
	
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (!validHLine(board[i])) {
				return false;
			}
		}
		
		for (int v = 0; v < board[0].length; v++) {
			if (!validVLine(board, v)) {
				return false;
			}
		}
		
		for (int i = 0; i < board.length; i += 3) {
			for (int j = 0; j < board[0].length; j += 3) {
				if (!validSquare(board, i, j)) {
					return false;
				}
			}
		}
		
		return true;
    }

}
