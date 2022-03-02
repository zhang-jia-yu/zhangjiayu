class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int start = 0; start < len; start++){
            if(start > 0 && nums[start] == nums[start - 1]){
                continue;
            }
            int third = len - 1;
            for(int second = start+1; second < len; second++){
                if(second > start+1 && nums[second] == nums[second - 1]){
                    continue;
                }
        while(second < third && nums[start] + nums[second] + nums[third] > 0){
            third--;
            }
            if(second == third){
                break;
            }
            if(nums[start] + nums[second] + nums[third] == 0){
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[start]);
                list.add(nums[second]);
                list.add(nums[third]);
                res.add(list); 
            }
            }
        }
        return res;
    }
}