class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        
        //make whole string lowercase
        if (title.length() == 1) return title;
        
        //edge case
        String newString = "";
        int L = title.length();
        
        int i = 0;
        int j = i;
        
        while(j < L){
            while(j != L && title.charAt(j) != ' '){
                j++;
            }
            if (j == L){
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(title.substring(i, j));
            int len = sb.length();
            if (len > 2){
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            }
            newString = newString + sb.toString() + " ";
            i = j + 1;
            j++;
        }
        
        //last word
            StringBuilder sb1 = new StringBuilder();
            sb1.append(title.substring(i, j));
            int len = sb1.length();
            if (len > 2){
                sb1.setCharAt(0, Character.toUpperCase(sb1.charAt(0)));
            }
        newString = newString + sb1.toString();
        
        return newString;
        
        
        
        
        
        
    }
}