package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-string-ii/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String II.
//category:string

public class P541_ReverseString2 {

	public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        boolean inReverse = true;
        int begin = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
        	int end = Math.min(begin + k, cs.length);
        	if (inReverse) {
        		for (int j = begin; j < begin + (end - begin)/2; j++) {
        			char c = cs[j];
        			cs[j] = cs[end-j+begin-1];
        			cs[end-j+begin-1] = c;
        		}
        	}
        	sb.append(cs, begin, end-begin);
        	inReverse = !inReverse;
        	begin += k;
        	if (end == cs.length) break;
        }
        
        return sb.toString();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P541_ReverseString2 s2 = new P541_ReverseString2();
		String s = s2.reverseStr("abcdefg", 2);

	}

}