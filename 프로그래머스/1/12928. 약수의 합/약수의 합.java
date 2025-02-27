class Solution {
    public int solution(int n) {
        int answer = n;
        for(int i=n/2; i>0; i--)
            if(n%i==0) answer += i;
        return answer;
    }
}