import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine){
            if(map.containsKey(t)){
                map.replace(t, map.get(t)+1);
            }
            else{
                map.put(t, 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());  
        int amount = 0;
        for(Integer n : list){
            amount += n;
            answer++;
            if(amount>=k){
                break;
            }
        }
        
        
        return answer;
    }
}