class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int start = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == 0){
                int target = nums[i];
                nums[i] = nums[start];
                nums[start] = target;
                start++;
            }
        }
        for(int i = start; i < len; i++){
            if(nums[i] == 1){
                int target = nums[i];
                nums[i] = nums[start];
                nums[start] = target;
                start++;
            }
        }
        System.out.print(nums);
    }
}