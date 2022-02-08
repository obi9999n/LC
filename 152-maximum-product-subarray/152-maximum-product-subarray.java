class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        
        if (nums.length == 1){
            return result;
        }
        
        
        
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            
            int tempMx = Math.max(num, Math.max(max * num, min * num));
            min = Math.min(num, Math.min(max* num, min * num));
            
            max = tempMx;
            result = Math.max(max, result);
        }
        
        return result;
        
        
        
    }
}