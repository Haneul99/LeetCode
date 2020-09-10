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
i) sorted array�� target value�� �ִ� ���
�ش� index�� ��ȯ
ii) sorted array�� target value�� ���� ���
�� �ڸ��� index�� ��ȯ

��� Ž���� ���ΰ�. �ϴ� ����Ž��. �׸��� target value���� ū ���� ������ �� ����.
���ٴ� �ǹ��̹Ƿ� �� index�� ��ȯ.

*/