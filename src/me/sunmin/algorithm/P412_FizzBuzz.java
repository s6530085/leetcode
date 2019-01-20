package me.sunmin.algorithm;
//https://leetcode.com/problems/fizz-buzz/
//Runtime: 4 ms, faster than 43.97% of Java online submissions for Fizz Buzz.

import java.util.ArrayList;
import java.util.List;

public class P412_FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				r.add("FizzBuzz");
			}
			else if (i  % 5 == 0) {
				r.add("Buzz");
			}
			else if (i % 3 == 0) {
				r.add("Fizz");
			}
			else {
				r.add("" + i);
			}
		}
		
		return r;

    }
}
