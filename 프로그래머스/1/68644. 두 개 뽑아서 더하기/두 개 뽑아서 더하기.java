import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int answer[] = new int[set.size()];
        int idx = 0;
        
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            answer[idx++] = it.next();
        }
        return answer;
    }
}