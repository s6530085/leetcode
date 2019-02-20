package me.sunmin.algorithm;
//https://leetcode.com/problems/nim-game/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Nim Game.

public class P292_NimGame {

	public boolean canWinNim(int n) {
        return n%4 != 0;
    }
}
