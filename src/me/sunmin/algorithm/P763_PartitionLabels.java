package me.sunmin.algorithm;
//https://leetcode.com/problems/partition-labels/
//Runtime: 18 ms, faster than 38.50% of Java online submissions for Partition Labels.
//todosm
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P763_PartitionLabels {
	public List<Integer> partitionLabels(String S) {
        List<Integer> l = new ArrayList<Integer>();
		char[] cs = S.toCharArray();
		Map<Character,Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (m.get(c) == null) {
				for (int j = cs.length - 1; j >= i; j--) {
					if (cs[j] == c) {
						m.put(c, j);
						break;
					}
				}
			}
		}
		
		int begin = 0;
		boolean inCircle = false;
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			int far = m.get(c);
			if (inCircle == false && far == i) {
				l.add(1);
				begin = far+1;
				continue;
			}
			inCircle = true;
			for (int j = i + 1; j <= far; j++) {
				int tempFar = m.get(cs[j]);
				if (tempFar > far) {
					far = tempFar;
				}
				if (j == far) {
					int length = far-begin+1;
					l.add(length);
					i = far;
					begin = far+1;
					inCircle = false;
				}
			}
		}
		return l;

    }
}
