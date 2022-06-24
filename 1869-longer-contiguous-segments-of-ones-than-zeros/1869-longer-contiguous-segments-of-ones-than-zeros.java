class Solution {
    public boolean checkZeroOnes(String s) {
        int currOnes = 0;
        int maxOnes = 0;
        int maxZeros = 0;
        int currZeros = 0;
        
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '1'){
                //if char is one, start calculating ones
                while(i < s.length() && s.charAt(i) == '1'){
                    currOnes++;
                    i++;
                }
                //if i = s.length() 
                if(i == s.length()) {
                    break;
                } else {
                    maxOnes = Math.max(maxOnes, currOnes);
                    currOnes = 0;
                }
            } else {
                //calculate zeros
                while(i < s.length() && s.charAt(i) == '0'){
                    currZeros++;
                    i++;
                }
                //if i = s.length() 
                if(i == s.length()) {
                    break;
                } else {
                    maxZeros = Math.max(maxZeros, currZeros);
                    currZeros = 0;
                }
                
            }
        }
        //if last element in array is 1, math.max on ones pair , else zeros pair
        if(s.charAt(s.length() - 1) == '1'){
            maxOnes = Math.max(maxOnes, currOnes);
        } else {
            maxZeros = Math.max(maxZeros, currZeros);
        }
        
        
        if(maxOnes > maxZeros) return true;
        return false;
    }
}