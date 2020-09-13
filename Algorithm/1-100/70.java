
class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[46];

        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }
}
/*
70. Climbing Stairs
https://leetcode.com/problems/climbing-stairs/


You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


recursive.
i) n=1) 1, n=2) 2
ii) 1 step -> n-1 recursive
iii) 2 step -> n-2 recursive
1 step + 2 step
=> fibonacci
*/