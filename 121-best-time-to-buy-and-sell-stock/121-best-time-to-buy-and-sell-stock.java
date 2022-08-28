class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        int i = 0;
        int j = 1;
        while(j < prices.length){
            int currProfit = prices[j] - prices[i];
            //found a new low
            if (currProfit < 0){
                i = j;
                j++;
            } else {
                maxProfit = Math.max(maxProfit, currProfit);
                j++;
            }
        }
        
        return maxProfit;
    }
}