package me.sunmin.algorithm;
//https://leetcode.com/problems/robot-return-to-origin/
//Runtime: 14 ms, faster than 64.53% of Java online submissions for Robot Return to Origin.


public class P657_RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
        int upAndDown = 0;
		int leftAndRight = 0;
		char []cs = moves.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c == 'U') {
				upAndDown++;
			}
			else if (c == 'D') {
				upAndDown--;
			}
			else if (c == 'L') {
				leftAndRight++;
			}
			else if (c == 'R') {
				leftAndRight--;
			}
		}
		return upAndDown==0 && leftAndRight==0;

    }
}
