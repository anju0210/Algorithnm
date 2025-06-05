class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown+yellow;
        for(int i=1; i<=Math.sqrt(size); i++){
            if(size%i==0){
                int[] s = {i, size/i};
                if((s[0]-2)*(s[1]-2)==yellow){
                    if(s[0]<s[1]){
                        int temp = s[0];
                        s[0] = s[1];
                        s[1] = temp;
                    }
                    answer = s;   
                }
            }
        }
        return answer;
    }
}