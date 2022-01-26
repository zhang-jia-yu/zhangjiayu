class Solution {
    public boolean isPowerOfThree(int n) {
        while(n % 3 == 0){
            n /= 3;
         if(n == 0){
            return false;
        }
         }
         return n == 1;
    }
}