class Solution {
    public int arraySign(int[] nums) {
        double product = 1.0;
        for(int n: nums){
            product = product * n;
            System.out.println(product);

        }
        return signFunc(product);
    }
    
    public int signFunc(double x){
        if(x < 0){
            return -1;
        } else if(x > 0){
            return 1;
        } 
        
        return 0;
    }
}