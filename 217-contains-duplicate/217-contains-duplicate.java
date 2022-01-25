class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int x: nums){
            if(map.containsKey(x)){
                return true;
            }
            map.put(x,x);    
        }
        
        return false;
    }
}