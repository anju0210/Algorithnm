class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = 0;
        if(n>=10) a = n/10;
        n *= 12000;
        k *= 2000;
        k -= 2000*a;
        answer = n+k;
        return answer;
    }
}