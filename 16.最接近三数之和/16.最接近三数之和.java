class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int best = 100000;
        if(len == 2){
            return nums[0] + nums[1] + nums[2];
        }
        for(int i = 0; i < len; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1, k = len- 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                if(Math.abs(sum - target) < Math.abs(best - target)){
                    best = sum;
                }
                if(sum > target){
                    int k0 = k - 1;
                    while(k0 > 0 && nums[k0] == nums[k]){
                        k0--;

                    }
                    k = k0;
                }else{
                    int j0 = j + 1;
                    while(j0 < k && nums[j0] == nums[j]){
                        j0++;
                    }
                    j = j0;
                }
            } 
        }
        return best;
    }
}