class Solution {
    public int maxProfit(int[] prices) {
        //edge case 
        if (prices.length < 2) return 0;
        
        int i = 0;
        int j = 1;
        int maxProfit = 0;
        int currProfit = 0;
        
        while (j < prices.length){
            if(prices[i] <= prices[j]){
                currProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currProfit);
                j++;
            } else {
                i = j;
                j = i + 1;
            }
        }
        
        return maxProfit;
        
    }
}