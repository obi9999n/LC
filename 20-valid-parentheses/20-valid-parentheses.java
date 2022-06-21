class Solution {
    public boolean isValid(String s) {
        
        //map containing pairs of parentheses for lookup
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        //create stack
        Stack<Character> stack = new Stack<Character>();
        
        //loop through string
        int i = 0;
        while(i < s.length()){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            } else if(map.containsKey(s.charAt(i)) == false && stack.isEmpty() == false){
                //check if parentheses match, if no match, return false
                if(map.get(stack.peek()) != s.charAt(i)){
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                return false;
            }
            i++;
        }

        return stack.isEmpty();
    }
}