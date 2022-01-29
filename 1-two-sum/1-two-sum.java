class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] newArray = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if (map.containsKey(complement)){
                newArray[0] = i;
                newArray[1] = map.get(complement);
            }
            map.put(nums[i], i);  
        }
        
        
        return newArray;
    }
}