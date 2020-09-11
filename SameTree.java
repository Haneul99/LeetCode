//Definition for a binary tree node.
class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode() {}
	 TreeNode(int val) { this.val = val; }
	 TreeNode(int val, TreeNode left, TreeNode right) {
		 	this.val = val;
		 	this.left = left;
		 	this.right = right;
	 }
}

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        else if(p==null || q==null) return false;
        if(p.val!=q.val || p.val!=q.val) return false;
        else {
        	return(isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
    }
}
/*
using recursion
if p and q are empty : true
if only one Tree is empty : false
*/