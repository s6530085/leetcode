package me.sunmin.algorithm;
//https://leetcode.com/problems/integer-replacement/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Integer Replacement.
//catergory:bit

public class P397_IntegerReplacement {
	
	public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) return 32;
		int operation = 0;
		while(n > 1) {
			if ((n & 1) == 0) {
				n >>= 1;
			}
			else {
                if (n == 3) {
                    operation += 2;
                    break;
                }
				if ((n | 2) > n) {
					n -= 1;
				}
				else {
					n += 1;
				}
			}
			
			operation++;
		}
		
		return operation;
    }
	
}
