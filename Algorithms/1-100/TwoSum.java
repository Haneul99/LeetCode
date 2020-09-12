class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        boolean check=false;
        int i;
        int j=1;
        for(i=0; i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) check=true;
                if(check==true) break;
            }
            if(check==true) break;
        }
        int[] result={i,j};
        return result;
    }
}
