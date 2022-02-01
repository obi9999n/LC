class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1){
            return 0;
        }
        int profit = 0;
        int lowestPrice = prices[0];
        
        
        
        for (int i = 1; i < prices.length; i++){
            lowestPrice = Math.min(lowestPrice, prices[i]);
            profit = Math.max(profit, prices[i] - lowestPrice);
        }
        
        if (profit <= 0){
            return 0;
        }
        
        return profit;
    }
}