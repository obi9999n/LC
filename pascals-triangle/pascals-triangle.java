class Solution {
    public List<List<Integer>> generate(int numRows) {
        //instantiate answer list
        List<List<Integer>> answer = new ArrayList<>();
        
        //int level = 0;
        int level = 0;
        
        //create sublistlist current and add 1 to it
        //answerList.add(current);
        List<Integer> current = new ArrayList();
        current.add(1);
        answer.add(current);
        
        //level++;
        level++;
        
        //while level < numRows
            //arraylist previous = current;
            
            // current = new arraylist
            //for loop, j < level 
                //if j == 0, current.add(1)
                //else, current.add(previous.get(j - 1) + previous.get(j));
            //current.add(1)
            //level++
        
        while(level < numRows){
            List<Integer> previous = current;
            current = new ArrayList<>();
            for(int j = 0; j < level; j++){
                if(j == 0){
                    current.add(1);
                    
                } else {
                    current.add(previous.get(j - 1) + previous.get(j));
                }
            }
            current.add(1);
            answer.add(current);
            level++;
        }
        
        return answer;
        
    }
}