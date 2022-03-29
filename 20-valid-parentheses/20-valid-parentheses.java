class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        
        //put three types of parentheses pairs in map
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        //iterate through string 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char top;
            if (map.containsKey(c)){
                stack.push(c);   
            } else if (stack.isEmpty() && map.containsKey(c) == false){
                return false;    
            } else {
                top = stack.pop();
                if (map.get(top) != c){
                    return false;
                }
            }
        }


        
        return stack.isEmpty();
    }
}