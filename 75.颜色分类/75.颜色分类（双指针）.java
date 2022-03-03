class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int start = 0, end = len - 1;
        for(int i = 0; i < len; i++){
            while(i < end && nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }

        } 
    }
}