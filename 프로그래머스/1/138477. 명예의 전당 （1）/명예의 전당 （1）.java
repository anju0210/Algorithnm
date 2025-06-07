import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] honor = new int[k];
        Arrays.fill(honor, 2000);
        int idx = 0;
        
        for(int i=0; i<k; i++){
            if(idx>=score.length){
                break;
            }
            honor[i] = score[idx];
            Arrays.sort(honor);
            answer[idx++] = honor[0];
        }
        
        for(int i=k; i<score.length; i++){
            for(int j=0; j<honor.length; j++){
                if(honor[j]<score[i]){
                    if(j==0){
                        honor[j] = score[i];
                        continue;
                    }
                    honor[j-1] = honor[j];
                    honor[j] = score[i];
                }
                else{
                    break;
                }
            }
            answer[idx++] = honor[0];
        }
        
        return answer;
    }
}