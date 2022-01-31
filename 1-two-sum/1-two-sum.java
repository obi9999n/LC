class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] array = new int[2];
        
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement) == true){
                array[0] = i;
                array[1] = map.get(complement);
                break;
            }
            map.put(nums[i], i);
        }
        
        return array;
    }
}