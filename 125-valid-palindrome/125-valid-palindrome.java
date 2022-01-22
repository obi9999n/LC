class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        String alpha = "abcdefghijklmnopqrstuvwxyz0123456789";
        String s2 = "";
        for (char ch: s.toLowerCase().toCharArray()){
            if (alpha.indexOf(ch) > -1){
                s2 = s2 + Character.toString(ch);
            }
        }
        String s3 = s2;
        StringBuilder sb = new StringBuilder();
        sb.append(s2);
        
        int i = 0;
        int j = s2.length() - 1;
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j)); 
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        
        s2 = sb.toString();
        
        return s2.equals(s3);
        
    }
}