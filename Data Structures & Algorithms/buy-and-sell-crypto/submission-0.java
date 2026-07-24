class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        int left = 0, right = left+1;
        while(right<prices.length-1) {
            if(prices[left]>prices[right]) {
                left = right;
            } else if(prices[right] - prices[left] > max) {
                max = prices[right] - prices[left];
                System.out.println("Max changed: " + max);
            }
            right++;
        }

        return max;


    }
}
