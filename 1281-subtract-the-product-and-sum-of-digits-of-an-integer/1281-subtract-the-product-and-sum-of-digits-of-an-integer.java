class Solution {
    public int subtractProductAndSum(int n) {
        //edge case
        if(n <= 9) return 0;
                
        int product = 1;
        int sum = 0;
        
        while(n >= 1){
            int remainder = n % 10;
            product = product * remainder;
            sum = sum + remainder;
            n = n / 10;
        }
        
        return product - sum;
    }
}