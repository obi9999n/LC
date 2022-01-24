class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) return 1;
        int answer = 0;
        int j = s.length() - 1;
        
        while(j > -1 && s.charAt(j) == ' '){
            j--;
        }
        
        if (j == -1) return 0;
        
        while(j > -1 && s.charAt(j) != ' '){
            answer++;
            j--;
        }
        
        return answer;
    }
}