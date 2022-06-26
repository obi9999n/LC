class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //edge case
        if (flowerbed.length == 1 && n == 1){
            if (flowerbed[0] == 0) return true;
        } else if(flowerbed.length == 1 && n == 0){
            return true;
        } else if(flowerbed.length == 1 && n >= 1){
            if(flowerbed[0] == 1) return false;
        }
        
        
        
        //loop to determine how many flowers can be placed
        for(int i = 0; i < flowerbed.length; i++){
           if(flowerbed[i] == 0){
               //detremine planted at beginning
                if(i == 0){
                    if(flowerbed[i + 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }
                } else if (i == flowerbed.length - 1) {
                    //determine planted at end
                    if(flowerbed[i - 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }

                } else if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0){
                   n--;
                   flowerbed[i] = 1;
               }
           }
            
        }
        
        if(n <= 0) return true;
        return false;
        
    }
}