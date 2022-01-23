class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
         int sum = nums[0];
          int max = sum;
         for(int i=1;i<n;i++){
             if(sum>0){
                 sum += nums[i];
             }else{
                sum = nums[i];
             }
             max = Math.max(sum,max);
         }
         return max;
    }
}