class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        //edge case: if s.length == 1 or 2
        if (s.length() == 1)return 1;
        if (s.length() == 2) return 2;
        
        //max is at least two with string length of > 2
        //hashmap tracking distinct characters
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(s.charAt(0), 1);
        map.put(s.charAt(1), map.getOrDefault(s.charAt(1), 0) + 1);
        int mapLength = 1;
        int currLength = 2;
        int maxLength = 0;
        
        
        //two pointers
        int i = 0;
        int j = 2;
        
        //loop through
        while (j < s.length()){
            char c = s.charAt(j);
            
            if(map.containsKey(c)){
                currLength++;
                j++;
            } else if(!map.containsKey(c) && map.size() < 2){
                map.put(c,1);
                currLength++;
                j++;
            } else {
                maxLength = Math.max(maxLength, currLength);
                map.clear();
                i++;
                j = i + 1;
                map.put(s.charAt(i), 1);
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                currLength = 2;
                j++;
            }
        }
        
        maxLength = Math.max(maxLength, currLength);
        return maxLength;
    }
}