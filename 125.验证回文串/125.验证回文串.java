class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        StringBuffer newisPalindrome = new StringBuffer();
        for (int i = 0; i < len ; i++) {
            char Char = s.charAt(i);
            if (Character.isLetterOrDigit(Char)){
                newisPalindrome.append(Character.toLowerCase(Char));
            }
        }
        int n = newisPalindrome.length();
        int start = 0;
        int end = n - 1;
        for (int i = start; i < end; i++){
            if (Character.toLowerCase(newisPalindrome.charAt(start)) != Character.toLowerCase(newisPalindrome.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}



		toLowerCase() 方法用于将大写字符转换为小写
		isLetterOrDigit该方法确定指定字符是字母还是数字
		if(Character.isUpperCase(sr1.charAt(i))){//先将String类型的字符串转换成char类型 再获取每一个字符元素，用charAt(i)实现