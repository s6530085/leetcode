package me.sunmin.algorithm;
//https://leetcode.com/problems/simplify-path/
//Runtime: 20 ms, faster than 35.34% of Java online submissions for Simplify Path.

import java.util.ArrayList;
import java.util.List;

public class P071_SimplifyPath {
	
	public String simplifyPath(String path) {
        String ss[]=path.split("/+");
        List<String> ls = new ArrayList<String>();
        for (String s : ss) {
        	if (s.equals(".")) {
        		
        	}
        	else if (s.equals("..")) {
        		if (!ls.isEmpty()) ls.remove(ls.size()-1);
        	}
        	else if (s.length() > 0){
        		ls.add(s);
        	}
        }
        if (ls.isEmpty()) {
        	return "/";
        }
        else {
        	String r = "";
            for (String s : ls) {
            	r = r + "/" + s;
            }
            return r;
        }
    }
	
	public static void main(String[] args) {
		P071_SimplifyPath s= new P071_SimplifyPath();
		System.out.println(s.simplifyPath("/a/../../b/../c//.//"));
	}

}
