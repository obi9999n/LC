class Solution {
    public int maxPower(String s) {
        //edge case
        if(s.length() == 1){
            return 1;
        }
        //minimum is 1 no mater what
        int maxPow = 1;
        int currPow = 1;
        //hashmap to track unique char & two pointer solution
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 1;
        map.put(s.charAt(0), 1);
        
        //loop through string
        while (j < s.length()){
            if(map.containsKey(s.charAt(j))){
                currPow++;
            } else {
                maxPow = Math.max(maxPow, currPow);
                map.remove(s.charAt(i));
                i = j;
                map.put(s.charAt(i), 1);
                currPow = 1;
            }
            
            maxPow = Math.max(maxPow, currPow);
            j++;
            
        }
        
        return maxPow;
    }
}