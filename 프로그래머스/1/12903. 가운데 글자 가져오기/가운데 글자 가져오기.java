class Solution {
    public String solution(String s) {
        int n = s.length()/2;
        return s.length()%2!=0? s.substring(n, n+1) : s.substring(n-1, n+1);
    }
}