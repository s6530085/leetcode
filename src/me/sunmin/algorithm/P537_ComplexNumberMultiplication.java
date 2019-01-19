package me.sunmin.algorithm;
//https://leetcode.com/problems/complex-number-multiplication/
//Runtime: 13 ms, faster than 12.71% of Java online submissions for Complex Number Multiplication.
//todosm
public class P537_ComplexNumberMultiplication {
	public String complexNumberMultiply(String a, String b) {
        int index1 = a.indexOf('+');
        int a1 = Integer.parseInt(a.substring(0, index1));
        int a2 = Integer.parseInt(a.substring(index1+1, a.length()-1));
        int index2 = b.indexOf('+');
        int b1 = Integer.parseInt(b.substring(0, index2));
        int b2 = Integer.parseInt(b.substring(index2+1, b.length()-1));
        int i1 = a1*b1-a2*b2;
        int i2 = a1*b2+b1*a2;
        return String.format("%d+%di", i1, i2);
    }
}
