class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            int a = (columnNumber - 1) % 26 + 1;
            sb.append((char)(a - 1 + 'A'));
            columnNumber = (columnNumber - a) / 26;
        }
        return sb.reverse().toString();
    }
}
