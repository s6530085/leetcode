package me.sunmin.algorithm;
//https://leetcode.com/problems/powx-n/
//Runtime: 9 ms, faster than 98.05% of Java online submissions for Pow(x, n).

public class P050_Pow {
	public double myPow(double x, int n) {
		if (n == 0) return 1;
		if (n == 1)	return x;
		double d = myPow(x, n/2);
		if (n%2==0)	return d*d;
		if (n<0)	return d*d*(1/x);
		return d*d*x;
    }
}
