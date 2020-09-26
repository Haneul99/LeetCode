class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int dp[]=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length && i<3;i++){
            dp[i]=nums[i];
            if(max<dp[i]) max=dp[i];
        }
        if(nums.length>2){
        dp[2]=getMax(nums[0]+nums[2],nums[1]);
    	    if(max<dp[2]) max=dp[2];
        }
        for(int i=3;i<nums.length;i++) {
        	dp[i]=getMax(dp[i-2]+nums[i],dp[i-3]+nums[i]);
        	if(max<dp[i]) max=dp[i];
        }
        return max;
    }
    public int getMax(int a, int b) {
    	if(a>=b) return a;
    	else return b;
    }
}

/*
198. House Robber
https://leetcode.com/problems/house-robber/

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
dynamic programming
ex) if visit 4, 1 or 2 can be the previous house
*/