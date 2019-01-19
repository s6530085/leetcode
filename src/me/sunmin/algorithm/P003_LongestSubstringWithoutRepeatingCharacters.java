package me.sunmin.algorithm;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Given a string, find the length of the longest substring without repeating characters.
//Runtime: 30 ms, faster than 98.48% of Java online submissions for Longest Substring Without Repeating Characters.

public class P003_LongestSubstringWithoutRepeatingCharacters {
	
	static public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int currentLength = 0;
        int begin = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
        	int existIndex = end;
        	char c = s.charAt(i);
        	for (int j = begin; j < end; j++) {
        		if (s.charAt(j) == c) {
        			existIndex = j;
        			break;
        		}
        	}
        	// 如果存在比较麻烦，可能还得记下之前的最长值
        	if (existIndex != end) {
        		if (currentLength > maxLength) {
        			maxLength = currentLength;
        		}
        		begin = existIndex + 1;
        		currentLength = end + 1 - begin;
        	}
        	else {
        		currentLength++;
        	}
        	end++;
        }
        
        return Math.max(currentLength, maxLength);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = P003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" ");
		a = P003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
		a = P003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
		a = P003_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdefa");
	}

}
