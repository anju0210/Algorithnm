import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> tel = new HashSet<>(Arrays.asList(phone_book));
        
        for(String str : tel){
            for(int i=0; i<str.length(); i++){
                if(tel.contains(str.substring(0, i))){
                    return false;
                }
            }
        }
        return true;
    }
}