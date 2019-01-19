package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/uncommon-words-from-two-sentences/
//Runtime: 10 ms, faster than 38.63% of Java online submissions for Uncommon Words from Two Sentences.
// todosm
public class P884_UncommonWordsFromTwoSentences {
	public String[] uncommonFromSentences(String A, String B) {
        String[] as = A.split(" ");
		String[] bs = B.split(" ");

		List<String> la = new ArrayList<String>(Arrays.asList(as));
		List<String> lb = Arrays.asList(bs);
		
		la.addAll(lb);

		Set<String> set = new HashSet<String>();
		Set<String> removedSet = new HashSet<String>();
		for (String s : la) {
			if (!set.contains(s) && !removedSet.contains(s)) {
				set.add(s);
			}
			else if (set.contains(s)) {
				set.remove(s);
				removedSet.add(s);
			}
		}
		return set.toArray(new String[0]);

    }
}
