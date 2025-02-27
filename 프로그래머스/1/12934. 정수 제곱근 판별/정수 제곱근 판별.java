class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);
        return x==(int)x? (long)((x+1)*(x+1)) : -1;
    }
}