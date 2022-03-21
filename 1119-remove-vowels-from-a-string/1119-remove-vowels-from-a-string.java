class Solution {
    public String removeVowels(String s) {
        //put every vowel in map
        HashMap<Character,Character> map = new HashMap<>();
        
        map.put('a', 'a');
        map.put('e', 'e');
        map.put('i', 'i');
        map.put('o', 'o');
        map.put('u', 'u');
        
        String newString = "";
        for (int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                newString = newString + Character.toString(s.charAt(i));
            }
        }
        
        return newString;
    }
}