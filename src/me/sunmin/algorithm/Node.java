package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
	public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
    
    private static void p(int remain, List<Integer>l, List<List<Integer>>list) {
//    	if (remain == 1) {
//    		l.add(remain);
//    		list.add(l);
//    	}
    	for (int i = 2; i < remain; i++) {
    		if (remain%i==0) {
    			List<Integer> nl = new ArrayList<Integer>(l);
    			nl.add(i);
    			
    			List<Integer> nnl = new ArrayList<Integer>(nl);
    			nnl.add(remain/i);
    			list.add(nnl);
    			
    			p(remain/i, nl, list);
    		}
    	}
    }
    
    
    public static void main(String[] args) {
    	List<List<Integer>>list = new ArrayList<List<Integer>>();
    	int remain = 16;
//    	list.add(Arrays.asList(new Integer[] {1, remain}));
//    	list.add(Arrays.asList(new Integer[] {remain, 1}));
    	p(remain, new ArrayList<Integer>(), list);
    }
    
    
    
}
