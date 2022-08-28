class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        //map to store pairs of the 3 types of parentheses
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        //while loop to analyze input string
        int i = 0;
        while(i < s.length()){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            } else if (stack.isEmpty() == false && map.containsKey(s.charAt(i)) == false){
                if(map.get(stack.peek()) == s.charAt(i)){
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
            i++;
        }

        return stack.isEmpty();
        
    }
}