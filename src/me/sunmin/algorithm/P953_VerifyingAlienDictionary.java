package me.sunmin.algorithm;
//https://leetcode.com/problems/verifying-an-alien-dictionary/
//Runtime: 4 ms, faster than 99.64% of Java online submissions for Verifying an Alien Dictionary.


public class P953_VerifyingAlienDictionary {
	
	public boolean isAlienSorted(String[] words, String order) {
		char[] os = order.toCharArray();
		char[][] wss = new char[words.length][];
		for (int i = 0; i < words.length; i++) {
			wss[i] = words[i].toCharArray();
		}
		for (int i = 0; i < wss.length -1 ;i ++) {
			int length = Math.min(wss[i].length, wss[i+1].length);
			boolean judged = false;
			for (int j = 0; j < length; j++) {
				char c1 = wss[i][j];
				char c2 = wss[i+1][j];
				int index1 = -1;
				int index2 = -1;
				for (int k = 0; k < os.length; k++) {
					if (os[k] == c1) {
						index1 = k;
						break;
					}
				}
				for (int k = 0; k < os.length; k++) {
					if (os[k] == c2) {
						index2 = k;
						break;
					}
				}
				if (index1 < index2) {
					judged = true;
					break;
				}
				else if (index1 == index2) {
					continue;
				}
				else {
					return false;
				}
			}
			if (!judged) {
				if (wss[i].length > wss[i+1].length) {
					return false;
				}
			}
		}
		
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P953_VerifyingAlienDictionary p = new P953_VerifyingAlienDictionary();
		boolean b = p.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz");
		b = p.isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
	}
	

}
