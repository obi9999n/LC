class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.length() == 0){
            return t.charAt(0);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < t.length(); i++){
            char x = t.charAt(i);
            if (map.containsKey(x) && map.get(x) == 1){
                map.remove(x);
            } else if(map.containsKey(x) && map.get(x) > 1) {
                map.put(x, map.get(x) - 1);    
            } else {
                return x;
            }
        }
        
        
        return 'z';
    }
}