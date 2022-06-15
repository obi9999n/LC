class Solution {
    public int findLucky(int[] arr) {
        //map tracks frecuency
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLuck = 0;
        int currLuck = 0;
        boolean hasLuck = false;
        //frecuency map created
        for(int n: arr){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        //loop determines maxLuck
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == map.get(arr[i])){
                hasLuck = true;
                maxLuck = Math.max(arr[i], maxLuck);
            }
        }
        
        if (hasLuck == false) return -1;
        return maxLuck;
    }
}