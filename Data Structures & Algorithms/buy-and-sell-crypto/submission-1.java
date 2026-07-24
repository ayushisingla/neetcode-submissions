class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, left = 0, right = left+1;
        while(right < prices.length) {
            if(prices[left] > prices[right]) {
                left = right;
                right = left+1;
            } else {
                if(prices[right] - prices[left] > max) {
                max = prices[right] - prices[left];
                }
                right++;
            }
        }
        return max;
    }
}
