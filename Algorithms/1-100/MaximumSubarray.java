class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        
        if(nums.length==1) return max;
        else{
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
        }
        return max;
    }
}
/*
일단 원소가 하나면 그게 maximum
두개 이상일 경우.

*/