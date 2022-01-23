class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = n-1;
        for(int i=sum;i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
            for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;             
                }
                return digits;
            }
        }
     int[] newdigits = new int[n +1];
                    newdigits[0] = 1;
                    return newdigits;
    }
} 