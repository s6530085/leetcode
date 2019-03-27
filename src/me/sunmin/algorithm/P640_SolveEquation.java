package me.sunmin.algorithm;
//https://leetcode.com/problems/solve-the-equation/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Solve the Equation.

public class P640_SolveEquation {
	
	public String solveEquation(String equation) {
		boolean left = true;
		boolean sign = true;
		int xc = 0;
		int sx = 0;
		int num = 0;
		for(int i = 0; i < equation.length(); i++) {
			char c = equation.charAt(i);
			if (c >= '0' && c <= '9') {
				num = num * 10 + c - '0';
				if (i == equation.length()-1) {
					sx += sign ? -num : num;
				}
			}
			else if (c == 'x') {
				if (num == 0) {
					if (i == 0 || equation.charAt(i-1) != '0') num = 1;
				}
				xc += sign ? num : -num;
				num = 0;
			}
			else if (c == '+') {
				if (equation.charAt(i-1) != 'x') {
					sx += sign ? -num : num;
				}
				num = 0;
				sign = left ? true : false;

			}
			else if (c == '-') {
				if (i != 0 && equation.charAt(i-1) != 'x') {
					sx += sign ? -num : num;
				}
				num = 0;
				sign = left ? false : true;
			}
			else if (c == '=') {
				left = false;
				if (equation.charAt(i-1) != 'x') {
					sx += sign ? -num : num;
					num = 0;
				}
				
				if (equation.charAt(i+1) != '-') {
					sign = false;
				}
				else {
					sign = true;
				}
			}
		}
		if (xc == 0) {
			if (sx == 0) {
				return "Infinite solutions";
			}
			else {
				return "No solution";
			}
		}
		else {
            sx /= xc;
            xc = 1;
			return "" + (xc == 1 ? "" : xc) + "x=" + sx; 
		}
    }
	
	public static void main(String[] args) {
		P640_SolveEquation e = new P640_SolveEquation();
		String s = e.solveEquation("-x=-1");
	}
}
