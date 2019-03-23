package me.sunmin.algorithm;

public class L_Recursion_Pow {

	public static double myPow(double x, int n) {
		if (x == 1) return 1;
		if (n == 0) return 1;
		if (n == 1) return x;
		if (n < 0) return 1/x * myPow(1/x, -n-1);
		return (((n & 1) == 0) ? myPow(x*2, n/2) : x* myPow(x, n/2));
    }
	
	
	public static void main(String [] args) {
		double d = myPow(2,2222222);
	}

}
