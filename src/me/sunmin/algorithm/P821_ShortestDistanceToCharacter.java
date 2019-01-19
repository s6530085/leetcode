package me.sunmin.algorithm;
//https://leetcode.com/problems/shortest-distance-to-a-character
//Runtime: 8 ms, faster than 53.83% of Java online submissions for Shortest Distance to a Character.

public class P821_ShortestDistanceToCharacter {
	public int[] shortestToChar(String S, char C) {
        char[] cs = S.toCharArray();
        int[] distance = new int[cs.length];
        for (int i = 0; i < cs.length; i++) {
            char cur = cs[i];
            if (cur != C) {
                int space = 1;
                while (true) {
                    int leftIndex = i-space;
                    int rightIndex= i+space;
                    if ((leftIndex >= 0 && cs[leftIndex] == C) ||
                        (rightIndex < cs.length && cs[rightIndex] == C) ) {
                        break;
                    }
                    space++;
                }
                distance[i] = space;
            }
        }
        return distance;
    }
}
