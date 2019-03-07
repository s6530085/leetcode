package me.sunmin.algorithm;
//https://leetcode.com/problems/bulls-and-cows/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Bulls and Cows.

public class P299_BullsAndCows {
	public String getHint(String secret, String guess) {
		
		char ss[] = secret.toCharArray();
		char gs[] = guess.toCharArray();
		
		int bulls = 0;
		int cows = 0;
		int counts[] = new int[10];
		for (char c : ss) {
			counts[c-'0']++;
		}
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] == gs[i]) {
				bulls++;
				counts[ss[i]-'0']--;
			}
		}
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] != gs[i] && counts[gs[i] - '0'] > 0) {
				cows++;
				counts[gs[i]-'0']--;
			}
		}
		
		return String.format("%dA%dB", bulls, cows);
    }
}
