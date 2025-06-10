class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int i=0; i<citations.length; i++){
            int key = citations[i];
            int j = i-1;
            for(; j>=0; j--){
                if(citations[j]<=key){
                    break;
                }
                citations[j+1] = citations[j];
            }
            citations[j+1] = key;
        }
        
        for(int i=0; i<citations.length; i++){
            if(citations[i] >= citations.length-i){
                answer = citations.length-i;
                break;
            }
        }
        
        return answer;
    }
}