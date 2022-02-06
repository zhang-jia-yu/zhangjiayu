class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length();
        int len2 = magazine.length();
        if (len1 > len2) {
            return false;
        }
        int[] arr1 = new int[26];
        for (int i = 0; i < len1; i++) {
            arr1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len2; i++) {
            arr1[magazine.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0){
                return false;
            }
        }
        return true;
    }
}