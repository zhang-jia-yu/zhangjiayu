class Solution {
    public boolean isAnagram(String s, String t) {
    int len1 = s.length();
    int len2 = t.length();
    boolean flag = false;
    if(len1 != len2){
        return flag;
    }
        char[] st = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(ts);
        if (Arrays.equals(st, ts)){
            flag = true;
            return flag;
        }
        return flag;
    }
}