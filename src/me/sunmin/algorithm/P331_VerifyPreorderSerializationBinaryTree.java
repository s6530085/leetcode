package me.sunmin.algorithm;
//https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
//Runtime: 13 ms, faster than 13.87% of Java online submissions for Verify Preorder Serialization of a Binary Tree.
// todosm
public class P331_VerifyPreorderSerializationBinaryTree {
	
	public boolean isValidSerialization(String preorder) {
		while (!preorder.equals("#")) {
			String s = preorder.replaceAll("\\d+,#,#", "#");
			if (s.length() == preorder.length()) return false;
			preorder = s;
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		P331_VerifyPreorderSerializationBinaryTree b = new P331_VerifyPreorderSerializationBinaryTree();
		boolean bb = b.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
	}
}
