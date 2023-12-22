class Solution {
    public int solution(int n) {
        int answer = 0;
        int p = 1;
        do{
            if((6*p)%n==0){
                answer = p;
                break;
            }
            p++;
        }while(answer == 0);
        return answer;
    }
}