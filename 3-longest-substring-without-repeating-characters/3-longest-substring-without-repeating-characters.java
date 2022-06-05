class Solution {
    public int lengthOfLongestSubstring(String s) {
        //if s.length() == 0 or 1
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
        //2 pointers and hashmap to check dups
        int maxLen = 1;
        int currLen = 1;
        int i = 0;
        int j = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);
        
        //loop
        while(j < s.length()){
            char c = s.charAt(j);
            if(map.containsKey(c)){
                maxLen = Math.max(currLen, maxLen);
                i++;
                j = i + 1;
                currLen = 1;
                map.clear();
                map.put(s.charAt(i), 1);
            } else {
                map.put(c, 1);
                currLen++;     
                j++;
            }
        }
        
        maxLen = Math.max(currLen, maxLen);
        return maxLen;
    }
}