class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        int poisonEnd = -1;  //value determining end of poison time
        
        for(int i = 0; i < timeSeries.length; i++){
            poisonEnd = timeSeries[i] + duration - 1;
            if(i == timeSeries.length - 1){
                time = time + duration;
            } else if(poisonEnd < timeSeries[i + 1]){
                time = time + duration;
            } else if(poisonEnd>= timeSeries[i + 1]){
                time = time + (timeSeries[i + 1] - timeSeries[i]);
            }
            
        }
        
        return time;
        
    }
}