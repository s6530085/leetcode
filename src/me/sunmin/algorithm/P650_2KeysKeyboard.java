package me.sunmin.algorithm;
//https://leetcode.com/problems/2-keys-keyboard/
//Runtime: 4 ms, faster than 99.66% of Java online submissions for 2 Keys Keyboard.
//category:bag

public class P650_2KeysKeyboard {

	private void p(int current, int remain, int paste, int step) {
		if  (remain == 0) {
			if (step < min) {
				min = step;
			}
			return;
		}
		if (paste > remain) return;
		if (paste != current) {
			p(current, remain, current, step+1);
			p(current+paste, remain-paste, paste, step+1);
		}
		else {
			p(current+paste, remain-paste, paste, step+1);
		}
	}
	
	private int min;
	public int minSteps(int n) {
		if (n == 1)return 0;
        min = Integer.MAX_VALUE;
        p(1, n-1, 1, 1);
        return min;
    }
	
	public static void main(String[] args) {
		P650_2KeysKeyboard k = new P650_2KeysKeyboard();
		int i = k.minSteps(8);
	}
}
