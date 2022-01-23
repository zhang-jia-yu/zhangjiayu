class Solution {
    public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            if(n == 0){
                return 0;
            }
            int start = 0;
            for(int i=0;i<n;i++){
                if(nums[i] == target){
                    start = i;
                    return start;
                }else if(nums[i] != target){
                    if(nums[i] < target){
                        start = i;
                        start++;
                    }
                }
            }
            return start;
    }
}