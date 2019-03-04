package me.sunmin.algorithm;
//https://leetcode.com/problems/first-bad-version/
//Runtime: 12 ms, faster than 98.78% of Java online submissions for First Bad Version.

public class P278_FirstBadVersion {
	public int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (!isBadVersion(mid)) {
				lo = mid+1;
			}
			else {
				if (mid == lo) {
					return mid;
				}
				else if (!isBadVersion(mid-1)) {
					return mid;
				}
				else {
					hi = mid - 1;
				}
			}
		}
		return -1;
    }
	
	boolean isBadVersion(int version) {
		return true;
	}
}
