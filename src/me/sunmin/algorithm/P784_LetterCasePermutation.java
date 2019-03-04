package me.sunmin.algorithm;
//https://leetcode.com/problems/letter-case-permutation/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Letter Case Permutation.

import java.util.ArrayList;
import java.util.List;

public class P784_LetterCasePermutation {

	private void p(char[] cs, int index, List<String> list) {
		for (int i = index; i < cs.length; i++) {
			char c = cs[i];
			if (Character.isLetter(c)) {
				char d;
				if (c >= 'a' && c <= 'z') {
	        		d = (char)('A' + c - 'a');
	        	}
	        	else {
	        		d = (char)('a' + c - 'A');
	           	}
				cs[i] = d;
        		list.add(String.copyValueOf(cs));
        		p(cs, i+1, list);
        		cs[i] = c;
        		p(cs, i+1, list);
				break;
			}
		}
	}
	
	public List<String> letterCasePermutation(String S) {
        List<String > list = new ArrayList<String>();
        list.add(S);
        char cs[] = S.toCharArray();
        p(cs, 0, list);
        if (list.size() == 0) list.add(S);
        return list;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
