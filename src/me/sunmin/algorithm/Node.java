package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
	public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
    
    private static void p(int i, int[]lines, int[] values) {
    	if (i == lines.length) return;
    	int max = Integer.MIN_VALUE;
    	List<Integer> l = new ArrayList<Integer>();
    	for (int j = 0; j < i; j++) {
    		if (values[j] > max) {
    			max = values[j];
    			l.clear();
    			l.add(j);
    		}
    		else if (values[j] == max) {
    			l.add(j);
    		}
    	}
    	for (int j : l) {
    		if (lines[i] > lines[j]) {
    			max++;
    			break;
    		}
    	}
    	values[i] = max;
    	p(i+1, lines, values);
    }
    
    
    public static void main(String[] args) {
    	int lines[] = {1, 7, 3, 5, 9, 4, 8};
    	int values[] = new int[lines.length];
    	values[0] = 1;
    	p(1, lines, values);
    	int i = values[lines.length-1];
    }
    
    
    
}
