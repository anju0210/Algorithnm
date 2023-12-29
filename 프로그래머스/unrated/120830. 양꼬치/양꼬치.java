class Solution {
    public int solution(int n, int k) {
        k *= 2000;
        k -= 2000*(n/10);
        n *= 12000;
        return n+k;
    }
}