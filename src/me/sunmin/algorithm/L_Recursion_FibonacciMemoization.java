package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

public class L_Recursion_FibonacciMemoization {
	
	private Map<Integer, Integer>map = new HashMap<Integer, Integer>();
	
	public int fib(int N) {
        if (map.containsKey(N)) return map.get(N);
        int value = 0;
        if (N <= 1) value = N;
        else value = fib(N-1) + fib(N-2);
        map.put(N, value);
        return value;
    }
}
