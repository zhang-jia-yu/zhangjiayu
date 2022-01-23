class Solution {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(
            Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
        );
    }
}

toBinaryString（int i）：返回int变量的二进制表示的字符串。
toHexString（int i）：返回int变量的16进制字符串。
toOctalString（int i）：返回int变量的8进制表示字符串。


parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。

运行超时
