package me.sunmin.algorithm;
//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
//Runtime: 19 ms, faster than 69.30% of Java online submissions for Prime Number of Set Bits in Binary Representation.


public class P762_PrimeNumberSetBitsBinaryRepresentation {
	
	private static int primes[] = new int[] {0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0};

	private int bitOfNum(int n) {
		int num = 0;
		while(n > 0) {
			if ((n & 1) == 1) {
				num++;
			}
			n >>= 1;
		}
		return num;
	}
	
	
	public int countPrimeSetBits(int L, int R) {
		int count = 0;
        for (int i = L; i <= R; i++) {
        	count += primes[bitOfNum(i)];
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P762_PrimeNumberSetBitsBinaryRepresentation p = new P762_PrimeNumberSetBitsBinaryRepresentation();
		int i = p.countPrimeSetBits(6, 10);
		i = p.countPrimeSetBits(10, 15);
	}

}
