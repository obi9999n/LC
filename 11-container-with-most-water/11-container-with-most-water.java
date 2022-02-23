class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
    
        int maxArea = ((r - l) * Math.min(height[l], height[r]));
        
        while (l < r){
            if (height[l] <= height[r]){
                l++;
            } else {
                r--;
            }
            int area = ((r - l) * Math.min(height[l], height[r]));
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
        
    }
}