package me.sunmin.algorithm;

public class L_ArrayAnString_DiagonalTraverse {
	
	public int[] findDiagonalOrder(int[][] matrix) {
		if (matrix.length == 0) return new int[0];
		int r[] = new int[matrix.length * matrix[0].length];
		boolean up = true;
		int i = 0;
		int j = 0;
		int index = 0;
		while(index < r.length) {
			r[index] = matrix[i][j];
			index++;
			if (up) {
				if (i == 0 || j == matrix[0].length - 1) {
					if (j == matrix[0].length - 1) {
						i++;
					}
					else {
						j++;
					}
					 
					up = false;
				}
				else {
					i--;
					j++;
				}
			}
			else {
				if (j == 0 || i == matrix.length - 1) {
					if (i == matrix.length - 1) {
						j++;
					}
					else {
						i++;
					}
					up = true;
				}
				else {
					i++;
					j--;
				}
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L_ArrayAnString_DiagonalTraverse t = new L_ArrayAnString_DiagonalTraverse();
		int [][] martrix = { { 1, 2 },
				{ 3, 4 }};
		int [] r = t.findDiagonalOrder(martrix);
	}

}
