import java.util.*;

class Solution {
	
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7};
		rotate(nums,3);
	}
	
    public static void rotate(int[] nums, int k) {
        LinkedList <Integer> list=new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++) {
        	list.add(nums[i]);
        }
        for(int i=0;i<k;i++) {
        	list.addFirst(list.getLast());
        	list.removeLast();
        }
        for(int i=0;i<nums.length;i++) {
        	System.out.println(list.getFirst());
        	list.removeFirst();
        }
        
    }
}

/*
189. Rotate Array
https://leetcode.com/problems/rotate-array/

Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/