class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        if(n%2==1){
            while(n>0){
                sum += n;
                n -= 2;
            }
        }
        else{
            while(n>0){
                sum += (n*n);
                n -= 2;
            }
        }
        answer = sum;
        return answer;
    }
}