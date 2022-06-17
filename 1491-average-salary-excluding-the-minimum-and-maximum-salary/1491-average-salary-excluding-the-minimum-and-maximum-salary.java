class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        
        double amt = 0.0;
        int total = 0;
        
        for(int i = 1; i < salary.length - 1; i++){
            amt = amt + 1.0;
            total = total + salary[i];
        }
        
        return Double.valueOf(Double.valueOf(total) / amt);
        
    }
}