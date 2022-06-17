class Solution {
    public int pivotIndex(int[] nums) {
        //edge case if length is 1
        if (nums.length == 1) return 0;
        
        int leftSum = 0;
        int rightSum = 0;
        
        //find right sum except first pivot o(n)
        for(int i = nums.length - 1; i > 0; i--){
            rightSum = rightSum + nums[i];
        }
        
        //iterate through nums from start, check if left sum == right sum
        for(int j = 0; j < nums.length; j++){
            if(j > 0){
                rightSum = rightSum - nums[j];
            }
            
            if (leftSum == rightSum) {
                return j;
            } else {
                leftSum = leftSum + nums[j];
            }
        }
        
        return -1;
    }
}