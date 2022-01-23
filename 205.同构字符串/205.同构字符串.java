class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> st = new HashMap<>();
        Map<Character,Character> ts = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (st.containsKey(x) && st.get(x) != y || ts.containsKey(y) && ts.get(y) != x){
                return  false;
            }
            st.put(x , y);
            ts.put(y , x);
        }
        return true;
    }
}


建立表,实现对应相等
