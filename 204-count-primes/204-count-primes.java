class Solution {
    public int countPrimes(int n) {
        //edge case
        if(n <= 2){
            return 0;
        }
        
        boolean[] arr = new boolean[n];
        
        for(int i = 2; i <= (int) Math.sqrt(n); i++){
            if(arr[i] == false){
                for(int j = i*i; j < n; j += i){
                    arr[j] = true;
                }
            }
        }
        
        int ans = 0;
        for (int z = 2; z < arr.length; z++){
            if (arr[z] == false) ans++;
        }
        
        return ans;
    }
}