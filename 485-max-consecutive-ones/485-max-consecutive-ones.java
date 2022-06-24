class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int currSum = 0;
        int i = 0;
        
        //loop through array to dynamically find max
        while(i < nums.length){
            if(nums[i] == 1){
                currSum++;
                i++;
            } else {
                maxSum = Math.max(currSum, maxSum);
                currSum = 0;
                i++;
            }
        }
        
        maxSum = Math.max(currSum, maxSum);  
        
        return maxSum;
    }
}