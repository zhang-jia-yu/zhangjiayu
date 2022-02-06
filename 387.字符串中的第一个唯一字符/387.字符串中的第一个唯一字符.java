class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < len; i++) {
            arr[s.charAt(i) - 'a']++;   //计算每个字母出现的次数;
        }
        for (int i = 0; i < len; i++) {
            if (arr[s.charAt(i)- 'a']  == 1){
            return i;
            }
        }
        return -1;
    }
}