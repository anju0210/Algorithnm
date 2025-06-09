import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int n : progresses){
            stack.add(n);
        }
        
        while(!stack.isEmpty()){
            for(int i=idx; i<speeds.length; i++){
                progresses[i] += speeds[i];
            }
            
            if(progresses[idx]>=100){
                int j = idx;
                int cnt = 0;
                for(; j<progresses.length&&progresses[j]>=100; j++){
                    stack.pop();
                    cnt++;
                }
                idx = j;
                list.add(cnt);
            }
        }
        
        int answer[] = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}