package me.sunmin.algorithm;
//https://leetcode.com/problems/count-and-say/
//Runtime: 3 ms, faster than 72.11% of Java online submissions for Count and Say.

public class P038_CountAndSay {
	public String countAndSay(int n) {
        String last = "1";
    	for (int i = 2; i <= n; i++) {
    		StringBuilder sb = new StringBuilder();
    		char cs[] = last.toCharArray();
    		int lastCount = 0;
    		for (int j = 0; j < cs.length; j++) {
    			char c = cs[j];
    			if (j == 0) {
    				lastCount++;
    			}
    			else {
    				if (c == cs[j-1]) {
    					lastCount++;
    				}
    				else {
    					sb.append(lastCount);
        				sb.append(cs[j-1]);
        				lastCount = 1;
    				}
    			}
    			if (j == cs.length-1) {
    				sb.append(lastCount);
    				sb.append(c);
    			}
    		}
    		
    		last = sb.toString();
    	}
    	
    	return last;

    }
}
