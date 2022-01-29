class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        Set<Integer> dic = new HashSet<Integer>();
        for (int num : nums ) {
        //int num : nums 循环输出数组元素
          if(dic.contains(num)){
        //判断dic是否包含num
              return num;
          }
          dic.add(num);
            } 
        
        return -1;
    }
}



