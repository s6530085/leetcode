package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/restore-ip-addresses/
//Runtime: 2 ms, faster than 85.96% of Java online submissions for Restore IP Addresses.

public class P093_RestoreIPAddresses {
	
	private int p(String s, int i, int j) {
		if (j - i > 3) return -1;
		String ss = s.substring(i,  j);
		int v = Integer.valueOf(ss);
		if (v == 0 && ss.length()==1) {
			return 0;
		}
		else if (v > 0 && !ss.startsWith("0")) {
            if (v <= 255){
			    return v;
		    }
            else {
                return -1;
            }
		}
		else {
			return -1;
		}
	}
	
	public List<String> restoreIpAddresses(String s) {
		List<String>list = new ArrayList<String>();
		int length = s.length();
		for (int i = 1; i < length - 2; i++) {
			if (i > 3) break;
			for (int j = i + 1; j < length - 1; j++) {
				if (j > i + 3) break;
				for (int k = j + 1; k < length; k++) {
					if (k > j + 3) break;
					int i1 = p(s, 0, i);
					if (i1 == -1) {
						continue;
					}
					int i2 = p(s, i, j);
					if (i2 == -1) {
						continue;
					}
					int i3 = p(s, j, k);;
					if (i3 == -1) {
						continue;
					}
					int i4 = p(s, k, s.length());
					if (i4  == -1) {
						continue;
					}
					list.add("" + i1 + "." + i2 + "." + i3 + "." + i4);
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		P093_RestoreIPAddresses a = new P093_RestoreIPAddresses();
		List<String> l = a.restoreIpAddresses("0000");
	}
}
