package me.sunmin.algorithm;

//https://leetcode.com/problems/maximum-product-of-word-lengths/
//Runtime: 9 ms, faster than 98.48% of Java online submissions for Maximum Product of Word Lengths.

public class P318_MaximumProductWordLengths {
	
	public int maxProduct(String[] words) {
        
        int[] bits = new int[words.length];
        for (int i = 0; i < words.length; i++) {
        	char cs[] = words[i].toCharArray();
        	int ic = 0;
        	for (char c : cs) {
        		ic |= 1 << (c - 'a');
        	}
        	bits[i] = ic;
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
        	for (int j = i+1; j < words.length; j++) {
        		if ((bits[i] | bits[j]) == (bits[i] + bits[j])) {
        			max = Math.max(max, words[i].length() * words[j].length());
        		}
        	}
        }
        
        return max;
    }
}
