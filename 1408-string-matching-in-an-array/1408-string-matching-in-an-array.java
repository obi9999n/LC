class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<String>();  
        int included = 0;
        
        Map<String, String> map = new HashMap<>();
        for (String w : words){
            map.put(w, w);
        }
        
        for (int i = 0; i < words.length; i++){
            String curr = words[i];
            
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains(curr)) included++;
            } 
            
            if (included > 1) list.add(curr);
            included = 0;
            
        }
        return list;
    }
}