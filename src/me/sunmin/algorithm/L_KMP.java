package me.sunmin.algorithm;

public class L_KMP {


	public int kmp(String s, String p) {
		char[] cs = s.toCharArray();
		char[] ps = p.toCharArray();
		int next[] = getNext(ps);
		int i = 0;
		int j = 0;
		while (i < cs.length && j < ps.length) {
			if (cs[i] == ps[j]) {
				i++;
				j++;
			}
			else {
				j = next[j];
				if (j == -1) {
					j = 0;
					i++;
				}
			}
		}
		if (j == ps.length) return i-j;
		return -1;
	}
	
	public int[] getNext(char []cs) {
		if (cs.length == 0) return new int[] {-1};
		int next[] = new int[cs.length];
		next[0] = -1;
		int i = 0, j = -1;

		while (i < cs.length-1)
		{
			if (j == -1) {
				i++;
				j = 0;
				next[i] = j;
			}
			else if (cs[i] == cs[j])
			{
				i++;
				j++;
				next[i] = j;
			}	
			else {
				j = next[j];
			}
		}		
		return next;
	}
	
	
	public static void main(String[] args) {
		L_KMP k = new L_KMP();
		int i = k.kmp("ababababca", "ababca");
		i = "".indexOf("");
		i = k.kmp("ababababac", "abad");
		i = k.kmp("abcd", "abac");
		i = k.kmp("ababababac", "abac");
	}
		
	
}
