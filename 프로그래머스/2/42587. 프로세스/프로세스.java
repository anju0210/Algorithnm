import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n : priorities){
            que.add(n);
        }
        
        while(!que.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(que.peek()==priorities[i]){
                    que.remove();
                    answer++;
                    if(i==location){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}