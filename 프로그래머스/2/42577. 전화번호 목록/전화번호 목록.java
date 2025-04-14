import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> tel = new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++)
            tel.put(phone_book[i], phone_book[i].length());
        
        for(int i=0; i<tel.size(); i++){
            int len = tel.get(phone_book[i]);
            for(int j=0; j<len; j++){
                if(tel.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                    break;
                }
            }
            if(!answer) break;
        }
        return answer;
    }
}