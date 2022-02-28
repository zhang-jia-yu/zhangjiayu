class Solution {
    public int singleNumber(int[] nums) {
        int end = 0;
        for(int num : nums){
            end ^= num;     //异或运算，0^1=1; 0^0=0;1^1=0;1^0=0;
        }
        return end;
    }
}