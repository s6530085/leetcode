package me.sunmin.algorithm;
//https://leetcode.com/problems/fibonacci-number/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Fibonacci Number.

public class P509_FibonacciNumber {
	public int fib(int N) {
        if (N == 0) {
			 return 0;
		 }
		 else if (N == 1){
			 return 1;
		 }
		 else {
			 int last2 = 0;
			 int last1 = 1;
			 for (int i = 2; i <= N; i++) {
				 int temp = last1 + last2;
				 last2 = last1;
				 last1 = temp;
			 }
			 return last1;
		 }

    }
}
