package me.sunmin.algorithm;

public class P470_ImplementRand10UsingRand7 {
	static double rd[] = new double[] {0.7, 1.4, 2.1, 2.8, 3.5, 4.2, 4.9, 5.6, 6.3, 7};
	public int rand10() {
        double d = rand7()/10.0;
        for (int i = 0; i < rd.length; i++) {
        	if (d <= rd[i]) return i+1;
        }
        return 0;
    }
	
	
	public int rand7() {
        return 0;
    }
}