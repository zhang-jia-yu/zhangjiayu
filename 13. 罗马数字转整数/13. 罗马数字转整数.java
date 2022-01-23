import java.util.HashMap;
import java.util.Map;
class Solution {
    Map<Character,Integer> map = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
}};
    public int romanToInt(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int num = map.get(s.charAt(i));
            if (i < len-1 && num < map.get(s.charAt(i+1))){
                ans -= num;
            }else {
                ans += num;
            }
        }
        return ans;
    }
}