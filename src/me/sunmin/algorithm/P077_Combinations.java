package me.sunmin.algorithm;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combinations/
//Runtime: 3 ms, faster than 96.62% of Java online submissions for Combinations.

public class P077_Combinations {
	
	private void p(int begin, int n, int k, List<Integer>l, List<List<Integer>>ls) {
		if (n - begin + 1 + l.size() < k) return;
		if (l.size() == k) {
			ls.add(l);
			return;
		}
		for (int i = begin; i <= n; i++) {
			if (n - i + 1 + l.size() < k) break;
			List<Integer>ll = new ArrayList<Integer>(l);
			ll.add(i);
			p(i+1, n, k, ll, ls);
		}
	}
	
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        for (int i = 1; i <= n; i++) {
        	List<Integer> l = new ArrayList<Integer>();
        	l.add(i);
        	p(i+1, n, k, l, ls);
        }
        return ls;
    }
	
	public static void main(String[] args) {
		P077_Combinations c = new P077_Combinations();
		List<List<Integer>> l = c.combine(4, 2);
	}
}
