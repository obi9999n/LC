class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
        
    }
    
    /*int mismatch = 0;
        int [] arr = new int[heights.length];
        int j = 0;
        
        for(int i: heights){
            arr[j] = i;
            j++;
        }
        
        Arrays.sort(arr);
        j = 0;
        int x = 0;
        
        while(j < arr.length){
            if(arr[j] != heights[x]){
                mismatch++;
                j++;
                x++;
            }
        }
        
        return mismatch;*/
}