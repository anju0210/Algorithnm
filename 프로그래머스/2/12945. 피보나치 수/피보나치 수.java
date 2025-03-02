class Solution {
    public int solution(int n) {
        int fione = 0;
        int fitwo = 1;
        for(int i=2; i<=n; i++){
            int temp = fitwo%1234567;
            fitwo = temp + fione%1234567;
            fione = temp;
        }
        return fitwo%1234567;
    }
}