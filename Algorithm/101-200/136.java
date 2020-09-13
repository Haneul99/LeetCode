
public class Solution {
    public int singleNumber(int[] nums) {
    	int idx=0;
    	for(int i=0;i<nums.length;i++) {
    		idx^=nums[i];
    	}
    	return idx;
    }
}

/*
136. Single Number
https://leetcode.com/problems/single-number/
*/

/*
 * every elements appears twice.
 * that means except for one, after the operation result becomes 0
 * so, the result is same as the single number
 */

/*
boolean [] check;

int idx=0;
int max=0;
for(int i=0;i<nums.length;i++) {
	if(max<nums[i]) max=nums[i];
}
check= new boolean[max+1];
for(int i=0;i<nums.length;i++) {
	check[nums[i]]=!check[nums[i]];
}
for(int i=0;i<check.length;i++) {
	if(check[i]==true) {
		idx=i;
		break;
	}
}
return idx;

in case, every elements were greater or equal than 0
*/