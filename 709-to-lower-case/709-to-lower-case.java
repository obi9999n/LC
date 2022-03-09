class Solution {
    public String toLowerCase(String s) {
        String newString = "";
        
        for(int i = 0; i < s.length(); i++){
            newString = newString + Character.toString(Character.toLowerCase(s.charAt(i)));
        }
        
        return newString;
    }
}