class Solution {
    public int subtractProductAndSum(int n) {
        //edge case
        if(n <= 9) return 0;
        
        //convert n to string 
        String s = String.valueOf(n);
        
        int i = s.length() - 1;
        
        int product = 1;
        int sum = 0;
        
        while(i >= 0){
            int num = Integer.valueOf(s.substring(0, i + 1));
            int remainder = num % 10;
            product = product * remainder;
            sum = sum + remainder;
            i--;
        }
        
        return product - sum;
    }
}