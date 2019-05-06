package me.sunmin.algorithm;
//https://leetcode.com/problems/number-of-lines-to-write-string/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Lines To Write String.


public class P806_NumberOfLinesToWriteString {
	public int[] numberOfLines(int[] widths, String S) {
		int lines = 1;
		int remain = 0;
		for (char c : S.toCharArray()) {
			int i = widths[c-'a'];
			if (remain+i > 100) {
				lines++;
				remain = i;
			}
			else {
				remain += i;
			}
		}
		return new int[] {lines, remain};
    }
	
	public static void main(String[] args) {
		P806_NumberOfLinesToWriteString s = new P806_NumberOfLinesToWriteString();
		
		int[] rs = s.numberOfLines(new int[] {7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9},
				"zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie");
		int i = 100;
		
	}
}

