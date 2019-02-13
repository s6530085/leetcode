package me.sunmin.algorithm;
//https://leetcode.com/problems/word-search/
//Runtime: 8 ms, faster than 84.35% of Java online submissions for Word Search.

public class P079_WordSearch {

	private boolean valid(char[][]board, char[] words, boolean[][] visited, int i, int j, int index) {
		if (index == words.length) return true;
		if (i < 0 || i >= board.length) return false;
		if (j < 0 || j >= board[0].length) return false;
		if (visited[i][j] == true) return false;
		if (words[index] == board[i][j]) {
			visited[i][j] = true;
            index++;
			boolean b = valid(board, words, visited, i+1, j, index)
					|| valid(board, words, visited, i, j+1, index)
					|| valid(board, words, visited, i-1, j, index)
					|| valid(board, words, visited, i, j-1, index);
            if (b) {
                return true;
            }
            else {
                visited[i][j]=false;
                return false;
            }
		}
		else {
			return false;
		}
	}
	
	
	public boolean exist(char[][] board, String word) {
        char ws[] = word.toCharArray();
        boolean visited[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		if (valid(board, ws,visited, i, j, 0)) {
        			return true;
        		}
        	}
        }
        return false;
	}
	
	
	public static void main(String[] args) {
		P079_WordSearch s = new P079_WordSearch();
		char [][] cs = {{'A','B','C','E'},
				{'S','F','C','S'},
				  {'A','D','E','E'}};
		boolean n = s.exist(cs,"ABCCED");
	}
}
