class Solution {
    public int maxVowels(String s, int k) {
        
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // two pointer 
        int i = 0;
        int j = 0;
        int currMax = 0;
        int max = 0;
        
        //sliding window where we calculate max vowels as we go
        while (j < s.length()){
            if(j < k){
               if(set.contains(s.charAt(j))) currMax++; 
               j++; 
            } else {
                //calculate max with currMax
                max = Math.max(max, currMax);
                if(set.contains(s.charAt(j))) currMax++;
                if(set.contains(s.charAt(i))) currMax--;
                i++;
                j++;
            }
        }
        max = Math.max(max, currMax);

        return max;
    }
}