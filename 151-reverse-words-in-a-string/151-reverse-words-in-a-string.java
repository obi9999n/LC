class Solution {
    public String reverseWords(String s) {
        //clean the string 
        String newStr = clean(s);
        String ans = "";
        
        Stack<String> st = new Stack<String>();
        int i = 0;
        int j = 0;
        boolean buildingWord = false;

        
        while(i < newStr.length() && j < newStr.length()){
            if(newStr.charAt(j) != ' '){
                j++; 
            } else {
                st.push(newStr.substring(i, j));
                st.push(" ");
                i = j + 1;
                j = i;
            }
        }
        
        st.push(newStr.substring(i, j));
        
        while(!st.isEmpty()){
            ans = ans + st.pop();
        }
        
        return ans;
    }
    
    public String clean(String str){
        String cleanedStr = "";
        boolean copyChars = false;
        int i = 0;
        int strLen = 0;
        
        while (i < str.length()){
            if(str.charAt(i) != ' '){
                copyChars = true;
            } 
            
            if(copyChars == true && str.charAt(i) != ' '){
                cleanedStr = cleanedStr + str.charAt(i); 
            } else if (copyChars == true && str.charAt(i) == ' '){
                cleanedStr = cleanedStr + " "; 
                copyChars = false;
            }
            
            i++;
        }
        
        //gets hanging space at end if applicable
        if(cleanedStr.charAt(cleanedStr.length() - 1) == ' '){
            cleanedStr = cleanedStr.substring(0, cleanedStr.length() - 1);
        }
        
        return cleanedStr;
    }
}