class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int start = 0;
        int i =0;
        while(start<n){
            if(nums[start] != val){
                nums[i] = nums[start];
               i++;
            }
            start++;
        }
        // for(int i=0;i<n;i++){
        //     if(nums[i] != val){
        //         nums[start] = nums[i];
        //         start++;
        //     }
         return i;
        }
    }