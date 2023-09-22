class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if we find a lower price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate the profit if we sell at the current price
            // and update the max profit if it's greater
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        
        return maxProfit;
    }
    
}