class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        
        //map | char:int
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        
        //special instances map| str:int
        Map<String, Integer> sMap = new HashMap<String,Integer>();
        sMap.put("IV", 4);
        sMap.put("IX", 9);
        sMap.put("XL", 40);
        sMap.put("XC", 90);
        sMap.put("CD", 400);
        sMap.put("CM", 900);
        
        //loop through string
        int i = 0;
        while(i < s.length() - 1){
            //check if 2 character string starting from i is in special instances
            if(sMap.containsKey(s.substring(i, i + 2))){
                answer = answer + sMap.get(s.substring(i, i + 2));
                i += 2;
            } else {
                //else, add current letter int value to answer
                answer = answer + map.get(s.charAt(i));
                i++;
            }
        }
        
        //if theres one character left to evaluate in string
        if (i < s.length()){
            answer = answer + map.get(s.charAt(i));
        }
        
        return answer;
    }
}