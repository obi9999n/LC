class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int ans = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            if (currSum < 0){
                currSum = 0;
            }
            
            currSum = currSum + nums[i];
            ans = Math.max(currSum, ans);
        }
        
        return ans;
    }
}