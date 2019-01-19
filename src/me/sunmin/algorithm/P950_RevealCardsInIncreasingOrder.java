package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/reveal-cards-in-increasing-order/
//Runtime: 11 ms, faster than 25.93% of Java online submissions for Reveal Cards In Increasing Order.

public class P950_RevealCardsInIncreasingOrder {
	public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
		
		List<Integer>l = new ArrayList<Integer>();
		while(l.size()<deck.length) {
			if (l.size() <= 1) {
				l.add(0, deck[deck.length-l.size()-1]);
			}
			else {
				int i = l.remove(l.size()-1);
				l.add(0, i);
				l.add(0, deck[deck.length-l.size()-1]);
			}
		}
		
		int[] aa = new int[deck.length];
		for (int i = 0; i < deck.length; i++) {
			aa[i] = l.get(i);
		}
		return aa;

    }
}
