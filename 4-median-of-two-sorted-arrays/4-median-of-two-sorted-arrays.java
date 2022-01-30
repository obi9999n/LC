class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int L1 = nums1.length;
        int L2 = nums2.length;
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        
        
        //init merged array
        int[] array = new int[L1 + L2];
        if(array.length == 0) throw new IllegalArgumentException("empty array");

        while(p1 < L1 && p2 < L2){
            if(nums1[p1] <= nums2[p2]){
                array[p] = nums1[p1];
                p1++;
            } else {
                array[p] = nums2[p2];
                p2++;
            }
            p++;
        }
        
        //add remainingg 
        if(p1 == L1){
            while(p2 < L2){
                array[p] = nums2[p2];
                p++;
                p2++;
            } 
        }
        if(p2 == L2){
            while(p1 < L1){
                array[p] = nums1[p1];
                p++;
                p1++;
            } 
        }
        
        double ans;
        int mid;
        int l = 0;
        int r = array.length - 1;
        // using two pointers to find middle value of merged array
        
        if(array.length % 2 == 0){
            l = (l + r) / 2;
            r = l + 1;
            ans = (Double.valueOf(array[l]) + Double.valueOf(array[r])) / 2;
        } else {
            mid = (l + r) / 2;
            ans = Double.valueOf(array[mid]);
            //return middle value of odd lenght array
        }
        
        return ans; 
    }
}