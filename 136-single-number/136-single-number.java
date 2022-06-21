class Solution {
    public int singleNumber(int[] nums) {
        //edge case
        if(nums.length == 1) return nums[0];
        
        //sort array
        Arrays.sort(nums);
        
        int i = 0;
        int j = 1;
        
        while (j < nums.length){
            if(nums[i] != nums[j]) return nums[i];
            
            i = i + 2;
            j = j + 2;
        }
        
        return nums[i];
    }
}