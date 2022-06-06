class Solution {
    public String capitalizeTitle(String title) {
        char [] arr = title.toCharArray();
        int i = 0;
        int j = 0;
        String answer = "";
        int currLen = 0;
        
        while (j < arr.length){
            if(arr[j] != ' '){
                currLen++;
                arr[j] = Character.toLowerCase(arr[j]);
                j++;
            } else {
                if (currLen > 2){
                    arr[i] = Character.toUpperCase(arr[i]);
                }
                currLen = 0;
                i = j + 1;
                j = i;
            }
        }
        System.out.println(arr[i]);
        System.out.println(currLen);

        //last word in arr
        if (currLen > 2){
            arr[i] = Character.toUpperCase(arr[i]);
        }
        
        return String.valueOf(arr);
    }
}