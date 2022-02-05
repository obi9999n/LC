class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1){
            return false;
        }
        //edge case
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        Stack<Character> stack = new Stack<Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char top;
            if (map.containsKey(c)){
                stack.push(c);
            } else if (stack.isEmpty()){
                    return false;   
            } else {
                top = stack.peek();
                if (map.get(top) == c){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
        
    }
}