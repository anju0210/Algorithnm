class Solution {
    public int solution(int n) {
        int sum, cnt = 0;
        for(int i=1; i<=n; i++){
            sum = 0;
            for(int j=i; j<=n; j++){
                sum += j;
                if(sum == n){
                    cnt++;
                    break;
                }
                else if(sum>n) break;
            }
        }
        return cnt;
    }
}