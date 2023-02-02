class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        //Keep track of characters index. 
        //For Eg : [hlabcdefgijkmnopqrstuvwxyz], index of h is smaller than index of l.
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i), i);
        }
        
        
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int min = Math.min(words[i].length() , words[j].length());
                for(int k=0;k<min;k++){
                    //if kth letter of first word is smaller than kth of second: Possible
                    if(map.get(words[i].charAt(k)) < map.get(words[j].charAt(k))){
                        break;
                    }
                    //if  kth letter of first word is smaller than kth of second: Not Possible
                    else if(map.get(words[i].charAt(k)) > map.get(words[j].charAt(k))){
                        return false;
                    }
                    //if last char are equal but first word length > second word length
                    // Eg: ["Apple" , "App"] is wrong, correct other is ["App", "Apple"]
                    else if(k == min-1 && words[i].length() > words[j].length()){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
