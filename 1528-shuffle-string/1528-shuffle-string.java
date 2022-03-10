class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        
        for(int i = 0; i < s.length(); i++){
            //get index and character for every element
            int num = indices[i];
            char c = s.charAt(i);
            
            sb.setCharAt(num, c);
        }
        
        return sb.toString();
    }
}