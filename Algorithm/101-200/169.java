class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	if(hashMap.containsKey(nums[i])) {
        		int value=hashMap.get(nums[i])+1;
        		hashMap.put(nums[i],value);
        	}
        	else hashMap.put(nums[i], 1);
        }
        Set set=hashMap.keySet();
        int key=0;
        Iterator iterator=set.iterator();
        while(iterator.hasNext()) {
        	key=(int)iterator.next();
        	if(hashMap.get(key)>nums.length/2) break;
        }
        return key;
    }
}

/*
169. Majority Element
https://leetcode.com/problems/majority-element/

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.


element = key, appears = value
if value > length of array/n -> majority element
*/