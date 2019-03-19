package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/serialize-and-deserialize-bst/
//Runtime: 5 ms, faster than 96.00% of Java online submissions for Serialize and Deserialize BST.
// todosm category:tree

public class P449_SerializeDeserializeBST {
	private void p(TreeNode root, StringBuilder sb) {
		if (root!=null) {
			sb.append("" + root.val + ",");
			p(root.left, sb);
			p(root.right, sb);
		}
	}
	
    public String serialize(TreeNode root) {
    	if (root == null) return "";
    	StringBuilder sb = new StringBuilder();
    	p(root, sb);
    	return sb.toString();
    }
    
    private void insertTree(TreeNode current, int value) {
    	if (value > current.val) {
    		if (current.right == null) {
    			TreeNode n = new TreeNode(value);
    			current.right = n;
    		}
    		else {
    			insertTree(current.right, value);
    		}
    	}
    	else {
    		if (current.left == null) {
    			TreeNode n = new TreeNode(value);
    			current.left = n;
    		}
    		else {
    			insertTree(current.left,value);
    		}
    	}
    }
    
    public TreeNode deserialize(String data) {
    	if (data == null || data.length() == 0) return null;
    	String s[] = data.split(",");
    	TreeNode root = new TreeNode(Integer.valueOf(s[0]));
    	for (int i = 1; i < s.length; i++) {
    		insertTree(root, Integer.valueOf(s[i]));
    	}
    	
    	return root;
    }
	
//	// Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//    	if (root == null) return "";
//    	List<TreeNode> ls = new ArrayList<TreeNode>();
//    	ls.add(root);
//    	String s = "" + root.val;
//    	while(!ls.isEmpty()) {
//    		List<TreeNode> ns = new ArrayList<TreeNode>();
//    		for (TreeNode node : ls) {
//    			if (node.left != null) {
//					s += "," + node.left.val;
//	    			ns.add(node.left);
//    			}
//				else {
//					 s += ",n";
//				}
//				if (node.right != null) {
//					s += "," + node.right.val;
//					ns.add(node.right);
//				}
//				else {
//					s += ",n";
//				}
//    		}
//    		
//    		ls = ns;
//    	}
//    	while(s.endsWith(",n")) {
//			s = s.substring(0, s.length()-2);
//		}
//    	return s;
//    }
//
//    
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//    	if (data.length() == 0) return null;
//        String[] ss = data.split(",");
//        TreeNode head = new TreeNode(Integer.valueOf(ss[0]));
//        int begin = 1;
//        int count = 2;
//        List<TreeNode> ls = new ArrayList<TreeNode>();
//        ls.add(head);
//        while(begin < ss.length) {
//        	List<TreeNode> ns = new ArrayList<TreeNode>();
//        	int newCount = 0;
//        	for (int i = begin; i < Math.min(begin + count, ss.length); i++) {
//        		TreeNode node = (TreeNode) ls.get((i-begin)/2);
//        		String nodeS = ss[i];
//        		if (!nodeS.equals("n")) {
//        			TreeNode nnode = new TreeNode(Integer.valueOf(nodeS));
//        			newCount++;
//        			ns.add(nnode);
//        			if (i % 2 == 0) {
//        				node.right = nnode;
//        			}
//        			else {
//        				node.left = nnode;
//        			}
//        		}
//        	}
//        	begin += count;
//        	count = newCount*2;
//        	ls = ns;
//        }
//        
//        return head;
//    }
//    
    
    public static void main(String[] args) {
    	
    	String  ssss[] = "1,2,3,".split(",");
    	P449_SerializeDeserializeBST s = new P449_SerializeDeserializeBST();
    	TreeNode root = s.deserialize("5,3,6,2,4,n,n,1");
    	
    	TreeNode n5 = new TreeNode(5);
    	TreeNode n3 = new TreeNode(3);
    	TreeNode n6 = new TreeNode(6);
    	TreeNode n2 = new TreeNode(2);
    	TreeNode n4 = new TreeNode(4);
    	TreeNode n1 = new TreeNode(1);
    	n5.left = n3;
    	n5.right = n6;
    	n3.left = n2;
    	n3.right = n4;
    	n2.left = n1;
    	String sss = s.serialize(n5);
    }
}
