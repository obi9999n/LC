class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int num = n;
        
        //while loop to determine product and sum of digits
        while(num > 0){
            product = product * (num % 10);
            sum = sum + (num % 10);
            num = num / 10;
        }
        
        //return difference
        return product - sum;
    }
}