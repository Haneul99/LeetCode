class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean check=true;
        if(n<=0) check=false;
        while(n/2>=1) {
        	if(n%2==1 && n!=1) {
        		check=false;
        		break;
        	}
        	else n/=2;
        }
        return check;
    }
}

/*
231. Power of Two
https://leetcode.com/problems/power-of-two/

Given an integer n, write a function to determine if it is a power of two.
*/