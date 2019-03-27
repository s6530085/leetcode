package me.sunmin.algorithm;
//https://leetcode.com/problems/fraction-addition-and-subtraction/
////Runtime: 1 ms, faster than 100.00% of Java online submissions for Fraction Addition and Subtraction.

import java.util.ArrayList;
import java.util.List;

public class P592_FractionAdditionSubtraction {
	
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}

	public String fractionAddition(String expression) {
		if (expression == null || expression.length() == 0) return "0/1";
		List<Integer>fenzi = new ArrayList<Integer>();
		List<Integer>fenmu = new ArrayList<Integer>();
		List<Boolean>sign = new ArrayList<Boolean>();
		int length = expression.length();
		boolean inz = true;
		int fz = 0;
		int fm = 0;
		for (int i = 0; i < length; i++) {
			char c = expression.charAt(i);
			if (i == 0 && c != '-') {
				sign.add(true);
			}
			if (i == length-1) {
				fm = fm * 10 + c - '0';
				fenmu.add(fm);
			}
			if (c == '+' || c == '-') {
				sign.add(c=='+'?true:false);
				inz = true;
				if (i != 0) fenmu.add(fm);
				fm = 0;
			}
			else if (c == '/') {
				inz = false;
				fenzi.add(fz);
				fz = 0;
			}
			else {
				if (inz) {
					fz = fz * 10 + c - '0';
				}
				else {
					fm = fm * 10 + c - '0';
				}
			}
		}
		
		int gc = 1;
		for (int f : fenmu) {
			gc *= f;
		}
		int result = 0;
		for (int i = 0;i < fenzi.size(); i++) {
			int r = fenzi.get(i) * gc / fenmu.get(i);
			if (sign.get(i)) {
				result += r;
			}
			else {
				result -= r;
			}
		}
		if (result == 0) return "0/1";
		
		boolean si = true;
		if (result < 0) {
			result = -result;
			si = false;
		}
		int g = gcd(result, gc);
		return (si ? "" : "-") + result/g + "/" + gc/g; 
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P592_FractionAdditionSubtraction p = new P592_FractionAdditionSubtraction();
		String s = p.fractionAddition("-1/2+1/2+1/3");
		
		
	}

}
