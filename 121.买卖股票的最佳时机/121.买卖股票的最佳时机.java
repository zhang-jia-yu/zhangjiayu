class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxnum = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len && prices[j] > prices[i]; j++) {
                int target = prices[j] - prices[i];
                if (prices[j] - prices[i] > maxnum ){
                    maxnum = target;
                }
            }
        }
        return maxnum;
    }
}