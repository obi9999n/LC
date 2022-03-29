class Solution {
    public String interpret(String command) {
        String newString = "";
        
        //declare stack and iterate through command    
        int i = 0;
        
        while(i < command.length()){
            char nextChar;
            if(command.charAt(i) == 'G'){
                newString = newString + Character.toString('G');
                i++;
            } else if(command.charAt(i) == '('){
                nextChar = command.charAt(i + 1);
                if (nextChar == ')'){
                    newString = newString + Character.toString('o');
                    i = i + 2;
                } else {                      //next char is "a"
                    newString = newString + "al";
                    i = i + 4;
                }
            }
        }
        
        return newString;
        
    }
}