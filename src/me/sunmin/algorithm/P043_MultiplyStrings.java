package me.sunmin.algorithm;
//https://leetcode.com/problems/multiply-strings/
//Runtime: 22 ms, faster than 25.71% of Java online submissions for Multiply Strings.
//todosm

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P043_MultiplyStrings {
	public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
       	return "0";
       }
       
       char ns1[] = num1.toCharArray();
       char ns2[] = num2.toCharArray();

       List<String>list = new ArrayList<String>();
       Map<Character, String> cache = new HashMap<Character, String>();
       for (int i = ns2.length - 1; i >= 0 ; i--) {
       	char n2 = ns2[i];
           if (n2 == '0') {
           	list.add("0");
           }
           else if (n2 == '1') {
           	list.add(new StringBuilder(num1).reverse().toString());
           }
           else {
           	String r = cache.get(n2);
           	if (r != null) {
           		list.add(r);
           	}
           	else {
           		StringBuilder sb = new StringBuilder();
           		int lastExceed = 0;
           		for (int j = ns1.length-1; j >= 0; j--) {
           			char n1 = ns1[j];
           			int m = (n1 - '0') * (n2 - '0') + lastExceed;
           			sb.insert(0, m%10);
           			lastExceed = m / 10;
           		}
           		if (lastExceed > 0) {
           			sb.insert(0, lastExceed);
           		}
           		String s = sb.reverse().toString();
           		cache.put(n2, s);
           		list.add(s);
           	}
           }
       }

       String added = "0";
       for (int i = 0; i < list.size(); i++) {
           String add = list.get(i);
           char addeds[] = added.toCharArray();
           char adds[] = add.toCharArray();
           char r[] = new char[Math.max(addeds.length, adds.length+i)];
           boolean exceed = false;
           for (int j = 0; j < r.length; j++) {
           	if (j < i) {
           		r[j] = addeds[j];
           	}
           	else {
           		int addedI = 0;
           		int addI = 0;
           		if (j < addeds.length && j < adds.length + i) {
           			addedI = addeds[j] - '0';
           			addI = adds[j-i] - '0';
           		}
           		else if (j >= addeds.length) {
           			addI = adds[j-i] - '0';
           		}
           		else {
           			addedI = addeds[j] - '0';
           		}
           		int d = addedI + addI + (exceed ? 1 : 0);
       			exceed = d > 9;
       			r[j] = (char) (d%10 + '0');
           	}
           }
           added =  new String(r) + (exceed ? "1" : "");
       }
       return new StringBuilder(added).reverse().toString();

   }
}
