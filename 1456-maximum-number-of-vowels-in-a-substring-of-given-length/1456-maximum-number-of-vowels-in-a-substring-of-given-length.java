class Solution {
    public int maxVowels(String s, int k) {
        //vowel map
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put('a','a');
        map.put('e','e');
        map.put('i','i');
        map.put('o','o');
        map.put('u','u');

        //two ptr sliding window solution
        int i = 0;
        int j = 0;
        int currVow = 0;
        int maxVow = 0;
        
        
        while(j < s.length()){
            if(j < k){
                //check if char at j is vowel
                if(map.containsKey(s.charAt(j))) currVow++;
                //increment j till k is reached
                j++;
            } else {
                //max substring length reached
                maxVow = Math.max(currVow, maxVow);
                
                if(map.containsKey(s.charAt(i))) {
                    currVow--;
                }
                i++;
                if(map.containsKey(s.charAt(j))) {
                    currVow++;
                }
                j++;  
            }
        }
        
        maxVow = Math.max(currVow, maxVow);
        return maxVow;
    }
}