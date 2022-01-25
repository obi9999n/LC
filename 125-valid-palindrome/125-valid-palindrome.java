class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        s = s.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
        ArrayList<Character> list = new ArrayList<Character>();
        for(char ch: s.toCharArray()){
            if (alphabet.contains(Character.toString(ch))){
                list.add(ch);
            }
        }
        
        if (list.size() == 0) return true;
        String string = "";
        for(int i = 0; i < list.size(); i++){
            string = string + Character.toString(list.get(i));
        }
        
        
        int i = 0;
        int j = string.length() - 1;
        
        while(i < j){
            if(string.charAt(i) != string.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}