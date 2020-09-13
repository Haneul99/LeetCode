
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
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int middle=nums.length/2+1;
        return makeTree(nums,0,nums.length-1);
    }
    public TreeNode makeTree(int[] nums,int left, int right) {
    	if(left>right) return null;
    	int middle=(right-left)/2+left;
    	TreeNode node=new TreeNode(nums[middle]);
    	node.left=makeTree(nums,left,middle-1);
    	node.right=makeTree(nums,middle+1,right);
    	return node;
    }
}

/*
108. Convert Sorted Array to Binary Search Tree
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/


middle is root....
middle index 0~middle-1, middle+1~n
get middle
recursive
*/