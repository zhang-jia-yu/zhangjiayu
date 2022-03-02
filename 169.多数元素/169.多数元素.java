class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len / 2];
    }
}