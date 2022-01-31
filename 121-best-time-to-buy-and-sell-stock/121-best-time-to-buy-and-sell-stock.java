class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1){
            return 0;
        } 
        
        int lowestPrice = prices[0];
        int highestPrice = prices[0];
        int profit = 0;
        int lastNum = 0;
        
        for(int i = 1; i < prices.length; i++){
            int num = prices[i];
            lowestPrice = Math.min(num, lowestPrice);
            
            profit = Math.max(profit, prices[i] - lowestPrice);
        }
        
        if(profit <= 0){
            return 0;
        }
        
        return profit;
    }
}