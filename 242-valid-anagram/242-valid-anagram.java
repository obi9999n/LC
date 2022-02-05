class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char ch: t.toCharArray()){
            if (map.containsKey(ch) == false) return false;
            if (map.get(ch) == 1){
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        
        return map.isEmpty();
        
    }
}