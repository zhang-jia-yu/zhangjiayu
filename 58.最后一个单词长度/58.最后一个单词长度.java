class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        int sum = 0;
        if(s.length() == 0){
            sum++;
        }
        while ( s.charAt(len) == ' '){
            len--;
        }
        while ( len >= 0 && s.charAt(len) != ' '){
            sum++;
            len--;
        }
        return sum;
       }
}