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

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
    	if(root.left==null && root.right==null && sum-root.val==0) return true;
        else return (hasPathSum(root.left, sum-root.val) || hasPathSum(root.right,sum-root.val));
    }
}
/*
recursive
sum-root.val until has no child
if has no child and has target sum : return true
*/