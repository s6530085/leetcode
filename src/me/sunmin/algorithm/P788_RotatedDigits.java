package me.sunmin.algorithm;
//https://leetcode.com/problems/rotated-digits/
//Runtime: 5 ms, faster than 80.88% of Java online submissions for Rotated Digits.


public class P788_RotatedDigits {
	
	public int rotatedDigits(int N) {		
		int count = 0;
		for (int i = 1; i <= N; i++) {
			boolean hasBad = false;
			boolean allFull = true;
			int temp = i;
			while (temp > 0) {
				if (hasBad) break;
				int digit = temp%10;
				
				switch(digit) {
				
				case 3:
				case 4:
				case 7:
					hasBad = true;
					break;
					
				case 2:
				case 5:
				case 6:
				case 9:
					allFull = false;
					break;
				}
				temp /= 10;
			}
			if (!hasBad && !allFull) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		P788_RotatedDigits r = new P788_RotatedDigits();
		int i = r.rotatedDigits(10);
	}
	
}
