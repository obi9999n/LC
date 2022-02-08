class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        
        int volume = (r - l) * Math.min(height[l], height[r]);
        
        while (l < r){
            if (height[l] <= height[r]){
                l++;
            } else {
                r--;
            }
            int tempVol = (r - l) * Math.min(height[l], height[r]);
            volume = Math.max(volume, tempVol);
        }
        
        return volume;
    }
}