import java.util.*;
class Solution {
    public int solution(int n) {
        String str = "";
        while(n>0){
            int r = n%3;
            n /= 3;
            str += r;
        }
        
        int answer = Integer.parseInt(str, 3);
        
        return answer;
    }
}