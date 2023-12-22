class Solution {
    public int solution(int[] sides) {
        int m = (sides[0]>sides[1])? sides[0] : sides[1];
        int n = (sides[0]<sides[1])? sides[0] : sides[1];
        int answer = 0;
        for(int i=1; i<=m; i++){
            if(n+i>m) answer++;
        }
        for(int i=m+1; i<m+n; i++) answer++;
        return answer;
    }
}