class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, String> map = new HashMap<String,String>();
        
        for(int i = 0; i < emails.length; i++){
            String email = emails[i];
            String newEmail = fixEmail(email);
            
            if(map.containsKey(newEmail) == false) map.put(newEmail, newEmail);
        }
        
        return map.size();
         
    }
    
    public String fixEmail(String s){
        //find first part of email
        int x = 0;
        while(s.charAt(x) != '@'){
            x++;
        }
        String firstPart = s.substring(0, x);
        String secondPart = s.substring(x + 2, s.length());
        String newFirstPart = "";
        
        //first part fixed
        if(firstPart.contains(Character.toString('+'))){
            firstPart = firstPart.substring(0, firstPart.indexOf('+'));
            for(int y = 0; y < firstPart.length(); y++){
                if(firstPart.charAt(y) != '.'){
                    newFirstPart = newFirstPart + Character.toString(firstPart.charAt(y));
                }
            }
        } else {
            for(int z = 0; z < firstPart.length(); z++){
                if(firstPart.charAt(z) != '.'){
                    newFirstPart = newFirstPart + Character.toString(firstPart.charAt(z));
                }
            }
        }

        String newFixedEmail = newFirstPart + "@" + secondPart;
    
        return newFixedEmail;
    }
}