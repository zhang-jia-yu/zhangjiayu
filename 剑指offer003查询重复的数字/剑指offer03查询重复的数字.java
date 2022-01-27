class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        Set<Integer> dic = new HashSet<Integer>();
        for (int num : nums ) {
          if(dic.contains(num)){
              return num;
          }
          dic.add(num);
            } 
        
        return -1;
    }
}



