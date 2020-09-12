class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
            if(nums[i]>target) return i;
        }
        return i;
    }
}

/*
i) sorted array에 target value가 있는 경우
해당 index를 반환
ii) sorted array에 target value가 없는 경우
들어갈 자리의 index를 반환

어떻게 탐색할 것인가. 일단 순차탐색. 그리고 target value보다 큰 수가 등장할 때 중지.
없다는 의미이므로 그 index를 반환.

*/