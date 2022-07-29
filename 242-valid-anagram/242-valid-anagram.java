class Solution {
    public boolean isAnagram(String s, String t) {
        //edge case 
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        //loop through s and t, put the chars in respective maps
        
        //s loop
        
        for(char c: s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        
        //t loop
        for(char c: t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        
        return sMap.equals(tMap);
    }
}