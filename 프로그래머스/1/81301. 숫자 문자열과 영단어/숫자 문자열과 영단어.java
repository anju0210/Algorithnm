import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        int n = 1;
        int endIdx = s.length();
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)<='9'){
                answer += ((int)s.charAt(i)-48)*n;
                n = n*10;
                endIdx = i;
            }
            else{
                int num = map.getOrDefault(s.substring(i, endIdx), 10);
                if(num < 10){
                    answer += num*n;
                    n = n*10;
                    endIdx = i;
                }
            }
        }
        return answer;
    }
}