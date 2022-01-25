class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<Character>();
        
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(ch);  
            } else if (stack.isEmpty() || ch != map.get(stack.peek())) {
                return false;
            } else {
                stack.pop();
            }  
        }
                
        return stack.isEmpty();    
    }
}