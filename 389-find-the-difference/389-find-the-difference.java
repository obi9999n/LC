class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char character = '0';
        
        //add all characters of string s to map
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char x: t.toCharArray()){
            if (map.containsKey(x)){
                if (map.get(x) == 1){
                    map.remove(x);    
                } else {
                    map.put(x, map.get(x) - 1);
                }
            } else{
                character = x;
                break;
            }
        }
        
        return character;
        
        
    }
}