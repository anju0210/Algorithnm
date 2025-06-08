import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int oneA[] = {1, 2, 3, 4, 5};
        int twoA[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int threeA[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score[] = {0, 0, 0};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == oneA[i%oneA.length]){
                score[0]++;
            }
            if(answers[i] == twoA[i%twoA.length]){
                score[1]++;
            }
            if(answers[i] == threeA[i%threeA.length]){
                score[2]++;
            }
        }
        
        int max = Math.max(score[2], Math.max(score[1], score[0]));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            if(max==score[i]){
                list.add(i+1);
            }
        }
        
        int answer[] = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}