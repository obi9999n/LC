class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        
        int i = 1;
        while(i < nums.length){
            if(currSum < 0){
                currSum = 0;
            }
            
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum, currSum);
            i++;
        }
        
        return maxSum;
    }
}