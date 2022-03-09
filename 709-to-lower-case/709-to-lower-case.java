class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < s.length(); i++){
            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        }
        
        return sb.toString();
    }
}